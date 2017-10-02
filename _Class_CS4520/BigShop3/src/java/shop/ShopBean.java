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
    //signup bean
    SignupBean sb;
    //login bean
    LoginBean lb;
    //manager bean
    ManagerBean mb;
    //inventory bean
    InventoryBean ib;
    //order bean
    OrderBean ob;

    
    
    
    
    
    
    

    /** Creates a new instance of ShopBean */
    public ShopBean()
    {
        //create a databean for queries
        db = new DataBean();

        //create a login bean for logins
        lb = new LoginBean();

        //create a signup bean for signups
        sb = new SignupBean();

        //create a manager bean for manager actions
        mb = new ManagerBean();

        //create an inventory bean for inventory actions
        ib = new InventoryBean();

        //create an order bean for order actions
        ob = new OrderBean();
        
        


    }

    public void getout()
    {
        System.exit(0);
    }
    
    

    

    public String signupHandler()
    {

        //verify successful signup
        boolean sg = sb.isSignupGood();
        boolean ma = false;
        boolean lg = false;

        //if signup is good
        if(sg)
        {
            //get and set username and password
            lb.setUsername(sb.getUsername());
            lb.setPassword(sb.getPassword());

            

            //verify successful login
            lg = lb.isLoginGood();
            //verify manager status
            ma = lb.checkManager();

            //insert data into managerbean
            mb.addincustomer(sb.getFirstName(), sb.getLastName(), sb.getEmail(), sb.getUsername(), sb.getPassword(), ma);


            //clear signup bean
            sb.resetHandler();

        }
        else
        {
            return "LoginPage";
        }

        //navigate to proper page
        if(lg && ma)
        {
            return "ManagerPage";
        }
        else if(lg && !ma)
        {
            return "Shop";
        }
        else
        {
            return "LoginPage";
        }
    }

    
    public String createcustomer()
    {
        //get information form managerbean
            //pass to signup bean


        //get information from managerbean: manager
        boolean man = mb.getManager();
        //create new customer
        boolean sg = sb.isSignupGood();

            
        //determine if customer should be manager
        if( man && sg)
        {
            //find loginid based on username
                //change newusernames based on loginid
            mb.newusernames.get(mb.findloginidof(mb.username)).setManager(true);
                    //perform an update
            mb.updatecustomers();
        }

        if(sg)
        {
            //addto managerbean
            mb.addincustomer(sb.getFirstName(), sb.getLastName(), sb.getEmail(), sb.getUsername(), sb.getPassword(), man);
        }

        //clear signup bean
        sb.setFirstName("");
        sb.setLastName("");
        sb.setEmail("");
        sb.setUsername("");
        sb.setPassword("");

        return "ManagerPage";

    }

    public String findemail()
    {
        int cid = 0;

        //walkthrough customer info
        for(int x = 0; x < mb.customerinfo.size(); x++)
        {
            cid = mb.customerinfo.get(x).getCustomerid();
            //walkthrough usernames to match
            for(int y = 0; y < mb.usernames.size(); y++)
            {
                //check username's cid
                if(mb.usernames.get(y).getCustomerid() == cid && mb.usernames.get(y).getUsername().compareTo(lb.getUsername()) == 0)
                {
                    return mb.customerinfo.get(x).getEmail();
                }
            }
        }

        return "";

    }

    public String checkout()
    {
        //total updated information
        ib.total();
        
        return "checkout";
    }

    public String orderHandler()
    {
        ob.setUsername(lb.getUsername());
        ob.setEmail(findemail());
        ob.setTotal(ib.info.get(ib.info.size()-1).getSubtotal());


        boolean og = ob.isOrderGood();

        boolean or = isOrderResolved();

        if(og && or)
        {
            return "confirm";
        }
        else
        {
            return "checkout";
        }
    }

    public boolean isOrderResolved()
    {
        String sqlstatement = "";

        //walkthrough products
        for(int x = 0; x < ib.info.size(); x++)
        {
            //amount is not zero AND amount is not more than inventory
            if( Integer.parseInt(ib.info.get(x).getAmount()) != 0 && Integer.parseInt(ib.info.get(x).getAmount()) <= ib.mod(ib.info.get(x).getInventory()) )
            {
                //reserve product
                ib.info.get(x).setInventory( Integer.toString( Integer.parseInt( ib.info.get(x).getInventory() ) - Integer.parseInt( ib.info.get(x).getAmount() ) )   );

                //update database
                sqlstatement = "UPDATE BIGSHOP." + ib.info.get(x).getTable() + " SET INVENTORY = " + ib.info.get(x).getInventory() + " WHERE PRODUCTID = " + ib.info.get(x).getProductid();
                try
                {
                    db.writeTo(sqlstatement);
                }
                catch(Exception ex)
                {
                    return false;
                }

                //build receipt

            }
            else if(Integer.parseInt(ib.info.get(x).getAmount()) > ib.mod(ib.info.get(x).getInventory()))
            {
                return false;
            }
        }




        return true;
    }


    public String logout()
    {
        lb.resetHandler();

        return "login";
    }

    public LoginBean getLb() {
        return lb;
    }

    public SignupBean getSb() {
        return sb;
    }

    public void setLb(LoginBean lb) {
        this.lb = lb;
    }

    public void setSb(SignupBean sb) {
        this.sb = sb;
    }

    public ManagerBean getMb() {
        return mb;
    }

    public void setMb(ManagerBean mb) {
        this.mb = mb;
    }

    public InventoryBean getIb() {
        return ib;
    }

    public void setIb(InventoryBean ib) {
        this.ib = ib;
    }

    public OrderBean getOb() {
        return ob;
    }

    public void setOb(OrderBean ob) {
        this.ob = ob;
    }

    

    
}
