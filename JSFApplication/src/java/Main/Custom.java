package Main;

public class Custom
{
    Universal bob;

    public Custom()
    {
        
        bob = new Universal();
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
            Result += "./Content/Content_AboutUs.xhtml";
        }
        else if(vPage == 2)
        {
            Result += "./Content/Content_Media.xhtml";
        }
        else if(vPage == 3)
        {
            Result += "./Content/Content_Minecraft.xhtml";
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
            Result += "./Content/Versions_AboutUs.xhtml";
        }
        else if(vPage == 2)
        {
            Result += "./Content/Versions_Media.xhtml";
        }
        else if(vPage == 3)
        {
            Result += "./Content/Versions_Minecraft.xhtml";
        }

        return Result;
    }

}
