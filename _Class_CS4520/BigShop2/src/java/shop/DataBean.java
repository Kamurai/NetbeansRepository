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
    private String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    private String url = "jdbc:derby://localhost:1527/";
    private String dbName = "bigshop";
    private String dbUsername = "bigshop";
    private String dbPassword = "bigshop";
    private Connection connect = null;


    /** Creates a new instance of DataBean */
    public DataBean()
    {
        driver = "org.apache.derby.jdbc.EmbeddedDriver";
        url = "jdbc:derby://localhost:1527/";
        dbName = "bigshop";
        dbUsername = "bigshop";
        dbPassword = "bigshop";
        connect = null;

    }

    public Connection getConnection()
    {
        try
        {
            Class.forName(driver).newInstance();
            connect = DriverManager.getConnection((url+dbName), dbUsername, dbPassword);
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
     
     public void writeTo(String insert)
     {
         connect = getConnection();
         try
         {
             Statement stmt = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             stmt.executeUpdate(insert);
         }
         catch( Exception ex )
         {
             ex.printStackTrace();
         }
         

         
     }

     public int gettablecount(String tableName)
    {

        ResultSet rs = null;

        int rowCount = 0;


        try
        {
            //find all words
            String sqlWord = "SELECT * FROM BIGSHOP." + tableName;
            rs = executeQueryStatement(sqlWord);

            //count total number of words
            rs.last();
            rowCount = rs.getRow();

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }



        return rowCount;
    }

     // a generic insertion method. the tableName is the destination
    // table; the info contains all info that need to be inserted
    // in to table. e.g., for the table userLogin, info contains
    // loginid, username, password. You can find them from db table
    public Boolean executeInsertStatement(String tableName, String[] info) {
        PreparedStatement sqlInsert = null;
        boolean done = false;
        if (tableName == null || tableName.equals("")) {
            return done;
        }
        connect = getConnection();
        try {
            // get rhe ResultSet and its ResultSetMetaData
            Statement stm = connect.createStatement();
            ResultSet rst =
                    stm.executeQuery("select * from " + tableName);
            ResultSetMetaData rsmd = rst.getMetaData();
            int num = rsmd.getColumnCount();

            // make the insert statement:
            // insertStr = "INSERT INTO table (loginid, username, password)
            // VALUES (?, ?, ?)"
            // sqlInsert = connect.prepareStatement(insertStr);
            // sqlInsert.setString(1, "12"); ...
            String columnNames = "";
            String questionMarks = "";
            for (int i = 1; i <= num; i++) {
                columnNames += rsmd.getColumnName(i);
                if (i < num) {
                    columnNames += ", ";
                }
                questionMarks += "?";
                if (i < num) {
                    questionMarks += ", ";
                }
            }
            String insertStr =
                    "INSERT INTO " + tableName + "("
                    + columnNames + ")"
                    + "VALUES (" + questionMarks + ")";
            sqlInsert = connect.prepareStatement(insertStr);
            for (int j = 0; j < num; j++) {
                sqlInsert.setString((j + 1), info[j]);
            }
            int numOfRows = sqlInsert.executeUpdate();

            // make sure whether insertion is successful
            if (numOfRows == 0) {
                connect.rollback();
            } else {
                connect.commit();
                done = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            try {
                connect.rollback();
            } catch (Exception exp) {
                exp.printStackTrace();
            }
            return false;
        } finally {
            try {
                if (sqlInsert != null) {
                    sqlInsert.close();
                }
                if (connect != null) {
                    connect.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return done;
    }

     public ResultSet executeQueryWhere(String sqlQuery, String[] where) {
        ResultSet rs = null;
        connect = getConnection();
        try {
            PreparedStatement ps = connect.prepareStatement(sqlQuery);
            for (int i = 0; i < where.length; i++) {
                ps.setString((i+1), where[i]);
            }
            rs = ps.executeQuery();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return rs;
    }

}
