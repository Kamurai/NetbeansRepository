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
@ManagedBean(name="LoginBean")
@RequestScoped
public class LoginBean implements Serializable
{
    private String username;
    private String password;
    private String correctUname;
    private String correctPword;
    DataBean db;

    private boolean pWordValid;
    private boolean uNameValid;
    private boolean uNameUnique;


    /** Creates a new instance of DataBean */
    public LoginBean()
    {
        db = new DataBean();
        //qb.setDbName("loginsignup");
        //qb.setDbUsername("loginsignup");
        //qb.setDbPassword("loginsignup");

    }

    public boolean isLoginGood()
    {
        //String sqlQuery = "select * from bigshop.usernames " + "where username = ?";
        //String[] where = {getUsername()};
        
        String where = getUsername();
        String sqlQuery = "select * from bigshop.usernames where username = " + "'" + where + "'";
        
        //ResultSet rs = db.executeQueryWhere(sqlQuery, where);
        ResultSet rs = db.executeQueryStatement(sqlQuery);
        try{
            rs.first();
                //entry found
                correctUname = rs.getString("USERNAME");
                System.out.println(correctUname);
                correctPword = rs.getString("PASSWORD");
                System.out.println(correctPword);
            
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            db.closeConnection();
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

    public String getCorrectPword() {
        return correctPword;
    }

    public void setCorrectPword(String correctPword) {
        this.correctPword = correctPword;
    }

    public String loginHandler()
    {
        boolean lg = isLoginGood();
        boolean ma = checkManager();

        if(lg && ma)
        {
            return "ManagerPage";
        }
        else if(lg && !ma)
        {
            return "CustomerPage";
        }
        else
        {
            return "LoginPage";
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
            //String sqlUname = "select username from usernames where username = ?";
            String sqlUname = "select username from usernames";
            //String[] whereP = {uName};
            //ResultSet pWordRs = db.executeQueryWhere(sqlUname, whereP);
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
                        uNameValid = true;
                        pWordRs.last();
                    }

                }

            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
        if (!uNameValid)
        {
            throw new ValidatorException(new FacesMessage("Username is not valid"));
        }
    }

    

    public void pWord_validator(FacesContext fc, UIComponent uic, Object obj)
    {
        pWordValid = false;
        if ((fc == null) || (uic == null))
        {
            throw new NullPointerException();
        }
        if (obj != null)
        {
            String pWord = (String) obj.toString();
            pWord = pWord.trim();
            setPassword(pWord);
            //String sqlUname = "select password from UserLogin where password = ?";
            String sqlUname = "select password from usernames";
            //String[] whereP = {pWord};
            //ResultSet pWordRs = db.executeQueryWhere(sqlUname, whereP);
            ResultSet pWordRs = db.executeQueryStatement(sqlUname);

            String test = "";
            try
            {
                pWordRs.beforeFirst();
                while( pWordRs.next() )
                {
                    test = pWordRs.getString("PASSWORD");

                    if( password.compareTo(test) == 0 )
                    {
                        pWordValid = true;
                        pWordRs.last();
                    }

                }
                
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
        if (!pWordValid)
        {
            throw new ValidatorException(new FacesMessage("Password is not valid"));
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
            String sqlUname = "select * from usernames where password = ?";
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
}
