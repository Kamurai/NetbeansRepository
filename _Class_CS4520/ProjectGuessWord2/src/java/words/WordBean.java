/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package words;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;



/**
 *
 * @author Kamurai
 */
@ManagedBean(name="WordBean")
@ApplicationScoped
public class WordBean
{
    //create a variable to hold current guessword
    private String current;
    private String actual;
    private String guess;

    //create a container to hold possible guesswords
    public String possible[] = new String[4];

    /** Creates a new instance of Word */
    public WordBean()
    {
        
        possible[0] = "ridiculous";
        possible[1] = "invalidity";
        possible[2] = "ravenously";
        possible[3] = "connection";


        resetbutton();
    }

    public String getCurrent()
    {
        return current;
    }

    public void setCurrent(String current)
    {
        this.current = current;
    }

    public String getGuess()
    {
        return guess;
    }

    public void setGuess(String guess)
    {
        this.guess = guess;
    }

    public String getPossible(int x)
    {
        return possible[x];
    }

    public String getActual() {
        return actual;
    }


    public String getword()
    {
        //return random word from possible words
        //return Integer.toString(getrandom(possible.length));
        return possible[getrandom(possible.length)];
    }

    public String mash(String starter)
    {
        //variable to copy input
        String dummy = starter;
        //String temp = starter;
        String result = "";

        //variable to track uses of '_'
            //select a random number less than half of the given string's length
        int limit = dummy.length()/2;//getrandom(dummy.length()/2);
        int target;
        boolean[] miss = new boolean[dummy.length()];

        for(int x = 0; x < dummy.length(); x++)
        {
            miss[x] = false;
        }

        //walkthrough number of elements to hide
        for(int x = 0; x < limit; x++)
        {
            //find a non-hidden element
            do
            {
                //determine next target character
                target = getrandom(dummy.length());
            }
            while( miss[target] == true );
            
            miss[target] = true;
            //miss[x] = true;
        }



        //"walkthrough dummy
        for(int x = 0; x < dummy.length(); x++)
        {
            //if current character is marked to be hidden
            if( miss[x] == true)
            {
                //insert '_' into string at target position
                    //add '_' to result
                result = result + "_";
            }
            else
            {
                //copy straight from dummy to result
                result = result + Character.toString( dummy.charAt(x) );
            }

        }

        //return mashed string
        return result;
        //return Integer.toString(getrandom(6));
    }

    public void resetbutton()
    {
        actual = getword();
        current = mash(actual);
        guess = "";

    }

    public String goback()
    {
        resetbutton();

        return "index";
    }

    public String getone()
    {
        return possible[0];
    }

    public String evaluate()
    {
        String flag;

        if( getActual().compareTo(getGuess()) == 0)
        {
            flag = "guessRight";
        }
        else
        {
            flag = "guessWrong";
        }

        


        return flag;
    }

    public int getrandom(int limit)
    {
        //get a number 0 - x
        int num = (int) (Math.floor(Math.random()*100));
        //int num = (int) (Math.floor(Math.random()*1000)) % limit;


        //walkthrough possible words
        for(int x = 0; x < limit; x++)
        {
            //check if random number equals current element
            if( num >= (100.00/limit)*(x) && num < (100.00/limit)*(x+1) )
            {
                //num equals x
                num = x;
                //escape
                x = limit;
            }
        }
         

        if( num-1 < 0)
        {
            return 0;
        }
        else
        {
            return num;
        }

        //return num;
    }

}
