/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dr. Xu
 */
public class WriteBean {

    private String driver;
    private String url;
    private String dbName;
    private String dbUsername;
    private String dbPassword;
    private Connection connect = null;

    public WriteBean() {
        driver = "org.apache.derby.jdbc.EmbeddedDriver";
    }

    // getConnection is based on the variables above
    public Connection getConnection() {
        try {
            Class.forName(driver).newInstance();
            connect = DriverManager.getConnection(
                    url, dbUsername, dbPassword);
        } catch (Exception lex) {
            lex.printStackTrace();
        }
        return connect;
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

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
        url = "jdbc:derby://localhost:1527/" + this.dbName;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }
}
