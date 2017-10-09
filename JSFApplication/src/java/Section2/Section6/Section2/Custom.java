package Section2.Section6.Section2;

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
        else if(vPage == 1)
        {
            Result += "./Content/Content_Project1.xhtml";
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
        else if(vPage == 1)
        {
            Result += "./Content/Versions_Project1.xhtml";
        }

        return Result;
    }
}
