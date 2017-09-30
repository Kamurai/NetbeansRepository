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


@ManagedBean(name="InventoryBean")
@SessionScoped
public class InventoryBean
{
    //database bean
    DataBean db;
    
    //products
    ArrayList<ProductBean> info = new ArrayList<ProductBean>();
    ArrayList<ProductBean> newproducts = new ArrayList<ProductBean>();

    //deletions
    ArrayList<Boolean> deleteproduct = new ArrayList<Boolean>();

    //tables
    ArrayList<String> tables = new ArrayList<String>();

    //current product information
    int productid;
    String productname;
    String productprice;
    String productinventory;
    String producttable;
    String productpicture;
    String productdescription;

    int size;

    //tool variables
    String total;
    String error;

    

    /** Creates a new instance of ShopBean */
    public InventoryBean()
    {
        //create a databean for queries
        db = new DataBean();

        //default values
        productid = 0;
        productname = "";
        productprice = "";
        productinventory = "";
        producttable = "";
        productpicture = "";

        total = "0";
        error = "";

        //get tables
        starttables();

        
        //set names and prices for products
        buildinfo();

        //determine size of database
        //size = getcount();
        size = info.size();





    }

    public void starttables()
    {
        
        ResultSet rs = null;


        //build tables properly
        try
            {
                //find all words
                String sqlWord = "SELECT * FROM BIGSHOP.TABLENAMES";
                rs = db.executeQueryStatement(sqlWord);

                //goto last
                rs.last();
                //get rowcount
                int tablesize = rs.getRow();

                //count total number of words
                rs.beforeFirst();

                //walkthrough tablenames from database
                for(int x = 0; x < tablesize; x++)
                {
                    //goto new row
                    rs.next();

                    tables.add(rs.getString("TABLENAME"));
                }



            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
    }

    public int getcount()
    {

        ResultSet rs = null;

        int rowCount = 0;

        String theTable = "";

        try
        {
            //find all words


            String sqlWord = "SELECT * FROM BIGSHOP.";

            for(int x = 0; x < tables.size(); x++)
            {
                theTable = tables.get(x);
                rs = db.executeQueryStatement(sqlWord + theTable);

                //count total number of words
                rs.last();
                rowCount += rs.getRow();
            }
            

            //count products to be deleted
            for (int x = 0; x < deleteproduct.size(); x++)
            {
                //if marked for deletion
                if(deleteproduct.get(x))
                {
                    rowCount--;
                }

            }

        } 
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        


        return rowCount;
    }



    public void buildinfo()
    {
        ResultSet rs = null;

        int theProductId = 0;
        String theName = "";
        String thePrice = "";
        String theInventory = "";
        String thePicture = "";
        String theTable = "";
        String theDescription = "";
        //System.out.println("Enter exexecuteQuerySt");


        

        //walkthrough product tables
        for (int x = 0; x < tables.size(); x++)
        {
            try
            {
                theTable = tables.get(x);
                //find all words
                String sqlWord = "SELECT * FROM BIGSHOP." + theTable;
                rs = db.executeQueryStatement(sqlWord);

                //count total number of words
                rs.beforeFirst();
                //int idx = 0;
                while (rs.next())
                {
                    //get product id
                    theProductId = rs.getInt("PRODUCTID");
                    //get name
                    theName = rs.getString("PRODUCTNAME");
                    //get price
                    //thePrice = d"$" + Double.toString(rs.getDouble("PRODUCTPRICE"));
                    thePrice = String.format("$%.2f", rs.getDouble("PRODUCTPRICE"));
                    //get inventory
                    theInventory = Integer.toString(rs.getInt("Inventory"));
                    thePicture = rs.getString("PICTURE");
                    theDescription = rs.getString("DESCRIPTION");
                    info.add(new ProductBean(theProductId, theName, thePrice, "0", theInventory, "0", thePicture, theTable, theDescription));
                    newproducts.add(new ProductBean(0, "", "", "", "", "", "", "", ""));
                    deleteproduct.add(false);

                }



            } 
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
        
    }
    
    public void resetamounts()
    {

        int count = getSize();


        //walkthrough database
        for( int x = 0; x < count; x++)
        {
            //set amounts to 0
            info.get(x).setAmount("0");
        }


    }

    public String total()
    {
        double num = 0;
        double run = 0;

        //ensure all inputs were valid
        cleanse();

        //ensure that no more than available product is being requested
        reduceoverage();


        for(int x = 0; x < getSize(); x++)
        {
            num = Integer.parseInt(info.get(x).getAmount()) * mod(info.get(x).getPrice());
            info.get(x).setSubtotal(String.format("$%.2f", num));
            run += num;
        }//String.format("$%.2f", rs.getDouble("PRODUCTPRICE"));

        setTotal(String.format("$%.2f", run));

        //go to order page
        return "cart";
    }

    public void cleanse()
    {
        //walkthrough amount
        for(int x = 0; x < getSize(); x++)
        {
            //if amount requested contains a character that is not a number 0-9
            if(checkit(info.get(x).getAmount()) == false)
            {
                info.get(x).setAmount("0");
            }
        }


    }

    public double mod(String target)
    {
        if(target.compareTo("") == 0)
        {
            return 0.00;
        }

        
        //if target is already modded
        if(target.charAt(0) == '$')
        {
            return Double.parseDouble(target.substring(1));
        }

        return Double.parseDouble(target);
        
    }


    public void reduceoverage()
    {
        //walkthrough amount
        for(int x = 0; x < getSize(); x++)
        {
            //if amount requested is more than inventory
            if( Integer.parseInt(info.get(x).getAmount()) > Integer.parseInt( info.get(x).getInventory() ) )
            {
                info.get(x).setAmount(info.get(x).getInventory());
            }
        }
    }

    public boolean checkit(String target)
    {
        boolean flag = true;

        if(target.compareTo("") == 0)
        {
            return false;
        }

        //walkthrough string
        for(int x = 0; x < target.length(); x++)
        {
            //if current character is not a number 0-9
            if( target.charAt(x) == '0' )
            {
                flag = true;
            }
            else if( target.charAt(x) == '1' )
            {
                flag = true;
            }
            else if( target.charAt(x) == '2' )
            {
                flag = true;
            }
            else if( target.charAt(x) == '3' )
            {
                flag = true;
            }
            else if( target.charAt(x) == '4' )
            {
                flag = true;
            }
            else if( target.charAt(x) == '5' )
            {
                flag = true;
            }
            else if( target.charAt(x) == '6' )
            {
                flag = true;
            }
            else if( target.charAt(x) == '7' )
            {
                flag = true;
            }
            else if( target.charAt(x) == '8' )
            {
                flag = true;
            }
            else if( target.charAt(x) == '9' )
            {
                flag = true;
            }
            else
            {
                return false;
            }
        }

        return flag;
    }

    public boolean validateprice(String target)
    {
        boolean flag = true;

        if(target.compareTo("") == 0)
        {
            return false;
        }
        //walkthrough string
        for(int x = 0; x < target.length(); x++)
        {
            //if current character is not a number 0-9
            if( target.charAt(x) == '0' )
            {
                flag = true;
            }
            else if( target.charAt(x) == '1' )
            {
                flag = true;
            }
            else if( target.charAt(x) == '2' )
            {
                flag = true;
            }
            else if( target.charAt(x) == '3' )
            {
                flag = true;
            }
            else if( target.charAt(x) == '4' )
            {
                flag = true;
            }
            else if( target.charAt(x) == '5' )
            {
                flag = true;
            }
            else if( target.charAt(x) == '6' )
            {
                flag = true;
            }
            else if( target.charAt(x) == '7' )
            {
                flag = true;
            }
            else if( target.charAt(x) == '8' )
            {
                flag = true;
            }
            else if( target.charAt(x) == '9' )
            {
                flag = true;
            }
            else if( target.charAt(x) == '.' )
            {
                flag = true;
            }
            else
            {
                return false;
            }
        }

        return flag;
    }

    

    public int findproductidof(String u)
    {
        //walk through usernames
        for(int x = 0; x < info.size(); x++)
        {
            //if u matches username
            if(u.compareTo(info.get(x).name) == 0)
            {
                //return loginid
                return info.get(x).productid;
            }
        }

        return 0;
    }

    public boolean determinetable(String table)
    {
        ResultSet rs = db.executeQueryStatement("select * from BIGSHOP." + table);

        if(rs == null)
        {
            return false;
        }
        return true;
    }

    public boolean verifytable(String theTable)
    {
        for(int x = 0; x < tables.size(); x++)
        {
            if(tables.get(x).compareTo(theTable.toUpperCase()) == 0)
            {
                return true;
            }
        }

        return false;
    }
    
    public void createtable(String tid, String table)
    {
        try
        {
            db.writeTo("Create Table " + table + "(productid INTEGER PRIMARY KEY, productname VARCHAR (40) NOT NULL, productprice DOUBLE NOT NULL, inventory INTEGER, picture VARCHAR (100) NOT NULL, description VARCHAR (1000))");
            tables.add(table);
            db.writeTo("INSERT INTO BIGSHOP.TABLENAMES (TABLENAME) VALUES (" + tid + ", '" + table + "')");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

    }

    public String updateproducts()
    {
        String sqlstatement = "";

        //deletions
            //walkthrough deleteproduct
        for(int x = 0; x < deleteproduct.size(); x++)
        {
            //if index is marked to be deleted
            if(deleteproduct.get(x))
            {
                //get the productid from the parallel info arraylist by common index
                //clear info of all entry with productid
                    //build sql statement to remove based on productid: delete from BIGSHOP." + info.get(x).getTable() + " WHERE CUSTOMERID = " + Integer.toString(customerid);
                sqlstatement = "delete from BIGSHOP." + info.get(x).getTable() + " WHERE PRODUCTID = " + info.get(x).getProductid();
                //execute statement
                db.writeTo(sqlstatement);

                //determine if deleted item is the last item in category
                if(determinecount(info.get(x).getTable()) == 1)
                {
                    setProducttable(info.get(x).getTable());
                    deletetable();
                }


                //remove current entry from usernames arraylist
                info.remove(x);
                //remove parallel entries in subsequent arraylists
                newproducts.remove(x);
                deleteproduct.remove(x);
                x--;
            }
        }

        //updates
            //walkthrough newproducts
        for(int x = 0; x < newproducts.size(); x++)
        {
            //if entry has information to update to database
            if( newproducts.get(x).getPicture().compareTo("") != 0 || newproducts.get(x).getName().compareTo("") != 0 || newproducts.get(x).getPrice().compareTo("") != 0 || newproducts.get(x).getInventory().compareTo("") != 0 || newproducts.get(x).getTable().compareTo("") != 0 || newproducts.get(x).getDescription().compareTo("") != 0 || !validateproductname(newproducts.get(x).getName(), newproducts.get(x).getTable()) || !checkit(newproducts.get(x).getInventory()) || !checkit(Double.toString(mod(newproducts.get(x).getPrice()))))
            {
                //determine if current table does not exist
                if(!determinetable(newproducts.get(x).getTable()) && newproducts.get(x).getTable().compareTo("") != 0)
                {
                    //create table
                    createtable(Integer.toString(db.getnextavailableid("TABLENAMES", "TABLEID")), newproducts.get(x).getTable());
                }


                if( newproducts.get(x).getPicture().compareTo("") != 0 || newproducts.get(x).getName().compareTo("") != 0 || newproducts.get(x).getPrice().compareTo("") != 0 || newproducts.get(x).getInventory().compareTo("") != 0 || newproducts.get(x).getDescription().compareTo("") != 0)
                {

                //get the productid from the parallel username arraylist by common index
                    //update information based on productid
                        //sqlstatement = "update BIGSHOP." + info.get(x).getTable() + " SET";
                sqlstatement = "update BIGSHOP." + info.get(x).getTable() + " SET";
                //if picture is not empty
                if (newproducts.get(x).getPicture().compareTo("") != 0)
                {
                    //build sql statement to update based on customerid: sqlstatement += " PICTURE = '" + picture + "'";
                    sqlstatement += " PICTURE = '" + newproducts.get(x).getPicture() + "'";
                    info.get(x).setPicture(newproducts.get(x).getPicture());
                }
                //if name is not empty
                if (newproducts.get(x).getName().compareTo("") != 0)
                {
                    if (newproducts.get(x).getPicture().compareTo("") != 0)
                    {
                        sqlstatement += ",";
                    }
                    //add to sql statement: sqlstatement += " PRODUCTNAME = '" + name + "'";
                    sqlstatement += " PRODUCTNAME = '" + newproducts.get(x).getName() + "'";
                    info.get(x).setName(newproducts.get(x).getName());
                }
                //if price is not empty
                if (newproducts.get(x).getPrice().compareTo("") != 0)
                {
                    if (newproducts.get(x).getPicture().compareTo("") != 0 || newproducts.get(x).getName().compareTo("") != 0)
                    {
                        sqlstatement += ",";
                    }
                    //add to sql statement: sqlstatement += " PRODUCTPRICE = '" + price + "'";
                    sqlstatement += " PRODUCTPRICE = '" + newproducts.get(x).getPrice() + "'";
                    info.get(x).setPrice(newproducts.get(x).getPrice());
                }
                //if inventory is not empty
                if (newproducts.get(x).getInventory().compareTo("") != 0)
                {
                    if (newproducts.get(x).getPicture().compareTo("") != 0 || newproducts.get(x).getName().compareTo("") != 0 || newproducts.get(x).getPrice().compareTo("") != 0)
                    {
                        sqlstatement += ",";
                    }
                    //add to sql statement: sqlstatement += " INVENTORY = '" + inventory + "'";
                    sqlstatement += " INVENTORY = '" + newproducts.get(x).getInventory() + "'";
                    info.get(x).setInventory(newproducts.get(x).getInventory());
                }
                //if description is not empty
                if (newproducts.get(x).getDescription().compareTo("") != 0)
                {
                    if (newproducts.get(x).getPicture().compareTo("") != 0 || newproducts.get(x).getName().compareTo("") != 0 || newproducts.get(x).getPrice().compareTo("") != 0 || newproducts.get(x).getInventory().compareTo("") != 0)
                    {
                        sqlstatement += ",";
                    }
                    //add to sql statement: sqlstatement += " DESCRIPTION = '" + description + "'";
                    sqlstatement += " DESCRIPTION = '" + newproducts.get(x).getDescription() + "'";
                    info.get(x).setDescription(newproducts.get(x).getDescription());
                }
                
                //finish SQL statement: sqlstatement += " WHERE PRODUCTID = '" + Integer.toString(productid) + "'";
                sqlstatement += " WHERE PRODUCTID = " + Integer.toString(info.get(x).getProductid());
                //execute statement
                db.writeTo(sqlstatement);

                }

                
                //if table is not empty
                if (newproducts.get(x).getTable().compareTo("") != 0 && newproducts.get(x).getTable().compareTo(info.get(x).getTable()) != 0)
                {
                    //transfer information to new locations

                    //create new product
                    setProductpicture(info.get(x).getPicture());
                    setProductname(info.get(x).getName());
                    setProductprice(info.get(x).getPrice());
                    setProductinventory(info.get(x).getInventory());
                    setProductdescription(info.get(x).getDescription());
                    setProducttable(newproducts.get(x).getTable());

                    createproduct();

                    //delete old product
                    deleteproduct.set(x, true);
                    updateproducts();

                }
                else
                {
                    newproducts.get(x).setPicture("");
                    newproducts.get(x).setName("");
                    newproducts.get(x).setPrice("");
                    newproducts.get(x).setInventory("");
                    newproducts.get(x).setTable("");
                    newproducts.get(x).setDescription("");
                }
            }

        }

        size = info.size();

        return "ManagerPage";
    }

    public int determinecount(String theTable)
    {

        int counter = 0;

        for(int x = 0; x < info.size(); x++)
        {
            if(info.get(x).getTable().compareTo(theTable) == 0)
            {
                counter++;
            }
        }

        return counter;
    }

    public String createproduct()
    {
        String theTable = getProducttable();
        //check not empty
        if( getProductname().compareTo("") == 0 || getProductprice().compareTo("") == 0 || getProductinventory().compareTo("") == 0 || getProductpicture().compareTo("") == 0 || getProductdescription().compareTo("") == 0 || getProducttable().compareTo("") == 0)
        {
            setError("Some information has been left blank.");
            //return false;
            return "ManagerPage";
        }

        //validate first
            //productname
        if(!validateproductname(getProductname(), theTable))
        {
            setError("Product name is taken.");
            //return false;
            return "ManagerPage";
        }
        //inventory
        if(!checkit(getProductinventory()))
        {
            setError("Improper inventory.");
            //return false
            return "ManagerPage";
        }
        //price
        if(!validateprice(Double.toString(mod(getProductprice()))))
        {
            setError("Improper price.");
            //return false
            return "ManagerPage";
        }
        //INSERT INTO theTable (productid, name, lastname, email) VALUES
        //(1, 'Masom', 'Hamadeh', 'Masom@Hamadeh'),

        int count = 0;
        String data = "";

        if(!verifytable(theTable))
        {
            data = "CREATE TABLE " + theTable + " ( productid INTEGER PRIMARY KEY, productname VARCHAR (40) NOT NULL, productprice DOUBLE NOT NULL, inventory INTEGER, picture VARCHAR (100) NOT NULL, description VARCHAR (1000))";
            db.writeTo(data);
            tables.add(theTable);
            data = "INSERT INTO BIGSHOP.TABLENAMES (TABLENAME) VALUES ('" + theTable + "')";
            db.writeTo(data);
        }

            //get next available id
            count = db.getnextavailableid(theTable, "PRODUCTID");
            //set sql statement for inserting a new customer into product data table
            data = "INSERT INTO BIGSHOP." + theTable + " (productid, productname, productprice, inventory, picture, description) VALUES (";
            data += Integer.toString(count) + ", '" + productname + "', " + mod(productprice) + ", " + productinventory + ", '" + productpicture + "', '" + productdescription + "')";

            
            try
            {
                //insert new product
                db.writeTo(data);
                info.add(new ProductBean(count, productname, String.format("$%.2f", mod(productprice)), "0",  productinventory, "0", productpicture, theTable, productdescription));

                //return true;
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }

            setProductname("");
            setProductprice("");
            setProductinventory("");
            setProductpicture("");
            setProductdescription("");
            setProducttable("");


            size = info.size();

            //return false;
            return "ManagerPage";
    }

    

    public boolean validateproductname(String theName, String theTable)
    {
        boolean trip = true;

        if (theName.compareTo("") != 0)
        {
            String sqlUname = "select productname from " + theTable;

            ResultSet rs = db.executeQueryStatement(sqlUname);

            String test = "";

            if(rs != null)
            {
                try
                {
                    rs.beforeFirst();
                    while( rs.next() )
                    {
                        test = rs.getString("PRODUCTNAME");

                        if( theName.compareTo(test) == 0 )
                        {
                            trip = false;
                            rs.last();
                        }

                    }

                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }
            }
        }

        return trip;
    }

    public void deletetable()
    {
        String theTable = getProducttable();


        //remove from tablenames
        String sqlstatement = "delete from BIGSHOP.TABLENAMES where TABLENAME = '" + theTable + "'";
        
        try
        {
            db.writeTo(sqlstatement);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

        //remove table itself
        sqlstatement = "Drop table " + theTable;

        try
        {
            db.writeTo(sqlstatement);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

        //walkthrough deleteproducts
        /*
         for(int x = 0; x < info.size(); x++)
        {
            //if product is in the dropped table
            if(info.get(x).getTable().compareTo(theTable) == 0)
            {
                //mark for deletion
                deleteproduct.set(x, true);
            }
        }
        */

        //update products
        //updateproducts();
    }

    public String clearall()
    {
        //reset all amounts and selections to zero
        for(int x = 0; x < info.size(); x++)
        {
            info.get(x).setAmount("0");
        }


        //reload page
        return "Shop";
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public void setProductprice(String productprice) {
        this.productprice = productprice;
    }

    public int getProductid() {
        return productid;
    }

    public String getProductname() {
        return productname;
    }

    public String getProductprice() {
        return productprice;
    }

    public ArrayList<Boolean> getDeleteproduct() {
        return deleteproduct;
    }

    public ArrayList<ProductBean> getInfo() {
        return info;
    }

    public ArrayList<ProductBean> getNewproducts() {
        return newproducts;
    }

    public String getProductinventory() {
        return productinventory;
    }

    public String getProductpicture() {
        return productpicture;
    }

    public String getProducttable() {
        return producttable;
    }

    public int getSize() {
        return size;
    }

    public String getTotal() {
        return total;
    }

    public void setDeleteproduct(ArrayList<Boolean> deleteproduct) {
        this.deleteproduct = deleteproduct;
    }

    public void setInfo(ArrayList<ProductBean> info) {
        this.info = info;
    }

    public void setNewproducts(ArrayList<ProductBean> newproducts) {
        this.newproducts = newproducts;
    }

    public void setProductinventory(String productinventory) {
        this.productinventory = productinventory;
    }

    public void setProductpicture(String productpicture) {
        this.productpicture = productpicture;
    }

    public void setProducttable(String producttable) {
        this.producttable = producttable.toUpperCase();
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public ArrayList<String> getTables() {
        return tables;
    }

    public void setTables(ArrayList<String> tables) {
        this.tables = tables;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
        int[] quantity = new int[1];
    }

    
    
    

    
}
