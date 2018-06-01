package Division1.Section4;

import Main.*;

public class Custom extends Main.Custom
{
    public Custom()
    {
        super();
    }

    public String Content(int vPage)
    {
        String Result = "";
        if(vPage <= 0)
        {
            Result += "./Content/Content_Index.xhtml";
        }
        else if(vPage == 2)
        {
            Result += "./Content/Content_Project2.xhtml";
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
        else if(vPage == 2)
        {
            Result += "./Content/Versions_Project2.xhtml";
        }
        
        return Result;
    }
}