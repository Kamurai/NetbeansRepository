/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shop;

import java.io.*;
import java.sql.ResultSet;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Kamurai
 */
@ManagedBean(name="OrderBean")
@RequestScoped
public class OrderBean implements Serializable
{
    //database information
    private int recordid;
    //user information
    private String username;
    private String email;
    //recipient information
    private String rfname;
    private String rlname;
    private String rstreet;
    private String rcity;
    private String rstate;
    private String rcountry;
    private String rpcode;
    private String rphone;
    //billing information
    private String bfname;
    private String blname;
    private String bstreet;
    private String bcity;
    private String bstate;
    private String bcountry;
    private String bpcode;
    private String bphone;
    //payment information
    private String cctype;
    private String ccnumber;
    private String ccexp;
    private String cccode;
    //purchase information
    private String dop;
    private String total;

    //database information
        int purchaseid;
        String productname;
        String productprice;
        String productdescription;

    //list of Records
    ArrayList<RecordBean> recordlist = new ArrayList<RecordBean>();

    //list of Purchases
    ArrayList<PurchaseBean> purchaselist = new ArrayList<PurchaseBean>();

    DataBean db;

    //tool variables
    String error;
    boolean same;


    /** Creates a new instance of DataBean */
    public OrderBean()
    {
        db = new DataBean();
        error = "";
        same = false;
        
        //database information
        setRecordid(0);
        //user information
        setUsername("");
        setEmail("");
        //recipient information
        setRfname("");
        setRlname("");
        setRstreet("");
        setRcity("");
        setRstate("");
        setRcountry("");
        setRpcode("");
        setRphone("");
        //billing information
        setBfname("");
        setBlname("");
        setBstreet("");
        setBcity("");
        setBstate("");
        setBcountry("");
        setBpcode("");
        setBphone("");
        //payment information
        setCctype("");
        setCcnumber("");
        setCcexp("");
        setCccode("");
        //purchase information
        setDop("");
    
        //list of Records
        buildrecords();


        //database information
        setPurchaseid(0);
        setProductname("");
        setProductprice("");
        setProductdescription("");


        //list of Receipts
        buildreceipts();

    }

    public void buildrecords()
    {
        
        //walkthrough record table
        try 
        {
            ResultSet rs = null;
            String theTable = "RECORDS";
            //find all words
            String sqlWord = "SELECT * FROM BIGSHOP." + theTable;
            rs = db.executeQueryStatement(sqlWord);

            rs.beforeFirst();
            while (rs.next()) 
            {
                //database information
                setRecordid(rs.getInt("RECORDID"));
                //user information
                setUsername(rs.getString("USERNAME"));
                setEmail(rs.getString("EMAIL"));
                //recipient information
                setRfname(rs.getString("RFNAME"));
                setRlname(rs.getString("RLNAME"));
                setRstreet(rs.getString("RSTREET"));
                setRcity(rs.getString("RCITY"));
                setRstate(rs.getString("RSTATE"));
                setRcountry(rs.getString("RCOUNTRY"));
                setRpcode(rs.getString("RPCODE"));
                setRphone(rs.getString("RPHONE"));
                //billing information
                setBfname(rs.getString("BFNAME"));
                setBlname(rs.getString("BLNAME"));
                setBstreet(rs.getString("BSTREET"));
                setBcity(rs.getString("BCITY"));
                setBstate(rs.getString("BSTATE"));
                setBcountry(rs.getString("BCOUNTRY"));
                setBpcode(rs.getString("BPCODE"));
                setBphone(rs.getString("BPHONE"));
                //payment information
                setCctype(rs.getString("CCTYPE"));
                setCcnumber(rs.getString("CCNUMBER"));
                setCcexp(rs.getString("CCEXP"));
                setCccode(rs.getString("CCNUM"));
                //purchase information
                setDop(rs.getString("DOP"));
                setTotal(String.format("$%.2f", rs.getDouble("TOTAL")));
                recordlist.add(new RecordBean(getRecordid(), getUsername(), getEmail(), getRfname(), getRlname(), getRstreet(), getRcity(), getRstate(), getRcountry(), getRpcode(), getRphone(), getBfname(), getBlname(), getBstreet(), getBcity(), getBstate(), getBcountry(), getBpcode(), getBphone(), getCctype(), getCcnumber(), getCcexp(), getCccode(), getDop(), getTotal()));
            }
        }
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }


