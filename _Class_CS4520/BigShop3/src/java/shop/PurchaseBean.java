/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shop;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Kamurai
 */
@ManagedBean(name="PurchaseBean")
@RequestScoped
public class PurchaseBean
{
    //database information
    private int recordid;
    private int purchaseid;
    private String productname = "";
    private String productprice = "";
    private String productdescription = "";



    /** Creates a new instance of ProductBean */
    public PurchaseBean(int rid, int pid, String pn, String pp, String pd)
    {
        //datbase information
        setRecordid(rid);
        setPurchaseid(pid);
        //product information
        setProductname(pn);
        setProductprice(pp);
        setProductdescription(pd);

    }

    public String getProductdescription() {
        return productdescription;
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

    public int getRecordid() {
        return recordid;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
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

    public void setRecordid(int recordid) {
        this.recordid = recordid;
    }

    

    
    

    
}
