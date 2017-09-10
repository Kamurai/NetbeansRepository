/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package loginsignup;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.sql.*;
import java.sql.ResultSet;

/**
 *
 * @author Kamurai
 */
@ManagedBean(name="QBean")
@RequestScoped
public class QBean
{
    private String driver;// = "org.apache.derby.jdbc.EmbeddedDriver";
    private String url;// = "jdbc:derby://localhost:1527/loginsignup";
    private String dbUsername;// = "loginsignup";
    private String dbPassword;// = "loginsignup";
    private Connection connect = null;
    private String dbName;


    /** Creates a new instance of DataBean */
    public QBean()
    {
        driver = "org.apache.derby.jdbc.EmbeddedDriver";
    }

    public Connection getConnection()
    {
        try
        {
            Class.forName(driver).newInstance();
            connect = DriverManager.getConnection(url, dbUsername, dbPassword);
        }
        catch(Exception lex)
        {
            lex.printStackTrace();
        }
        return connect;

    }

     public void closeConnection()
     {
         if(connect != null)
         {
             try
             {
                connect.close();
             }
             catch (Exception ex)
             {
                 ex.printStackTrace();
             }
         }
     }

    public String getDbName() {
        return dbName;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public void setDbName(String dbName)
    {
        this.dbName = dbName;
        url = "jdbc:derby://localhost:1527/" + this.dbName;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

     

     public ResultSet executeQueryStatement(String query)
     {
         ResultSet rs = null;
         connect = getConnection();
         try
         {
             Statement stmt = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             rs = stmt.executeQuery(query);
         }
         catch( Exception ex )
         {
             ex.printStackTrace();
         }
         

         return rs;
     }

}
