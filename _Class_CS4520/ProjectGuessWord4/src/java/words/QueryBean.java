/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package words;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.sql.*;
import java.sql.ResultSet;

/**
 *
 * @author Kamurai
 */
@ManagedBean(name="QueryBean")
@RequestScoped
public class QueryBean
{
    String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    String url = "jdbc:derby://localhost:1527/guessworddb";
    String dbUsername = "guessworddb";
    String dbPassword = "guessworddb";
    Connection connect = null;

    /** Creates a new instance of QueryBean */
    public QueryBean()
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
