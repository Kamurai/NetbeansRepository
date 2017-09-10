/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package words;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.sql.*;
import java.sql.ResultSet;
//import.java.util.ArrayList;


/**
 *
 * @author Kamurai
 */
@ManagedBean(name="WordzBean")
@SessionScoped
public class WordzBean
{
    //create a variable to hold current guessword
    private String current;
    private String actual;
    private String guess;

    QueryBean qb;



    //create a container to hold possible guesswords
    public String possible[] = new String[4];

    /** Creates a new instance of Word */
    public WordzBean()
    {

        qb = new QueryBean();

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

    public void setActual(String actual) {
        this.actual = actual;
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
        actual = getDBWord();
        current = mash(actual);
        guess = "";

    }

    public String goback()
    {
        resetbutton();

        return "index";
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
        //database requires 1 - x
                                                                                //get a number 0 - x
        int num = (int) (Math.floor(Math.random()*100));
        //int num = (int) (Math.floor(Math.random()*1000)) % limit;


        //walkthrough possible words
        for(int x = 0; x < limit; x++)
        {
            //check if random number equals current element
            if( num >= (100.00/limit)*(x) && num < (100.00/limit)*(x+1) )
            {
                //num equals x + 1
                num = x + 1;
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

    

    public String getDBWord()
    {
        ResultSet rs = null;

        int target = getrandom(getcount());
        System.out.println("Count is: " + getcount());
        System.out.println("Target is: " + target);

        String theWord = null;
        //System.out.println("Enter exexecuteQuerySt");
        
        try
        {
            //find all words
            String sqlWord = "SELECT * FROM GUESSWORDDB.WORDS WHERE WORDID = " + Integer.toString(target);
            //System.out.println("sqlWord is: " + sqlWord);
            rs = qb.executeQueryStatement(sqlWord);
            rs.first();
            theWord = rs.getString("word");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
             qb.closeConnection();
        }
        
        return theWord;
        
    }

    public int getcount()
    {
        
        String countword = "SELECT ALL COUNT(WORDID) AS TOTALNUMROW FROM GUESSWORDDB.WORDS";

        int rowcount = 0;

        try
        {
            ResultSet rs = qb.executeQueryStatement(countword);

            rs.first();
            rowcount = rs.getInt("TOTALNUMROW");
            //System.out.println("TOTALNUMROW is:" + rowcount);

        }
        catch(Exception ex)
        {
            rowcount = 5;
            //System.out.println("TOTALNUMROW error is:" + rowcount);

        }
        finally
        {
             qb.closeConnection();
        }

        return rowcount;
        
   }



}
