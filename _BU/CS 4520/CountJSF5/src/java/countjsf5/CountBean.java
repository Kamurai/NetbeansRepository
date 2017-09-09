/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package countjsf5;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author Kamurai
 */
//name of bean
@ManagedBean(name="CountBean")
//scope of bean
@ApplicationScoped
public class CountBean
{
    //tool variables
    private int count;

    /** Creates a new instance of NameBean */
    public CountBean()
    {
        count = 0;

    }

    public int getCount()
    {
        return count;
    }

    public String upCount()
    {
        this.count = count + 1;

        return "EchoName";
    }



}
