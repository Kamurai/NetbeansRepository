/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shop;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.sql.*;
import java.sql.ResultSet;


/*
Kemerait, Christopher
CS 4520, Professor Xu
Lab 2:  SmallShop
*/


@ManagedBean(name="ManagerBean")
@SessionScoped
public class ManagerBean
{
    //database bean
    DataBean db;
    
    //customers
    ArrayList<CustomerBean> customerinfo = new ArrayList<CustomerBean>();
    ArrayList<CustomerBean> newcustomerinfo = new ArrayList<CustomerBean>();

    //usernames
    ArrayList<UserBean> usernames = new ArrayList<UserBean>();
    ArrayList<UserBean> newusernames = new ArrayList<UserBean>();

    //deletions
    ArrayList<Boolean> deletecustomer = new ArrayList<Boolean>();
    ArrayList<Boolean> deleteusername = new ArrayList<Boolean>();

    //current customer information
    int customerid;
    int loginid;
    String firstname;
    String lastname;
    String email;
    String username;
    String password;
    boolean manager;

    
    

    /** Creates a new instance of ShopBean */
    public ManagerBean()
    {
        //create a databean for queries
        db = new DataBean();

        //set customerinfo
        buildcustomers();

        //set usernames
        buildusernames();

        //default values
        customerid = 0;
        loginid = 0;
        firstname = "";
        lastname = "";
        email = "";
        username = "";
        password = "";
        manager = false;
        



    }

    
    public boolean inttobool(int n)
    {
        if(n == 1)
        {
            return true;
        }
        return false;

    }

    public int booltoint(boolean n)
    {
        if(n == true)
        {
            return 1;
        }
        return 0;

    }


