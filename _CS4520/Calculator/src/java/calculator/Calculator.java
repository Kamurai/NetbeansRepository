/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/*
Kemerait, Christopher
CS 4520, Professor Xu
Lab 1:  Calculator
*/


@ManagedBean(name="Calculator")
@RequestScoped
public class Calculator
{
    //tool variables
    String first;
    String second;
    String third;

    /** Creates a new instance of Calculator */
    public Calculator()
    {
        first = "";
        second = "";
        third = "";
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }

    public void addfs()
    {
        //add first to second and store at third
        setThird( Double.toString(Double.parseDouble(getFirst()) + Double.parseDouble(getSecond())) );
    }

    public void subfs()
    {
        //substract first by second and store at third
        setThird( Double.toString(Double.parseDouble(getFirst()) - Double.parseDouble(getSecond())) );
    }

    public void mulfs()
    {
        //multiply first by second and store at third
        setThird( Double.toString(Double.parseDouble(getFirst()) * Double.parseDouble(getSecond())) );
    }

    public void divfs()
    {
        //ensure that second is not 0
        if( getSecond().compareTo("0") != 0 )
        {
            //divide first by second and store at third
            setThird( Double.toString(Double.parseDouble(getFirst()) / Double.parseDouble(getSecond())) );
        }
        else
        {
            //display error message
            setThird("Error, you cannot divide by 0.");
        }
    }


    public void clearall()
    {
        //set all three values to 0
        setFirst("");
        setSecond("");
        setThird("");
    }

}
