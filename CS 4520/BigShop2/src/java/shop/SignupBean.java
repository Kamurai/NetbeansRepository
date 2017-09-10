/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shop;

import java.io.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.sql.ResultSet;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;

import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Kamurai
 */
@ManagedBean(name="SignupBean")
@RequestScoped
public class SignupBean implements Serializable
{
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    DataBean db;


    private boolean pWordValid;
    private boolean uNameValid;
    private boolean uNameUnique;


    /** Creates a new instance of DataBean */
    public SignupBean()
    {
        db = new DataBean();
        //db.setDbName("loginsignup");
        //db.setDbUsername("loginsignup");
        //db.setDbPassword("loginsignup");
        resetHandler();
    }

    

    
    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String signupHandler()
    {


        boolean sg = isSignupGood();
        boolean ma = checkManager();

        if(sg && ma)
        {
            return "ManagerPage";
        }
        else if(sg && !ma)
        {
            return "CustomerPage";
        }
        else
        {
            return "LoginPage";
        }
    }

    public void resetHandler()
    {
        setFirstName("");
        setLastName("");
        setEmail("");
        setUsername("");
        setPassword("");
    }

    public String clearAll()
    {
        resetHandler();
        return "loginsignup";
    }

    public boolean isSignupGood()
    {
        //INSERT INTO CustomerInfo (customerid, firstname, lastname, email) VALUES
        //(1, 'Masom', 'Hamadeh', 'Masom@Hamadeh'),

        //INSERT INTO Usernames (loginid, customerid, username, password, manager) VALUES
        //(1, 1, 'BigMase', 'masom', 1),
        boolean trip = true;
        int count = 0;
        //set sql statement for getting information based on first and last name
        String data = "select * from bigshop.CustomerInfo where FIRSTNAME = " + "'" + getFirstName() + "' and LASTNAME = "+ "'" + getLastName() + "'";
        ResultSet rs = db.executeQueryStatement(data);

        try
        {
            rs.first();
                //entry found
                    //get cusomterid for existing customer
                count = rs.getInt("CUSTOMERID");
        }
        catch (Exception ex)
        {
            //get new customerid (tablecount + 1)
            count = db.gettablecount("CustomerInfo") + 1;
            //set sql statement for inserting a new customer into customerinfo data table
            data = "INSERT INTO CustomerInfo (customerid, firstname, lastname, email) VALUES (";
            data += Integer.toString(count) + ", '" + firstName + "', '" + lastName + "', '" + email + "')";
            trip = false;
            

        
        }
        finally
        {
            db.closeConnection();
        }

        //if there needs to be a new customer
        if( trip == false)
        {
            try
            {
                //insert new custmor
                db.writeTo(data);
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        
         
        try
        {

           //get new loginid (tablecount + 1)
           int second = db.gettablecount("Usernames") + 1;
           //set data to insert new user into username table
           data = "INSERT INTO Usernames (loginid, customerid, username, password, manager) VALUES (";
           data += Integer.toString(second) + ", " + Integer.toString(count) + ", '" + username + "', '" + password + "', " + Integer.toString(0) + ")";

           //insert new customer
           db.writeTo(data);

           return true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            db.closeConnection();
        }

        return false;
    }

    public boolean checkManager()
    {
        String where = getUsername();
        String sqlQuery = "select * from bigshop.usernames where username = " + "'" + where + "'";
        int check = 0;
        ResultSet rs = db.executeQueryStatement(sqlQuery);
        try
        {
            rs.first();
                //entry found
                check = rs.getInt("MANAGER");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            db.closeConnection();
        }

        if (check == 1)
        {
            //username has manager status
            return true;
        }
        else
        {
            return false;
        }
    }

    public void emailAddrTF_validate(FacesContext fc, UIComponent uic, Object o)
    {
        boolean emailValid = true;
        if((fc== null) || (uic == null))
        {
            throw new NullPointerException();
        }
        if (o != null)
        {
            String emailLoc = (String) o.toString();
            emailLoc = emailLoc.trim();
            // Check at-sign and white-space usage
            int atSign = emailLoc.indexOf('@');
            if (atSign == -1
                || atSign ==0
                || atSign == emailLoc.length() - 1
                || emailLoc.indexOf('@', atSign + 1) != -1
                || emailLoc.indexOf(' ') != -1
                || emailLoc.indexOf('\t') != -1
                || emailLoc.indexOf('\n') != -1
                || emailLoc.indexOf('\r') != -1
                )
            {
                emailValid = false;
            }
            //Check doc usage
            if (emailValid)
            {
                emailLoc = emailLoc.substring(atSign + 1);
                int dot = emailLoc.indexOf('.');
                if (dot == -1
                        || dot == 0
                        || dot == emailLoc.length() - 1)
                {
                    emailValid = false;
                }
            }
            if (!emailValid)
            {
                //info("Email format invalid. Enter user@domain.edu");
                throw new ValidatorException(new FacesMessage("Format: user@domain.com'"));
            }
        }
    }
    
    public void uName_validator(FacesContext fc, UIComponent uic, Object obj)
    {
        uNameValid = false;
        if ((fc == null) || (uic == null))
        {
            throw new NullPointerException();
        }
        if (obj != null)
        {
            String uName = (String) obj.toString();
            uName = uName.trim();
            //get the inputted username and call setUsername()
            //without this step, the variable username will be null
            // so that the login_validator won't work fine
            setUsername(uName);
            String sqlUname = "select username from UserLogin where username = ?";
            String[] whereP = {uName};
            ResultSet pWordRs = db.executeQueryWhere(sqlUname, whereP);
            try
            {
                if (pWordRs.next())
                {
                    uNameValid = true;
                }
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }
    
    //validate the entire login
    public void login_validator(FacesContext fc, UIComponent uic, Object obj)
    {
        //uNameValid = false;
        pWordValid = false;
        if ((fc == null) || (uic == null))
        {
            throw new NullPointerException();
        }
        if (obj != null)
        {
            String pWord = (String) obj.toString();
            pWord = pWord.trim();
            String sqlUname = "select * from UserLogin where password = ?";
            String[] whereP = {pWord};
            ResultSet pWordRs = db.executeQueryWhere(sqlUname, whereP);
            try
            {
                if (pWordRs.next())
                {
                    pWordValid = true;
                    if ((pWordRs.getString("username")).equals(getUsername()))
                    {
                        uNameValid = true;
                    }
                }
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
        if ((!uNameValid) || (!pWordValid))
        {
            throw new ValidatorException(new FacesMessage("Login is not valid"));
        }
    }
    
    public void uNameUnique_validator(FacesContext fc, UIComponent uic, Object obj)
    {
        uNameUnique = false;
        if ((fc == null) || (uic == null))
        {
            throw new NullPointerException();
        }
        if (obj != null)
        {
            String uName = (String) obj.toString();
            uName = uName.trim();
            String sqlUname = "select username from UserLogin where username = ?";
            String [] whereU = {uName};
            ResultSet uNameRs = db.executeQueryWhere(sqlUname, whereU);
            try
            {
                if (!uNameRs.next())
                {
                    uNameUnique = true;
                }
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
        if (!uNameUnique)
        {
            throw new ValidatorException(new FacesMessage("Username is not unique"));
        }
    
    }

    public void pWordValid_validator(FacesContext fc, UIComponent uic, Object obj)
    {
        boolean pWordUnique = false;
        if ((fc == null) || (uic == null))
        {
            throw new NullPointerException();
        }
        if (obj != null)
        {
            String pWord = (String) obj.toString();
            pWord = pWord.trim();
            String sqlUname = "select password from UserLogin where password = ?";
            String[] whereP = {pWord};
            ResultSet pWordRs = db.executeQueryWhere(sqlUname, whereP);
            try
            {
                if (!pWordRs.next())
                {
                    pWordUnique = true;
                }
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
        if (!pWordUnique)
        {
            throw new ValidatorException(new FacesMessage("Password is not valid"));
        }

    }



}
