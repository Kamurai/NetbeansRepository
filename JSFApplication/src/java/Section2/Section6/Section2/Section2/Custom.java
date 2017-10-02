package Section2.Section6.Section2.Section2;

import Section2.*;

public class Custom extends Main.Custom
{
    Main.Universal bob;

    public Custom()
    {
        bob = new Main.Universal();
    }

    public String Content(int input)
    {
        String Result = "";
        if(input <= 0)
        {
            Result += "./Content/Content_Index.xhtml";
        }
        else if(input == 1)
        {
            Result += "./Content/Content_Project1.xhtml";
        }
        else if(input == 2)
        {
            Result += "./Content/Content_Project2.xhtml";
        }
        else if(input == 3)
        {
            Result += "./Content/Content_Project3.xhtml";
        }
        else if(input == 4)
        {
            Result += "./Content/Content_Project4.xhtml";
        }
        else if(input == 5)
        {
            Result += "./Content/Content_Project5.xhtml";
        }
        else if(input == 6)
        {
            Result += "./Content/Content_Project6.xhtml";
        }
        else if(input == 7)
        {
            Result += "./Content/Content_Project7.xhtml";
        }
        else if(input == 8)
        {
            Result += "./Content/Content_Project8.xhtml";
        }
        else if(input == 9)
        {
            Result += "./Content/Content_Project9.xhtml";
        }
        else if(input == 10)
        {
            Result += "./Content/Content_Project10.xhtml";
        }
        else if(input == 11)
        {
            Result += "./Content/Content_Project11.xhtml";
        }


        return Result;
    }
    
    public String Versions(int input)
    {
        String Result = "";
        
        
        if(input <= 0)
        {
            Result += "./Content/Versions_Index.xhtml";
        }
        else if(input == 1)
        {
            Result += "./Content/Versions_Project1.xhtml";
        }
        else if(input == 2)
        {
            Result += "./Content/Versions_Project2.xhtml";
        }
        else if(input == 3)
        {
            Result += "./Content/Versions_Project3.xhtml";
        }
        else if(input == 4)
        {
            Result += "./Content/Versions_Project4.xhtml";
        }
        else if(input == 5)
        {
            Result += "./Content/Versions_Project5.xhtml";
        }
        else if(input == 6)
        {
            Result += "./Content/Versions_Project6.xhtml";
        }
        else if(input == 7)
        {
            Result += "./Content/Versions_Project7.xhtml";
        }
        else if(input == 8)
        {
            Result += "./Content/Versions_Project8.xhtml";
        }
        else if(input == 9)
        {
            Result += "./Content/Versions_Project9.xhtml";
        }
        else if(input == 10)
        {
            Result += "./Content/Versions_Project10.xhtml";
        }
        else if(input == 11)
        {
            Result += "./Content/Versions_Project11.xhtml";
        }

        return Result;
    }
}
