/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginsignup;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Dr. Xu
 */
public class QueryBean {

    private String driver;
    private String url;
    private String dbName;
    private String dbUsername;
    private String dbPassword;
    private Connection connect = null;

    public QueryBean() {
        driver = "org.apache.derby.jdbc.EmbeddedDriver";
    }

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

    public ResultSet executeQueryStatement(String query) {
        ResultSet rs = null;
        connect = getConnection();
        try {
            Statement stmt = connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(query);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return rs;
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

    public void closeConnection() {
        if (connect != null) {
            try {
                connect.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
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

