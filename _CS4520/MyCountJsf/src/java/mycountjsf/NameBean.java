/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mycountjsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Kamurai
 */
@ManagedBean(name="NameBean")
@RequestScoped
public class NameBean
{
    //tool variables
    private String name;

    /** Creates a new instance of NameBean */
    public NameBean() 
    {
        name = "";

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }



}
