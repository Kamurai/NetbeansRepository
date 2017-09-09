/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package loginsignup;

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
    private String username;
    private String password;
    private String correctUname;
    private String correctPword;
    QueryBean qb;


    private boolean pWordValid;
    private boolean uNameValid;
    private boolean uNameUnique;


    /** Creates a new instance of DataBean */
    public SignupBean()
    {
        qb = new QueryBean();
        qb.setDbName("loginsignup");
        qb.setDbUsername("loginsignup");
        qb.setDbPassword("loginsignup");

    }

    public boolean isLoginGood()
    {
        String sqlQuery = "select * from loginsignup.userlogin " + "where username = ?";
        String[] where = {getUsername()};
        //String where = getUsername();
        System.out.println(where);
        //String sqlQuery = "select * from loginsignup.userlogin where username = 'Chris'";// + where;
        
        ResultSet rs = qb.executeQueryWhere(sqlQuery, where);
        System.out.println(sqlQuery);
        try{
            //ResultSet rs = qb.executeQueryStatement(sqlQuery);
            System.out.println(rs);
            //rs.beforeFirst();
            if (rs.next())
            {
                //entry found
                correctUname = rs.getString("USERNAME");
                System.out.println(correctUname);
                correctPword = rs.getString("PASSWORD");
                System.out.println(correctPword);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            qb.closeConnection();
        }

        if (password.equals(correctPword))
        {
            //passoword matches
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getCorrectPword() {
        return correctPword;
    }

    public void setCorrectPword(String correctPword) {
        this.correctPword = correctPword;
    }

    public String loginHandler()
    {
        boolean lg = isLoginGood();
        if(lg)
        {
            return "LoginGood";
        }
        else
        {
            return "LoginBad";
        }
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

        
    public void resetHandler()
    {
        setUsername("");
        setPassword("");
    }

    public String clearAll()
    {
        resetHandler();
        return "loginsignup";
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
            ResultSet pWordRs = qb.executeQueryWhere(sqlUname, whereP);
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
            ResultSet pWordRs = qb.executeQueryWhere(sqlUname, whereP);
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
            ResultSet uNameRs = qb.executeQueryWhere(sqlUname, whereU);
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
            ResultSet pWordRs = qb.executeQueryWhere(sqlUname, whereP);
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
