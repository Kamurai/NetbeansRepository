package Division2.Section5.Section4;

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