package Section1.Section5;

import Section1.*;

public class Custom extends Main.Custom
{
    Main.Universal bob;

    public Custom()
    {
        bob = new Main.Universal();
    }

    public String Content(int vPage)
    {
        String Result = "";
        if(vPage <= 0)
        {
            Result += "./Content/Content_Index.xhtml";
        }

        return Result;
    }
    
    public String Versions(int vPage)
    {
        String Result = "";
        
        
        if(vPage <= 0)
        {
            Result += "./Content/Versions_Index.xhtml";
        }

        return Result;
    }
}
