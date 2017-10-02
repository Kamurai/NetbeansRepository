/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package words;
//ProjectGuessWord4

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.sql.*;
import java.sql.ResultSet;
//import.java.util.ArrayList;


/**
 *
 * @author Kamurai
 */
@ManagedBean(name="WordBean")
@SessionScoped
public class WordBean
{
    //create a variable to hold current guessword
    private String current;
    private String actual;
    private String guess;

    //example's database code

    /*
    String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    String url = "jdbc:derby://localhost:1527/guessworddb";
    String dbUsername = "guessworddb";
    String dbPassword = "guessworddb";
    */
    QueryBean qb;



    //create a container to hold possible guesswords
    public String possible[] = new String[4];

    /** Creates a new instance of Word */
    public WordBean()
    {
        /*
        possible[0] = "ridiculous";
        possible[1] = "invalidity";
        possible[2] = "ravenously";
        possible[3] = "connection";
        */
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

    

    public String getDBWord()
    {
        ResultSet rs = null;

        int theIdx = 0;

        String theWord = null;
        //System.out.println("Enter exexecuteQuerySt");

        //Connection con = qb.getConnection();
        
        //find all words
        String sqlWord = "SELECT * FROM GUESSWORDDB.WORDS";
        rs = qb.executeQueryStatement(sqlWord);

        try
        {
            //count total number of words
            rs.last();
            int rowCount = rs.getRow();
            //randomly select one of words
            theIdx = (((int) (Math.random()*10000)) % rowCount) + 1;
            rs.beforeFirst();
            int idx = 0;
            while((rs.next()) && (idx < theIdx))
            {
                theWord = rs.getString("word");
                idx += 1;
            }

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            qb.closeConnection();
        }

        setActual(theWord);
        return theWord;
    }

    /*
    public String getMissWord()
    {
        int wLen = getDBWord().length();
        int missLen = (int) (wLen * 0.5);

        List<Integer> missAry = new ArrayList<Integer>();
        for(int j = 0; j < missLen; j++)
        {
            int miss = ((int) (Math.random() * 1000)) % wLen;
            missAry.add(miss);
        }
        missWord = "";
        for(int i = 0; i < wLen; i++)
        {
            boolean found = false;
            for(int j = 0; j < missAry.size(); j++)
            {
                if( i == missAry.get(j))
                {
                    found = true;
                    break;
                }
            }
        }
    }
    */



}
