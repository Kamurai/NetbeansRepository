package Main;

public class Custom
{
    int level;
    int page;
    int extension;

    Universal bob;

    public Custom()
    {
        
        bob = new Universal();
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
            Result += "./Content/Content_AboutUs.xhtml";
        }
        else if(input == 2)
        {
            Result += "./Content/Content_Media.xhtml";
        }
        else if(input == 3)
        {
            Result += "./Content/Content_Minecraft.xhtml";
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
            Result += "./Content/Versions_AboutUs.xhtml";
        }
        else if(input == 2)
        {
            Result += "./Content/Versions_Media.xhtml";
        }
        else if(input == 3)
        {
            Result += "./Content/Versions_Minecraft.xhtml";
        }

        return Result;
    }

}
