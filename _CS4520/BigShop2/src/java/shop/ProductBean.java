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

    String picture;

    /** Creates a new instance of ProductBean */
    public ProductBean(String n, String p, String a, String i, String s, String t)
    {
        setName(n);
        setPrice(p);
        setAmount(a);
        setInventory(i);
        setSubtotal(s);
        setPicture(t);
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


    
}
