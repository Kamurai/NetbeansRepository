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
@ManagedBean(name="CustomerBean")
@RequestScoped
public class CustomerBean
{
    //customer id
    int customerid;
    //product first name
    String firstname;
    //product last name
    String lastname;
    //email
    String email;
    

    /** Creates a new instance of ProductBean */
    public CustomerBean(int c, String f, String l, String e)
    {
        setCustomerid(c);
        setFirstname(f);
        setLastname(l);
        setEmail(e);
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    
    


    
}
