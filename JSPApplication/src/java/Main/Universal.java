package Main;

public class Universal
{
    public Universal()
    {

    }

    public String WriteHeader(int vLevel, int vSection)
    {
        String Result = "";
        Result += "<link rel='shortcut icon' href='"+GetPath(vLevel)+"Pictures/favicon.ico' type='image/x-icon' />";
        Result += "<link rel='icon' href='"+GetPath(vLevel)+"Pictures/favicon.ico' type='image/x-icon' />";
        if(vSection == 1)
        {
            Result += "<link href='"+GetPath(vLevel-1)+"Section1.css' rel='stylesheet' type='text/css'>";
        }
        else if(vSection == 2)
        {
            Result += "<link href='"+GetPath(vLevel-1)+"Section2.css' rel='stylesheet' type='text/css'>";
        }
        else if(vSection == 3)
        {
            Result += "<link href='"+GetPath(vLevel-1)+"Section3.css' rel='stylesheet' type='text/css'>";
        }
        else
        {
            Result += "<link href='"+GetPath(vLevel-1)+"Main.css' rel='stylesheet' type='text/css'>";
        }
        return Result;
    }

    public String TitlePicture(int vLevel)
    {
        String Result = "";
        Result += "<img  id=\"idLogo\" src='"+GetPath(vLevel)+"Pictures/logo_HouseThatKamuraiBuilt_blueonblack.jpg'><br>";

        return Result;
    }

    public String WebMaster()
    {
        String Result = "";
            Result += "Website managed by Kamurai.";
        return Result;
    }

    public String NavBar(int vLevel)
    {
        String Result = "";
        Result += "<a class=\"navBar\" href='"+GetPath(vLevel)+"Index.xhtml'>Home</a>";
        Result += "<a class=\"navBar\" href='"+GetPath(vLevel)+"Section1/Index.xhtml'>Web Programming</a>";
        Result += "<a class=\"navBar\" href='"+GetPath(vLevel)+"Section2/Index.xhtml'>Private Projects</a>";
        Result += "<a class=\"navBar\" href='"+GetPath(vLevel)+"Section3/Index.xhtml'>Downloadable Projects</a>";
        return Result;
    }

    public String GDR()
    {
        String Result = "";
        Result += "<a href='http://htkb.dyndns.org/Section3/downloads/GDR.zip'>You can download my Games Development Report here.</a></br>";
        return Result;
    }

    public String WinRAR()
    {
        String Result = "";
        Result += "<a href='http://htkb.dyndns.org/Section3/downloads/wrar371.exe'>You may need WinRar to open zip files from this site.</a></br>";
        return Result;
    }

    public String Footer()
    {
        String Result = "";
        Result += "© Copyright 2012 All rights reserved<br>";
        Result += "House That Kamurai Built<br>";
        return Result;
    }

    public String Information()
    {
        String Result = "";
        Result += "This is written using JSP.<br><br>";
        Result += "Other versions of this page are here:<br>";
        return Result;
    }


    public String GetPath(int level)
    {
        if(level <= 0)
        {
            return "./";
        }
        else if(level == 1)
        {
            return "../";
        }
        else if(level == 2)
        {
            return "../../";
        }
        else if(level == 3)
        {
            return "../../../";
        }
        else if(level == 4)
        {
            return "../../../../";
        }
        else if(level == 5)
        {
            return "../../../../../";
        }
        else if(level == 6)
        {
            return "../../../../../../";
        }
        else if(level == 7)
        {
            return "../../../../../../../";
        }
        else
        {
            return "./";
        }
    }
}
