/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package booyah;

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

    String word;

    /** Creates a new instance of NameBean */
    public NameBean() 
    {
        word = "";
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String evaluate()
    {
        if( getWord().compareTo("smith") == 0 )
        {
            return "third";
        }

        return "second";
    }

}
