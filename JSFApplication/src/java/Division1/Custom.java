package Division1;

public class Custom extends Main.Custom
{
    public Custom()
    {
        super();
    }
    
    public String getContent(int vPage)
    {
        String Result = "";
        if(vPage <= 0)
        {
            Result += "./Content/Content_Index.xhtml";
        }

        return Result;
    }
    
    public String getVersions(int vPage)
    {
        String Result = "";
        
        
        if(vPage <= 0)
        {
            Result += "./Content/Versions_Index.xhtml";
        }

        return Result;
    }
}
