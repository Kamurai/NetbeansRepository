package Section1.Section4;

import Section1.*;

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
            Result += "./Content/Content_index.xhtml";
        }
        else if(input == 2)
        {
            Result += "./Content/Content_Project2.xhtml";
        }

        return Result;
    }
    
    public String Versions(int input)
    {
        String Result = "";
        
        
        if(input <= 0)
        {
            Result += "./Content/Versions_index.xhtml";
        }
        else if(input == 2)
        {
            Result += "./Content/Versions_Project2.xhtml";
        }
        
        return Result;
    }
}
