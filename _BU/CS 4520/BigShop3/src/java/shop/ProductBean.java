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
@ManagedBean(name="ProductBean")
@RequestScoped
public class ProductBean
{
    //productid
    int productid;
    //product name
    String name;
    //product price
    String price;
    //amount of product being requested
    String amount;
    //amount of product actually available
    String inventory;
    //subtotal?
    String subtotal;
    //table
    String table;
    //picture source
    String picture;
    //description
    String description;

    /** Creates a new instance of ProductBean */
    public ProductBean(int u, String n, String p, String a, String i, String s, String c, String t, String d)
    {
        setProductid(u);
        setName(n);
        setPrice(p);
        setAmount(a);
        setInventory(i);
        setSubtotal(s);
        setPicture(c);
        setTable(t);
        setDescription(d);
    }

    public String getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getPicture() {
        return picture;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public String getInventory() {
        return inventory;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    
}
