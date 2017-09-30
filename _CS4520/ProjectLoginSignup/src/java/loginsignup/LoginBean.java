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
@ManagedBean(name="LoginBean")
@RequestScoped
public class LoginBean implements Serializable
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
    public LoginBean()
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

    public void pWord_validator(FacesContext fc, UIComponent uic, Object obj)
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
