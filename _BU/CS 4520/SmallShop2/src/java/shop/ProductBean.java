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

    String name;
    String price;
    String amount;
    String subtotal;

    /** Creates a new instance of ProductBean */
    public ProductBean(String n, String p, String a, String s)
    {
        setName(n);
        setPrice(p);
        setAmount(a);
        setSubtotal(s);
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

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }


    
}
