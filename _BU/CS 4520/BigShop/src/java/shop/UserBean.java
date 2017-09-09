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
@ManagedBean(name="UserBean")
@RequestScoped
public class UserBean
{
    //login id
    int loginid;
    //customer id
    int customerid;
    //product name
    String username;
    //product price
    String password;
    //amount of product being requested
    boolean manager;
    
    /** Creates a new instance of ProductBean */
    public UserBean(int l, int c, String u, String p, boolean m)
    {
        setLoginid(l);
        setCustomerid(c);
        setUsername(u);
        setPassword(p);
        setManager(m);
    }

    public int getCustomerid() {
        return customerid;
    }

    public int getLoginid() {
        return loginid;
    }

    public boolean getManager() {
        return manager;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public void setLoginid(int loginid) {
        this.loginid = loginid;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    


    
}
