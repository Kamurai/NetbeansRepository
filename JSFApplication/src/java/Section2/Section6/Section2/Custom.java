package Section2.Section6.Section2;

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

        return Result;
    }
}
