/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DataMethods;

import java.sql.*;
import java.sql.ResultSet;

/**
 *
 * @author Kamurai
 */
public class SQLServerMethod
{
    private String driver;
    private String url;
    private String dbName;
    private String dbUsername;
    private String dbPassword;
    private Connection connect;

    private GeneralMethods Method;

    /** Creates a new instance of DataBean */
    public SQLServerMethod()
    {
        driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        //url = "jdbc:sqlserver://localhost:1433";
        url = "jdbc:sqlserver://localhost";
        dbName = ";DatabaseName=Test";
        dbUsername = "sa";
        dbPassword = "yellow23";
        connect = null;

        Method = new GeneralMethods();
    }

    public String getColorData(String rowID, int col)
    {
        connect = Method.openConnection(driver, url, dbName, dbUsername, dbPassword);
        
        if(connect == null)
        {
            return "SQL Connection Error";
        }
        
        ResultSet rs;
        String sqlStatement = "Select ";
        String result = "";
        
        if(col <= 0)
        {
            sqlStatement += "ColorIndex ";
        }
        else
        {
            sqlStatement += "Color ";
        }

        sqlStatement += "from Colors where ";        
        
        if(col <= 0)
        {
            sqlStatement += "ColorIndex ";
            sqlStatement += "= " + rowID;
        }
        else
        {
            sqlStatement += "Color ";
            sqlStatement += "= '" + rowID + "'";
        }

        
        try
        {
            rs = Method.executeStatement(connect, sqlStatement);
            
            rs.next();

            if(col <= 0)
            {
                result = rs.getString(1);
            }
            else
            {
                result = rs.getString(1);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            return "SQL Value Error";
        }
        
        Method.closeConnection(connect);
        
        return result;
    }
}
