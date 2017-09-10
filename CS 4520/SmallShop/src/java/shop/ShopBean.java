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
    ArrayList<ArrayList<String>> info = new ArrayList<ArrayList<String>>();
    
    //name of item
    ArrayList<String> name = new ArrayList<String>();
    //String[] name;
    //String name = new String();
    
    //price of item
    ArrayList<String> price = new ArrayList<String>();
    //String price[];
    //String price = new String();
    
    //amout desired
    ArrayList<String> amount = new ArrayList<String>();
    //String amount[];
    //String amount = new String();
    
    //subtotal
    ArrayList<String> subtotal = new ArrayList<String>();
    //String subtotal[];
    //String subtotal = new String();

    ArrayList<ArrayList<Object>> data = new ArrayList<ArrayList<Object>>();
    
    //tool variables
    String total = "0";
    

    /** Creates a new instance of ShopBean */
    public ShopBean()
    {
        db = new DataBean();

        size = getcount() ;

        //name = new String[size];
        
        //price = new String[size];
        
        //amount = new String[size];
        
        //subtotal = new String[size];
        
        //set names and prices
        getvalues();
        
        //set amounts to zero
        resetamounts();



    }

    public int getcount()
    {

        ResultSet rs = null;

        int rowCount = 0;


        try
        {
            //find all words
            String sqlWord = "SELECT * FROM SMALLSHOP.PRODUCTS";
            rs = db.executeQueryStatement(sqlWord);

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



    public void getvalues()
    {
        /*
        name[0] = "0";
        name[1] = "Broken PC: Media PC";
        name[2] = "Wild Mice: Laser Mouse";
        name[3] = "Mad Storage: 16GB USB Drive";
        */

        ResultSet rs = null;

        int theIdx = 0;
        int rowCount = getSize();

        String theWord = null;
        //System.out.println("Enter exexecuteQuerySt");


        System.out.println( rs );

        try
        {
            //find all words
            String sqlWord = "SELECT * FROM SMALLSHOP.PRODUCTS";
            rs = db.executeQueryStatement(sqlWord);

            //count total number of words
            rs.beforeFirst();
            //int idx = 0;
            while(rs.next())
            {
                //get name
                theWord = rs.getString("PRODUCTNAME");
                name.add(theWord);
                //get price
                theWord = "$" + Double.toString(rs.getDouble("PRODUCTPRICE"));
                price.add(theWord);
                //idx += 1;
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


        amount.clear();
        //walkthrough database
        for( int x = 0; x < count; x++)
        {
            //add to amounts arraylist
            amount.add("0");
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


        subtotal.clear();
        for(int x = 0; x < getSize(); x++)
        {
            num += Double.parseDouble(amount.get(x)) * mod(price.get(x));
            subtotal.add("$" + Double.toString(num));
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
            if(checkit(amount.get(x)) == false)
            {
                amount.set(x, "0");
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

    public ArrayList<String> getAmount() {
        return amount;
    }

    public ArrayList<String> getName() {
        return name;
    }

    public ArrayList<String> getPrice() {
        return price;
    }

    public ArrayList<String> getSubtotal() {
        return subtotal;
    }

    public void setAmount(ArrayList<String> amount) {
        this.amount = amount;
    }

    public void setName(ArrayList<String> name) {
        this.name = name;
    }

    public void setPrice(ArrayList<String> price) {
        this.price = price;
    }

    public void setSubtotal(ArrayList<String> subtotal) {
        this.subtotal = subtotal;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
}