        //database information
        setRecordid(0);
        //user information
        setUsername("");
        setEmail("");
        //recipient information
        setRfname("");
        setRlname("");
        setRstreet("");
        setRcity("");
        setRstate("");
        setRcountry("");
        setRpcode("");
        setRphone("");
        //billing information
        setBfname("");
        setBlname("");
        setBstreet("");
        setBcity("");
        setBstate("");
        setBcountry("");
        setBpcode("");
        setBphone("");
        //payment information
        setCctype("");
        setCcnumber("");
        setCcexp("");
        setCccode("");
        //purchase information
        setDop("");
    }

    public void buildreceipts()
    {

        //walkthrough record table
        try
        {
            ResultSet rs = null;
            String theTable = "PURCHASES";
            //find all words
            String sqlWord = "SELECT * FROM BIGSHOP." + theTable;
            rs = db.executeQueryStatement(sqlWord);

            rs.beforeFirst();
            while (rs.next())
            {
                //database information
                setRecordid(rs.getInt("RECORDID"));
                setPurchaseid(rs.getInt("PURCHASEID"));
                //product information
                setProductname(rs.getString("PRODUCTNAME"));
                setProductprice(String.format("$%.2f", rs.getDouble("PRODUCTPRICE")));
                setProductdescription(rs.getString("PRODUCTDESCRIPTION"));


                purchaselist.add(new PurchaseBean(getRecordid(), getPurchaseid(), getProductname(), getProductprice(), getProductdescription()));
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }


        //database information
        setRecordid(0);
        setPurchaseid(0);
        //product information
        setProductname("");
        setProductprice("");
        setProductdescription("");

    }

    public boolean isOrderGood()
    {
        //if same is true
        if(same)
        {
            //then set billing information as recipient information
            setBfname(getRfname());
            setBlname(getRlname());
            setBstreet(getRstreet());
            setBcity(getRcity());
            setBstate(getRstate());
            setBcountry(getRcountry());
            setBpcode(getRpcode());
            setBphone(getRphone());
        }

        //validate information



        //set Date Of Purchase
        setDop(Integer.toString(Calendar.DAY_OF_MONTH) + " " + Integer.toString(Calendar.MONTH) + " " + Integer.toString(Calendar.YEAR));

        //add record to arraylist
        recordlist.add(new RecordBean(getRecordid(), getUsername(), getEmail(), getRfname(), getRlname(), getRstreet(), getRcity(), getRstate(), getRcountry(), getRpcode(), getRphone(), getBfname(), getBlname(), getBstreet(), getBcity(), getBstate(), getBcountry(), getBpcode(), getBphone(), getCctype(), getCcnumber(), getCcexp(), getCccode(), getDop(), getTotal()));

        //write record to database
        String sqlstatement = "INSERT INTO RECORDS(recordid, username, email, rfname, rlname, rstreet, rcity, rstate, rcountry, rpcode, rphone, bfname, blname, bstreet, bcity, bstate, bcountry, bpcode, bphone, cctype, ccnumber, ccexp, cccode, dop, total) ";
        sqlstatement += "VALUES(" + getRecordid() + ", '" + getUsername() + "', '" + getEmail() + "', '" + getRfname() + "', '" + getRlname() + "', '" + getRstreet() + "', '" + getRcity() + "', '" + getRstate() + "', '" + getRcountry() + "', '" + getRpcode() + "', '" + getRphone() + "', '" + getBfname() + "', '" + getBlname() + "', '" + getBstreet() + "', '" + getBcity() + "', '" + getBstate() + "', '" + getBcountry() + "', '" + getBpcode() + "', '" + getBphone() + "', '" + getCctype() + "', '" + getCcnumber() + "', '" + getCcexp() + "', '" + getCccode() + "', '" + getDop() + "', '" + getTotal() +"')";

        try
        {
            db.writeTo(sqlstatement);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

        //return true at this point
        return true;

        
    }

    
    

    


    public String getUsername() {
        return username;
    }
    

    public void setUsername(String username) {
        this.username = username;
    }

        
    public void resetHandler()
    {
        //recipient information
        setRfname("");
        setRlname("");
        setRstreet("");
        setRcity("");
        setRstate("");
        setRcountry("");
        setRpcode("");
        setRphone("");
        //billing information
        setBfname("");
        setBlname("");
        setBstreet("");
        setBcity("");
        setBstate("");
        setBcountry("");
        setBpcode("");
        setBphone("");
        //payment information
        setCctype("");
        setCcnumber("");
        setCcexp("");
        setCccode("");
        

    }

    public String clearAll()
    {
        resetHandler();
        return "checkout";
    }

    

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getEmail() {
        return email;
    }

    public String getRcity() {
        return rcity;
    }

    public String getRcountry() {
        return rcountry;
    }

    public int getRecordid() {
        return recordid;
    }

    public String getRfname() {
        return rfname;
    }

    public String getRlname() {
        return rlname;
    }

    public String getRpcode() {
        return rpcode;
    }

    public String getRstate() {
        return rstate;
    }

    public String getRstreet() {
        return rstreet;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRcity(String rcity) {
        this.rcity = rcity;
    }

    public void setRcountry(String rcountry) {
        this.rcountry = rcountry;
    }

    public void setRecordid(int recordid) {
        this.recordid = recordid;
    }

    public void setRfname(String rfname) {
        this.rfname = rfname;
    }

    public void setRlname(String rlname) {
        this.rlname = rlname;
    }

    public void setRpcode(String rpcode) {
        this.rpcode = rpcode;
    }

    public void setRstate(String rstate) {
        this.rstate = rstate;
    }

    public void setRstreet(String rstreet) {
        this.rstreet = rstreet;
    }

    public String getBcity() {
        return bcity;
    }

    public String getBcountry() {
        return bcountry;
    }

    public String getBfname() {
        return bfname;
    }

    public String getBlname() {
        return blname;
    }

    public String getBpcode() {
        return bpcode;
    }

    public String getBphone() {
        return bphone;
    }

    public String getBstate() {
        return bstate;
    }

    public String getBstreet() {
        return bstreet;
    }

    public String getCcexp() {
        return ccexp;
    }

    public String getCccode() {
        return cccode;
    }

    public String getCcnumber() {
        return ccnumber;
    }

    public String getCctype() {
        return cctype;
    }

    public ArrayList<RecordBean> getRecordlist() {
        return recordlist;
    }

    public String getRphone() {
        return rphone;
    }

    public void setBcity(String bcity) {
        this.bcity = bcity;
    }

    public void setBcountry(String bcountry) {
        this.bcountry = bcountry;
    }

    public void setBfname(String bfname) {
        this.bfname = bfname;
    }

    public void setBlname(String blname) {
        this.blname = blname;
    }

    public void setBpcode(String bpcode) {
        this.bpcode = bpcode;
    }

    public void setBphone(String bphone) {
        this.bphone = bphone;
    }

    public void setBstate(String bstate) {
        this.bstate = bstate;
    }

    public void setBstreet(String bstreet) {
        this.bstreet = bstreet;
    }

    public void setCcexp(String ccexp) {
        this.ccexp = ccexp;
    }

    public void setCccode(String cccode) {
        this.cccode = cccode;
    }

    public void setCcnumber(String ccnumber) {
        this.ccnumber = ccnumber;
    }

    public void setCctype(String cctype) {
        this.cctype = cctype;
    }

    public void setRecordlist(ArrayList<RecordBean> recordlist) {
        this.recordlist = recordlist;
    }

    public void setRphone(String rphone) {
        this.rphone = rphone;
    }

    public String getDop() {
        return dop;
    }

    public void setDop(String dop) {
        this.dop = dop;
    }

    public boolean isSame() {
        return same;
    }

    public void setSame(boolean same) {
        this.same = same;
    }

     public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getProductname() {
        return productname;
    }

    public String getProductprice() {
        return productprice;
    }

    public int getPurchaseid() {
        return purchaseid;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public void setProductprice(String productprice) {
        this.productprice = productprice;
    }

    public void setPurchaseid(int purchaseid) {
        this.purchaseid = purchaseid;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    public ArrayList<PurchaseBean> getPurchaselist() {
        return purchaselist;
    }

    public void setPurchaselist(ArrayList<PurchaseBean> purchaselist) {
        this.purchaselist = purchaselist;
    }


    
}
