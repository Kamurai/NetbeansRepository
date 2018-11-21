package Division2;

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
        else if(vPage == 2)
        {
            Result += "./Content/Content_Project2.xhtml";
        }
        else if(vPage == 3)
        {
            Result += "./Content/Content_Project3.xhtml";
        }
        else if(vPage == 6)
        {
            Result += "./Content/Content_Project6.xhtml";
        }
        else if(vPage == 7)
        {
            Result += "./Content/Content_Project7.xhtml";
        }
        else if(vPage == 8)
        {
            Result += "./Content/Content_Project8.xhtml";
        }
        else if(vPage == 9)
        {
            Result += "./Content/Content_Project9.xhtml";
        }
        else if(vPage == 10)
        {
            Result += "./Content/Content_Project10.xhtml";
        }
        else if(vPage == 11)
        {
            Result += "./Content/Content_Project11.xhtml";
        }
        else if(vPage == 12)
        {
            Result += "./Content/Content_Project12.xhtml";
        }
        else if(vPage == 13)
        {
            Result += "./Content/Content_Project13.xhtml";
        }
        else if(vPage == 14)
        {
            Result += "./Content/Content_Project14.xhtml";
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
        else if(vPage == 2)
        {
            Result += "./Content/Versions_Project2.xhtml";
        }
        else if(vPage == 3)
        {
            Result += "./Content/Versions_Project3.xhtml";
        }
        else if(vPage == 6)
        {
            Result += "./Content/Versions_Project6.xhtml";
        }
        else if(vPage == 7)
        {
            Result += "./Content/Versions_Project7.xhtml";
        }
        else if(vPage == 8)
        {
            Result += "./Content/Versions_Project8.xhtml";
        }
        else if(vPage == 9)
        {
            Result += "./Content/Versions_Project9.xhtml";
        }
        else if(vPage == 10)
        {
            Result += "./Content/Versions_Project10.xhtml";
        }
        else if(vPage == 11)
        {
            Result += "./Content/Versions_Project11.xhtml";
        }
        else if(vPage == 12)
        {
            Result += "./Content/Versions_Project12.xhtml";
        }
        else if(vPage == 13)
        {
            Result += "./Content/Versions_Project13.xhtml";
        }
        else if(vPage == 14)
        {
            Result += "./Content/Versions_Project14.xhtml";
        }
        
        return Result;
    }
}
