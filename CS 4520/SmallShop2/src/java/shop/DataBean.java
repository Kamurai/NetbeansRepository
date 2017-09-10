/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shop;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.sql.*;
import java.sql.ResultSet;

/**
 *
 * @author Kamurai
 */
@ManagedBean(name="DataBean")
@RequestScoped
public class DataBean
{
    String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    String url = "jdbc:derby://localhost:1527/smallshop";
    String dbUsername = "smallshop";
    String dbPassword = "smallshop";
    Connection connect = null;


    /** Creates a new instance of DataBean */
    public DataBean()
    {
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
