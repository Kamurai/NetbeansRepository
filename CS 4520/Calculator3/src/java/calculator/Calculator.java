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
    double first;
    double second;
    double third;

    /** Creates a new instance of Calculator */
    public Calculator()
    {
        first = 0;
        second = 0;
        third = 0;
    }

    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public double getThird() {
        return third;
    }

    public void setThird(double third) {
        this.third = third;
    }

    private double addfs()
    {
        //add first to second and store at third
        return ( getFirst() + getSecond() );
    }

    private double subfs()
    {
        //substract first by second and store at third
        return ( getFirst() - getSecond() );
    }

    private double mulfs()
    {
        //multiply first by second and store at third
        return ( getFirst() * getSecond() );
    }

    private double divfs()
    {
        //ensure that second is not 0
        if( getSecond() != 0)
        {
            //divide first by second and store at third
            return ( getFirst() / getSecond() );
        }
        else
        {
            return 0;
        }
    }

    public void peanut(int option)
    {
        if( option == 1)
        {
            second = addfs();
        }
        else if( option == 2 )
        {
            second = subfs();
        }
        else if( option == 3 )
        {
            second = mulfs();
        }
        else if( option == 4 )
        {
            second = divfs();
        }
        

    }

    public void clearall()
    {
        //set all three values to 0
        setFirst(0);
        setSecond(0);
        setThird(0);
    }

}
