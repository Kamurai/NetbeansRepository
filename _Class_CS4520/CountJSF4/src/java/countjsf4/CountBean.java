/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package countjsf4;

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

    public void upCount()
    {
        this.count = count + 1;
    }



}
