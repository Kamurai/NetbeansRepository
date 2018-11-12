package Division3;

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
        else if(vPage == 1)
        {
            Result += "./Content/Content_Project1.xhtml";
        }
        else if(vPage == 2)
        {
            Result += "./Content/Content_Project2.xhtml";
        }
        else if(vPage == 3)
        {
            Result += "./Content/Content_Project3.xhtml";
        }
        else if(vPage == 4)
        {
            Result += "./Content/Content_Project4.xhtml";
        }
        else if(vPage == 5)
        {
            Result += "./Content/Content_Project5.xhtml";
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
        else if(vPage == 1)
        {
            Result += "./Content/Versions_Project1.xhtml";
        }
        else if(vPage == 2)
        {
            Result += "./Content/Versions_Project2.xhtml";
        }
        else if(vPage == 3)
        {
            Result += "./Content/Versions_Project3.xhtml";
        }
        else if(vPage == 4)
        {
            Result += "./Content/Versions_Project4.xhtml";
        }
        else if(vPage == 5)
        {
            Result += "./Content/Versions_Project5.xhtml";
        }

        return Result;
    }
}
