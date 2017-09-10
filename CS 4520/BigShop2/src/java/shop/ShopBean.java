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


@ManagedBean(name="ShopBean")
@SessionScoped
public class ShopBean
{
    //database bean
    DataBean db;
    int size;
    
    //products
    ArrayList<ProductBean> info = new ArrayList<ProductBean>();
    
    
    //tool variables
    String total = "0";
    

    /** Creates a new instance of ShopBean */
    public ShopBean()
    {
        //create a databean for queries
        db = new DataBean();

        //determine size of database
        size = getcount() ;

        //set names and prices
        buildinfo();
        
        //set amounts to zero
        //resetamounts();



    }

    public int getcount()
    {

        ResultSet rs = null;

        int rowCount = 0;


        try
        {
            //find all words
            String sqlWord = "SELECT * FROM BIGSHOP.SALAMANDERS";
            rs = db.executeQueryStatement(sqlWord);

            //count total number of words
            rs.last();
            rowCount = rs.getRow();

            //find all words
            sqlWord = "SELECT * FROM BIGSHOP.NEWTS";
            rs = db.executeQueryStatement(sqlWord);

            //count total number of words
            rs.last();
            rowCount += rs.getRow();

            //find all words
            sqlWord = "SELECT * FROM BIGSHOP.AQUATICS";
            rs = db.executeQueryStatement(sqlWord);

            //count total number of words
            rs.last();
            rowCount += rs.getRow();


        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        


        return rowCount;
    }



    public void buildinfo()
    {
        ResultSet rs = null;

        String theName = null;
        String thePrice = null;
        String theInventory = null;
        String thePicture = null;
        //System.out.println("Enter exexecuteQuerySt");


        System.out.println( rs );

        try
        {
            //find all words
            String sqlWord = "SELECT * FROM BIGSHOP.SALAMANDERS";
            rs = db.executeQueryStatement(sqlWord);

            //count total number of words
            rs.beforeFirst();
            //int idx = 0;
            while(rs.next())
            {
                //get name
                theName = rs.getString("PRODUCTNAME");
                //get price
                thePrice = "$" + Double.toString(rs.getDouble("PRODUCTPRICE"));
                //get inventory
                theInventory = Integer.toString(rs.getInt("Inventory"));
                thePicture = rs.getString("PICTURE");
                info.add(new ProductBean(theName, thePrice, "0", theInventory, "0", thePicture));
            }

            //find all words
            sqlWord = "SELECT * FROM BIGSHOP.NEWTS";
            rs = db.executeQueryStatement(sqlWord);

            //count total number of words
            rs.beforeFirst();
            //int idx = 0;
            while(rs.next())
            {
                //get name
                theName = rs.getString("PRODUCTNAME");
                //get price
                thePrice = "$" + Double.toString(rs.getDouble("PRODUCTPRICE"));
                //get inventory
                theInventory = Integer.toString(rs.getInt("Inventory"));
                thePicture = rs.getString("PICTURE");
                info.add(new ProductBean(theName, thePrice, "0", theInventory, "0", thePicture));
            }

            //find all words
            sqlWord = "SELECT * FROM BIGSHOP.AQUATICS";
            rs = db.executeQueryStatement(sqlWord);

            //count total number of words
            rs.beforeFirst();
            //int idx = 0;
            while(rs.next())
            {
                //get name
                theName = rs.getString("PRODUCTNAME");
                //get price
                thePrice = "$" + Double.toString(rs.getDouble("PRODUCTPRICE"));
                //get inventory
                theInventory = Integer.toString(rs.getInt("Inventory"));
                thePicture = rs.getString("PICTURE");
                info.add(new ProductBean(theName, thePrice, "0", theInventory, "0", thePicture));
            }

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
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
    

    

    

    public String getTotal() 
    {
        return total;
    }

    public void setTotal(String total) 
    {
        this.total = total;
    }

    

    

    
    public double mod(String target)
    {
        return Double.parseDouble(target.substring(1));
    }

    public String getdiscount()
    {
        if( mod(getTotal()) > 1500 )
        {
            return "$" + Double.toString(mod(getTotal()) - (mod(getTotal())/10));
        }
        else
        {
            return getTotal();
        }
    }

    public String invertdiscount()
    {

        return "$" + Double.toString(  mod(getTotal()) - mod(getdiscount()) );
    }


    

    public String clearall()
    {
        //reset all amounts and selections to zero
        resetamounts();
        

        //reload page
        return "index";
    }

    
    public void getout()
    {
        System.exit(0);
    }
    
    public String total()
    {
        double num = 0;

        //ensure all inputs were valid
        cleanse();

        //ensure that no more than available product is being requested
        reduceoverage();


        for(int x = 0; x < getSize(); x++)
        {
            num += Double.parseDouble(info.get(x).getAmount()) * mod(info.get(x).getPrice());
            info.get(x).setSubtotal("$" + Double.toString(num));
        }

        setTotal("$" + Double.toString(num));

        //go to order page
        return "order";
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

    public void reduceoverage()
    {
        //walkthrough amount
        for(int x = 0; x < getSize(); x++)
        {
            //if amount requested is more than inventory
            if( info.get(x).getAmount().compareTo( info.get(x).getInventory() ) > 0 )
            {
                info.get(x).setAmount(info.get(x).getInventory());
            }
        }
    }

    public boolean checkit(String target)
    {
        boolean flag = true;

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

    public ArrayList<ProductBean> getInfo() {
        return info;
    }

    
    public void setInfo(ArrayList<ProductBean> info) {
        this.info = info;
    }

    

     public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
}