    public void buildusernames()
    {
        ResultSet rs = null;

        int theLoginId = 0;
        int theCustomerId = 0;
        String theUsername = "";
        String thePassword = "";
        boolean theManager = false;
        //System.out.println("Enter exexecuteQuerySt");


        System.out.println( rs );

        try
        {
            //find all words
            String sqlWord = "SELECT * FROM BIGSHOP.USERNAMES";
            rs = db.executeQueryStatement(sqlWord);

            //count total number of words
            rs.beforeFirst();
            //int idx = 0;
            while(rs.next())
            {
                //get login id
                theLoginId = rs.getInt("LOGINID");
                //get customer id
                theCustomerId = rs.getInt("CUSTOMERID");
                //get username
                theUsername = rs.getString("USERNAME");
                //get password
                thePassword = rs.getString("PASSWORD");
                //get manager
                theManager = inttobool(rs.getInt("MANAGER"));
                usernames.add(new UserBean(theLoginId, theCustomerId, theUsername, thePassword, theManager));

                //build arraylists parrallel to usernames (manager view of information is based on usernames)
                    //running parallel creates a "foreign key" by index
                newcustomerinfo.add(new CustomerBean(0, "", "", ""));
                newusernames.add(new UserBean(0, 0, "", "", false));
                deleteusername.add(false);
                deletecustomer.add(false);
            }

            

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
    }

    public void buildcustomers()
    {
        ResultSet rs = null;

        int theCustomerId = 0;
        String theFirstName = "";
        String theLastName = "";
        String theEmail = "";
        //System.out.println("Enter exexecuteQuerySt");


        System.out.println( rs );

        try
        {
            //find all words
            String sqlWord = "SELECT * FROM BIGSHOP.CUSTOMERINFO";
            rs = db.executeQueryStatement(sqlWord);

            //count total number of words
            rs.beforeFirst();
            //int idx = 0;
            while(rs.next())
            {
                //get customer id
                theCustomerId = rs.getInt("CUSTOMERID");
                //get first name
                theFirstName = rs.getString("FIRSTNAME");
                //get last name
                theLastName = rs.getString("LASTNAME");
                //get email
                theEmail = rs.getString("EMAIL");
                customerinfo.add(new CustomerBean(theCustomerId, theFirstName, theLastName, theEmail));
                
            }



        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

    }

    public String fetchfirstname(int n)
    {
        if(n < usernames.size())
        {
            //get the customer id of the nth element of usernames
            int cid = usernames.get(n).getCustomerid();

            //walk through customerinfo
            for(int x = 0; x < customerinfo.size(); x++)
            {
                //if current customer id equals the target customer id
                if( customerinfo.get(x).getCustomerid() == cid)
                {
                    //return current customer id
                    return customerinfo.get(x).getFirstname();
                }
            }
        }

        return "";
    }

    public String fetchlastname(int n)
    {
        if (n < usernames.size()) {

            //get the customer id of the nth element of usernames
            int m = usernames.get(n).getCustomerid();

            //walk through customerinfo
            for (int x = 0; x < customerinfo.size(); x++) {
                //if current customer id equals the target customer id
                if (customerinfo.get(x).getCustomerid() == m) {
                    //return current customer id
                    return customerinfo.get(x).getLastname();
                }
            }
        }

        return "";
    }

    public String fetchemail(int n)
    {
        if (n < usernames.size())
        {
            //get the customer id of the nth element of usernames
            int m = usernames.get(n).getCustomerid();

            //walk through customerinfo
            for (int x = 0; x < customerinfo.size(); x++) {
                //if current customer id equals the target customer id
                if (customerinfo.get(x).getCustomerid() == m) {
                    //return current customer id
                    return customerinfo.get(x).getEmail();
                }
            }
        }

        return "";
    }

    


    public String fetchusername(int n)
    {
        if(n < usernames.size())
        {
            //get the customer id of the nth element of usernames
            int cid = customerinfo.get(n).getCustomerid();

            //walk through customerinfo
            for (int x = 0; x < usernames.size(); x++) {
                //if current customer id equals the target customer id
                if (usernames.get(x).getCustomerid() == cid) {
                    //return current customer id
                    return usernames.get(x).getUsername();
                }
            }
        }

        return "";
    }

    public String fetchpassword(int n)
    {
        if(n < usernames.size())
        {
            //get the customer id of the nth element of usernames
            int cid = customerinfo.get(n).getCustomerid();

            //walk through customerinfo
            for (int x = 0; x < usernames.size(); x++) {
                //if current customer id equals the target customer id
                if (usernames.get(x).getCustomerid() == cid) {
                    //return current customer id
                    return usernames.get(x).getPassword();
                }
            }
        }

        return "";
    }

    public boolean fetchmanager(int n)
    {
        if(n < usernames.size())
        {
            //get the customer id of the nth element of usernames
            int cid = customerinfo.get(n).getCustomerid();

            //walk through customerinfo
            for (int x = 0; x < usernames.size(); x++) {
                //if current customer id equals the target customer id
                if (usernames.get(x).getCustomerid() == cid) {
                    //return current customer id
                    return usernames.get(x).getManager();
                }
            }
        }

        return false;
    }


    public int getcustomersize()
    {
        int counter = 0;
        
        ResultSet rs = null;

        String theTable = "USERNAMES";

        try
        {
            //find all words


            String sqlWord = "SELECT * FROM BIGSHOP.";

            rs = db.executeQueryStatement(sqlWord + theTable);

                //count total number of words
                rs.last();
                counter = rs.getRow();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

        //count customers to be delete, along with relative usernames
            //walkthrough deletecustomers
        for(int x = 0; x < deletecustomer.size(); x++)
        {
            //if true
            if(deletecustomer.get(x))
            {
                int cid = usernames.get(x).getCustomerid();
                //walkthrough usernames
                for(int y = 0; y < usernames.size(); y++)
                {
                    //if username has the same customer id
                    if(usernames.get(y).getCustomerid() == cid)
                    {
                        //then don't allow a row to be created
                        counter--;
                    }
                }
            }
        }

        //count non-duplicate usernames to be deleted
        for(int x = 0; x < deleteusername.size(); x++)
        {
            //if not already counted by deletecustomer and marked for deletion
            if(!deletecustomer.get(x) && deleteusername.get(x))
            {
                counter--;
            }
        }
        
        return counter;
    }

    public int getusersize()
    {
        int counter = 0;
        
        //walk through usernames
        for(int x = 0; x < usernames.size(); x++)
        {
            //walk through customerinfo for each username
            for(int y = 0; y < customerinfo.size(); y++)
            {
                //if customerid for customer equals customerid for username
                if(usernames.get(x).getCustomerid() == customerinfo.get(y).getCustomerid())
                {
                    //increment
                    counter++;
                }
            }
        }
        return counter;
    }

    public int findloginidof(String u)
    {
        //walk through usernames
        for(int x = 0; x < usernames.size(); x++)
        {
            //if u matches username
            if(u.compareTo(usernames.get(x).username) == 0)
            {
                //return loginid
                return usernames.get(x).loginid;
            }
        }

        return 0;
    }

    public void updatecustomers()
    {
        String sqlstatement = "";
        int counter = 0;
        int cid = 0;
        int lid = 0;

        //deletions
            //walkthrough deletecustomer
        for(int x = 0; x < deletecustomer.size(); x++)
        {
            //if index is marked to be deleted
            if(deletecustomer.get(x))
            {
                //get the customerid from the parallel username arraylist by common index
                cid = usernames.get(x).getCustomerid();
                     //clear usernames of all entry with customerid
                        //build sql statement to remove based on customerid: delete from BIGSHOP.USERNAMES WHERE CUSTOMERID = " + Integer.toString(customerid);
                sqlstatement = "delete from BIGSHOP.USERNAMES WHERE CUSTOMERID = " + Integer.toString(cid);
                //execute statement
                db.writeTo(sqlstatement);
                //walkthrough usernames
                for(int y = 0; y < usernames.size(); y++)
                {
                    //if current customerid equals target customerid
                    if(usernames.get(y).getCustomerid() == cid)
                    {
                        //remove current entry from usernames arraylist
                        usernames.remove(y);
                        //newusernames
                        newusernames.remove(y);
                        //newcustomerinfo
                        newcustomerinfo.remove(y);
                        //deleteusername
                        deleteusername.remove(y);
                        //deletecustomer
                        deletecustomer.remove(y);
                        //remove entry y from:
                        y--;
                    }
                }

                //build sql statement to remove based on customerid: delete from BIGSHOP.CUSTOMERINFO WHERE CUSTOMERID = " + Integer.toString(customerid) + ";
                sqlstatement = "delete from BIGSHOP.CUSTOMERINFO WHERE CUSTOMERID = " + Integer.toString(cid);
                //execute statement
                db.writeTo(sqlstatement);
                //walkthrough customerinfo
                for(int y = 0; y < customerinfo.size(); y++)
                {
                    //if current customerid equals target customerid
                    if(customerinfo.get(y).getCustomerid() == cid)
                    {
                        //remove current entry from customerinfo arraylist
                        customerinfo.remove(y);
                        y--;
                    }
                }

                
            }
        }

        cid = 0;
        lid = 0;
        counter = 0;

        //walkthrough deleteusername
        for(int x = 0; x < deleteusername.size(); x++)
        {
            //if index is marked to be deleted
            if(deleteusername.get(x))
            {
                //get the loginid from the parallel username arraylist by common index
                lid = usernames.get(x).getLoginid();
                cid = usernames.get(x).getCustomerid();
                //clear usernames of the entry with loginid
                    //build sql statement to remove based on customerid: "delete from BIGSHOP.USERNAMES WHERE LOGINID = " + Integer.toString(loginid);
                    sqlstatement = "delete from BIGSHOP.USERNAMES WHERE LOGINID = " + Integer.toString(lid);
                    //execute statement
                    db.writeTo(sqlstatement);
                    //walkthrough usernames
                    for(int y = 0; y < usernames.size(); y++)
                    {
                        //if loginid equals target loginid
                        if(usernames.get(y).getLoginid() == lid)
                        {
                            //current entry from arraylist
                            usernames.remove(y);
                            y--;
                        }

                        //if customerid equals target customerid (even after deletion)
                        else if(usernames.get(y).getCustomerid() == cid)
                        {
                            counter = counter + 1;
                        }
                    }

                    //if no other usernames are found with the same customer id
                    if( counter == 0 )
                    {
                        //remove customer
                            //build sql statement to remove based on customerid: delete from BIGSHOP.CUSTOMERINFO WHERE CUSTOMERID = " + Integer.toString(customerid) + ";
                        sqlstatement = "delete from BIGSHOP.CUSTOMERINFO WHERE CUSTOMERID = " + Integer.toString(cid);
                        //execute statement
                        db.writeTo(sqlstatement);
                        //walkthrough customerinfo
                        for(int y = 0; y < customerinfo.size(); y++)
                        {
                            //if current customerid equals target customerid
                            if(customerinfo.get(y).getCustomerid() == cid)
                            {
                                //remove current entry from customerinfo arraylist
                                customerinfo.remove(y);
                                y--;
                            }
                        }
                    }

               //remove entry x from:
                    //newusernames
                    newusernames.remove(x);
                    //newcustomerinfo
                    newcustomerinfo.remove(x);
                    //deleteusername
                    deleteusername.remove(x);
                    //deletecustomer
                    deletecustomer.remove(x);
                    //x--
                    x--;
            }

        }

        lid = 0;
        cid = 0;
        counter = 0;

        //updates
            //walkthrough newcustomerinfo
        for(int x = 0; x < newcustomerinfo.size(); x++)
        {
            //if entry has information to update to database
            if( newcustomerinfo.get(x).getFirstname().compareTo("") != 0 || newcustomerinfo.get(x).getLastname().compareTo("") != 0 || newcustomerinfo.get(x).getEmail().compareTo("") != 0)
            {
                //get the target customerid from the parallel username arraylist by common index
                cid = usernames.get(x).getCustomerid();
                //update information based on customerid
                    //walkthrough customerinfo
                for(int y = 0; y < customerinfo.size(); y++)
                {
                        //if customerid equals target customerid
                    if(customerinfo.get(y).getCustomerid() == cid)
                    {
                            //sqlstatement = "update BIGSHOP.CUSTOMERINFO SET";
                            sqlstatement = "update BIGSHOP.CUSTOMERINFO SET";
                            //if firstname is not empty
                            if(newcustomerinfo.get(x).getFirstname().compareTo("") != 0)
                            {
                                //build sql statement to update based on customerid: sqlstatement += "FIRSTNAME = '" + firstname + "'";
                                sqlstatement += " FIRSTNAME = '" + newcustomerinfo.get(x).getFirstname() + "'";
                                customerinfo.get(y).setFirstname(newcustomerinfo.get(x).getFirstname());
                            }
                            //if lastname is not empty
                            if(newcustomerinfo.get(x).getLastname().compareTo("") != 0)
                            {
                                if(newcustomerinfo.get(x).getFirstname().compareTo("") != 0)
                                {
                                    sqlstatement += ",";
                                }
                                    //add to sql statement: sqlstatement += " LASTNAME = '" + lastname + "'";
                                sqlstatement += " LASTNAME = '" + newcustomerinfo.get(x).getLastname() + "'";
                                customerinfo.get(y).setLastname(newcustomerinfo.get(x).getLastname());
                            }
                            //if email is not empty
                            if(newcustomerinfo.get(x).getEmail().compareTo("") != 0)
                            {
                                if(newcustomerinfo.get(x).getFirstname().compareTo("") != 0 || newcustomerinfo.get(x).getLastname().compareTo("") != 0)
                                {
                                    sqlstatement += ",";
                                }
                                //add to sql statement: sqlstatement += " EMAIL = '" + email + "'";
                                sqlstatement += " EMAIL = '" + newcustomerinfo.get(x).getEmail() + "'";
                                customerinfo.get(y).setEmail(newcustomerinfo.get(x).getEmail());
                            }
                            //finish SQL statement: sqlstatement += " WHERE CUSTOMERID = '" + Integer.toString(customerid) + "'";
                            sqlstatement += " WHERE CUSTOMERID = '" + Integer.toString(cid) + "'";
                            //execute statement
                            db.writeTo(sqlstatement);
                    }
                }
                newcustomerinfo.get(x).setFirstname("");
                newcustomerinfo.get(x).setLastname("");
                newcustomerinfo.get(x).setEmail("");
            }
        }

        cid = 0;
        lid = 0;
        counter = 0;

        //walkthrough newusernames
        for(int x = 0; x < newusernames.size(); x++)
        {
            //if entry has information to update to database
            if (newusernames.get(x).getUsername().compareTo("") != 0 || newusernames.get(x).getPassword().compareTo("") != 0 || (newusernames.get(x).getManager() == true) );
            {
                //get the loginid from the parallel username arraylist by common index
                lid = usernames.get(x).getLoginid();
                //update information based on loginid
                //sqlstatement = "update BIGSHOP.USERNAMES SET";
                sqlstatement = "update BIGSHOP.USERNAMES SET";
                //if username is not empty
                if (newusernames.get(x).getUsername().compareTo("") != 0)
                {
                    //build sql statement to update based on customerid: sqlstatement += " FIRSTNAME = '" + firstname + "'";
                    sqlstatement += " USERNAME = '" + newusernames.get(x).getUsername() + "'";
                    usernames.get(x).setUsername(newusernames.get(x).getUsername());
                }
                //if password is not empty
                if (newusernames.get(x).getPassword().compareTo("") != 0)
                {
                    if (newusernames.get(x).getUsername().compareTo("") != 0)
                    {
                        sqlstatement += ",";
                    }
                    //add to sql statement: sqlstatement += " LASTNAME = '" + lastname + "'";
                    sqlstatement += " PASSWORD = '" + newusernames.get(x).getPassword() + "'";
                    usernames.get(x).setPassword(newusernames.get(x).getPassword());
                }
                //if manager is true
                if (newusernames.get(x).getManager() == true)
                {
                    if (newusernames.get(x).getUsername().compareTo("") != 0 || newusernames.get(x).getPassword().compareTo("") != 0)
                    {
                        sqlstatement += ",";
                    }
                    //if user is already a manager
                    if(usernames.get(x).getManager() == true)
                    {
                        //change to customer
                            //add to sql statement: sqlstatement += " MANAGER = 0;
                        sqlstatement += " MANAGER = 0";
                        usernames.get(x).setManager(false);
                    }
                    else
                    {
                        //change to manager
                            //add to sql statement: sqlstatement += " MANAGER = 0;
                        sqlstatement += " MANAGER = 1";
                        usernames.get(x).setManager(true);
                    }
                }
                //finish SQL statement: sqlstatement += " WHERE CUSTOMERID = '" + Integer.toString(customerid) + "'";
                sqlstatement += " WHERE LOGINID = " + Integer.toString(lid);
                //execute statement
                db.writeTo(sqlstatement);


                newusernames.get(x).setUsername("");
                newusernames.get(x).setPassword("");
                newusernames.get(x).setManager(false);
            }

        }

    }

    public void addincustomer(String f, String l, String e, String u, String p, boolean m)
    {
        String sqlstatement = "";
        int lid = 0;
        int cid = 0;

        //get loginid and customerid
            //build sql statement
        sqlstatement = "select * from BIGSHOP.usernames";

        ResultSet rs = db.executeQueryStatement(sqlstatement);

        try
        {
            rs.beforeFirst();

            while(rs.next())
            {
                if( rs.getString("USERNAME").compareTo(u) == 0 )
                {
                    lid = rs.getInt("loginid");
                    cid = rs.getInt("customerid");
                    //escape
                    rs.last();
                }
            }

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

        customerinfo.add(new CustomerBean(cid, f, l, e));
        usernames.add(new UserBean(lid, cid, u, p, m));

        //add to supplemental array lists
        newcustomerinfo.add(new CustomerBean(0,"","",""));
        newusernames.add(new UserBean(0, 0, "", "", false));
        deletecustomer.add(false);
        deleteusername.add(false);


    }




    public int getCustomerid() {
        return customerid;
    }

    public ArrayList<CustomerBean> getCustomerinfo() {
        return customerinfo;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getLoginid() {
        return loginid;
    }

    public boolean getManager() {
        return manager;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public ArrayList<UserBean> getUsernames() {
        return usernames;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public void setCustomerinfo(ArrayList<CustomerBean> customerinfo) {
        this.customerinfo = customerinfo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setLoginid(int loginid) {
        this.loginid = loginid;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUsernames(ArrayList<UserBean> usernames) {
        this.usernames = usernames;
    }

    public ArrayList<CustomerBean> getNewcustomerinfo() {
        return newcustomerinfo;
    }

    public ArrayList<UserBean> getNewusernames() {
        return newusernames;
    }

    
    public void setNewcustomerinfo(ArrayList<CustomerBean> newcustomerinfo) {
        this.newcustomerinfo = newcustomerinfo;
    }

    public void setNewusernames(ArrayList<UserBean> newusernames) {
        this.newusernames = newusernames;
    }

    public ArrayList<Boolean> getDeletecustomer() {
        return deletecustomer;
    }

    public ArrayList<Boolean> getDeleteusername() {
        return deleteusername;
    }

    public void setDeletecustomer(ArrayList<Boolean> deletecustomer) {
        this.deletecustomer = deletecustomer;
    }

    public void setDeleteusername(ArrayList<Boolean> deleteusername) {
        this.deleteusername = deleteusername;
    }

    /*
    public String getNewemail() {
        return newemail;
    }

    public String getNewfirstname() {
        return newfirstname;
    }

    public String getNewlastname() {
        return newlastname;
    }

    public boolean getNewmanager() {
        return newmanager;
    }

    public String getNewpassword() {
        return newpassword;
    }

    public String getNewusername() {
        return newusername;
    }

    public void setNewemail(String newemail) {
        this.newemail = newemail;
    }

    public void setNewfirstname(String newfirstname) {
        this.newfirstname = newfirstname;
    }

    public void setNewlastname(String newlastname) {
        this.newlastname = newlastname;
    }

    public void setNewmanager(boolean newmanager) {
        this.newmanager = newmanager;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    public void setNewusername(String newusername) {
        this.newusername = newusername;
    }
  */
    
    

    
}
