/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shop;

import java.io.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.sql.ResultSet;

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

    
    //tool variables
    String error;


    /** Creates a new instance of DataBean */
    public LoginBean()
    {
        db = new DataBean();
        username = "";
        password = "";
        correctUname = "";
        correctPword = "";
        error = "";
        //qb.setDbName("loginsignup");
        //qb.setDbUsername("loginsignup");
        //qb.setDbPassword("loginsignup");

    }

    public boolean isLoginGood()
    {
        //String sqlQuery = "select * from bigshop.usernames " + "where username = ?";
        //String[] where = {getUsername()};
        //validate username
        boolean trip = validateusername();

        //String where = getUsername();

        if(trip)
        {
            String sqlQuery = "select * from bigshop.usernames where username = " + "'" + username + "'";
        
            //ResultSet rs = db.executeQueryWhere(sqlQuery, where);
            ResultSet rs = db.executeQueryStatement(sqlQuery);
            try{
                rs.first();
                    //entry found
                    correctUname = rs.getString("USERNAME");
                    //System.out.println(correctUname);
                    correctPword = rs.getString("PASSWORD");
                    //System.out.println(correctPword);
            
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
            finally
            {
                db.closeConnection();
            }
        }
        else
        {
            //do not set error message when blank
            if( getUsername().compareTo("") != 0)
            {
                setError("Invalid Username");
            }
            setUsername("");
            setPassword("");
            return false;
        }

        //verify password is correct
        if (password.equals(correctPword))
        {
            //passoword matches
            return true;
        }
        else
        {
            if( getPassword().compareTo("") != 0)
            {
                setError("Incorrect Password");
            }
            return false;
        }


    }

    public boolean validateusername()
    {
            String sqlstatement = "select username from BIGSHOP.usernames";
            ResultSet pWordRs = db.executeQueryStatement(sqlstatement);

            String test = "";

            try
            {
                pWordRs.beforeFirst();
                //walk through table
                while( pWordRs.next() )
                {
                    test = pWordRs.getString("USERNAME");
                    //if current username is submitted username
                    if( username.compareTo(test) == 0)
                    {
                        //mark true
                        return true;
                        
                    }

                }

            }
            catch (Exception ex)
            {
                ex.printStackTrace();
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

    public boolean isManagerGood()
    {
        if( isLoginGood() && checkManager() )
        {
            return true;
        }
        return false;
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
            return "Shop";
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

    

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }



}
