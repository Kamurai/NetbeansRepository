package Section2.Section5;

import Section2.*;

public class Custom extends Main.Custom
{
    Main.Universal universal;

    public Custom()
    {
        universal = new Main.Universal();
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
