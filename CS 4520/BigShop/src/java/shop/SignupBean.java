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

    //tool variables
    String error;


    /** Creates a new instance of DataBean */
    public SignupBean()
    {
        db = new DataBean();
        error = "";
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
            return "Shop";
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

        //check not empty
        if( getFirstName().compareTo("") == 0 || getLastName().compareTo("") == 0 || getEmail().compareTo("") == 0 || getUsername().compareTo("") == 0 || getPassword().compareTo("") == 0)
        {
            setError("Some information has been left blank.");
            return false;
        }
        //validate first
            //email
        if(!validateemail())
        {
            setError("Email should have xxx@yyy.zzz format.");
            return false;
        }

        //username
        if(!validateusername())
        {
            setError("Username is taken.");
            return false;
        }




        //INSERT INTO CustomerInfo (customerid, firstname, lastname, email) VALUES
        //(1, 'Masom', 'Hamadeh', 'Masom@Hamadeh'),

        //INSERT INTO Usernames (loginid, customerid, username, password, manager) VALUES
        //(1, 1, 'BigMase', 'masom', 1),
        boolean trip = true;
        int count = 0;
        //set sql statement for getting information based on first and last name
        String data = "select * from bigshop.CustomerInfo where FIRSTNAME = " + "'" + getFirstName() + "' and LASTNAME = '" + getLastName() + "' and EMAIL = '" + getEmail() + "'";
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
            //get next available customerid
            count = db.getnextavailableid("CustomerInfo", "customerid");
            //set sql statement for inserting a new customer into customerinfo data table
            data = "INSERT INTO BIGSHOP.CustomerInfo (customerid, firstname, lastname, email) VALUES (";
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
           int second = db.getnextavailableid("Usernames", "loginid");
           //set data to insert new user into username table
           data = "INSERT INTO BIGSHOP.Usernames (loginid, customerid, username, password, manager) VALUES (";
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

    public boolean validateemail()
    {
        if (email.compareTo("") != 0)
        {
            // Check at-sign and white-space usage
            int atSign = email.indexOf('@');
            if (atSign == -1
                || atSign ==0
                || atSign == email.length() - 1
                || email.indexOf('@', atSign + 1) != -1
                || email.indexOf(' ') != -1
                || email.indexOf('\t') != -1
                || email.indexOf('\n') != -1
                || email.indexOf('\r') != -1
                )
            {
                return false;
            }

            //email = email.substring(atSign + 1);
            int dot = email.indexOf('.');
            if (dot == -1
                    || dot == 0
                    || dot == email.length() - 1)
            {
                return false;
            }
        
            return true;
        }
        return false;
    }
    
    public boolean validateusername()
    {
        boolean trip = true;

        if (username.compareTo("") != 0)
        {
            String sqlUname = "select username from BIGSHOP.usernames";

            ResultSet pWordRs = db.executeQueryStatement(sqlUname);

            String test = "";

            try
            {
                pWordRs.beforeFirst();
                while( pWordRs.next() )
                {
                    test = pWordRs.getString("USERNAME");

                    if( username.compareTo(test) == 0 )
                    {
                        trip = false;
                        pWordRs.last();
                    }

                }

            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }

        return trip;
    }
    
    
    
    

    

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }




}
