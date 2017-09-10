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
    private int productamount = 0;
    private String productsubtotal = "";
    private String productdescription = "";



    /** Creates a new instance of ProductBean */
    public PurchaseBean(int rid, int pid, String pn, String pp, int pa, String ps, String pd)
    {
        //datbase information
        setRecordid(rid);
        setPurchaseid(pid);
        //product information
        setProductname(pn);
        setProductprice(pp);
        setProductamount(pa);
        setProductsubtotal(ps);
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

    public void setProductamount(int productamount) {
        this.productamount = productamount;
    }

    public int getProductamount() {
        return productamount;
    }

    public String getProductsubtotal() {
        return productsubtotal;
    }

    public void setProductsubtotal(String productsubtotal) {
        this.productsubtotal = productsubtotal;
    }

    

    
    

    
}
