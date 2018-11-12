package Main;

public class Universal
{
    public Universal()
    {

    }

    public String writeHeader(int vLevel, int vSection)
    {
        String vResult = "";
        vResult += "<link rel='shortcut icon' href='"+getPath(vLevel)+"Pictures/favicon.ico' type='image/x-icon' />";
        vResult += "<link rel='icon' href='"+getPath(vLevel)+"Pictures/favicon.ico' type='image/x-icon' />";
        if(vSection == 1)
        {
            vResult += "<link href='http://htkb.dyndns.org/Styles/Division1.css' rel='stylesheet' type='text/css'>";
        }
        else if(vSection == 2)
        {
            vResult += "<link href='http://htkb.dyndns.org/Styles/Division2.css' rel='stylesheet' type='text/css'>";
        }
        else if(vSection == 3)
        {
            vResult += "<link href='http://htkb.dyndns.org/Styles/Division3.css' rel='stylesheet' type='text/css'>";
        }
        else
        {
            vResult += "<link href='http://htkb.dyndns.org/Styles/Main.css' rel='stylesheet' type='text/css'>";
        }
		
        return vResult;
    }

    public String getLogo(int vLevel)
    {
        String vResult = "";
        vResult += "<img  id=\"idLogo\" src='http://htkb.dyndns.org/Pictures/logoHTKB.jpg'><br>";

        return vResult;
    }

    public String getWebMaster()
    {
        String vResult = "";
		
        vResult += "Website managed by Kamurai.";
		
        return vResult;
    }

    public String getNavBar(int vLevel)
    {
        String vResult = "";
		
        vResult += "<a class=\"navBar\" href='"+getPath(vLevel)+"Index.jsp'>Home</a>";
        vResult += "<a class=\"navBar\" href='"+getPath(vLevel)+"Section1/Index.jsp'>Web Programming</a>";
        vResult += "<a class=\"navBar\" href='"+getPath(vLevel)+"Section2/Index.jsp'>Private Projects</a>";
        vResult += "<a class=\"navBar\" href='"+getPath(vLevel)+"Section3/Index.jsp'>Downloadable Projects</a>";
        
		return vResult;
    }

    public String getNavigationHeader()
    {
        String vResult = "";
	
        vResult += "<h4>";
	vResult += "Navigation";
	vResult += "</h4>";
	
	return vResult;
    }

    public String getInformationHeader()
    {
        String vResult = "";
	
        vResult += "<h4>";
	vResult += "Information";
	vResult += "</h4>";
	
	return vResult;
    }

    public String getInformation()
    {
        String vResult = "";
		
        vResult += "This is written using JSP.<br><br>";
        vResult += "Other versions of this page are here:<br>";
		
        return vResult;
    }
    
    public String getFooter()
    {
        String vResult = "";
		
        vResult += "© Copyright 2012 All rights reserved<br>";
        vResult += "House That Kamurai Built<br>";
		
        return vResult;
    }

    public String getGDR()
    {
        String vResult = "";
		
        vResult += "<a href='http://htkb.dyndns.org/Section3/downloads/GDR.zip'>You can download my Games Development Report here.</a></br>";
        
		return vResult;
    }

    public String getWinRAR()
    {
        String vResult = "";
		
        vResult += "<a href='http://htkb.dyndns.org/Section3/downloads/wrar371.exe'>You may need WinRar to open zip files from this site.</a></br>";
        
		return vResult;
    }
    
    public String getPath(int vLevel)
    {
        if(vLevel <= 0)
        {
            return "./";
        }
        else if(vLevel == 1)
        {
            return "../";
        }
        else if(vLevel == 2)
        {
            return "../../";
        }
        else if(vLevel == 3)
        {
            return "../../../";
        }
        else if(vLevel == 4)
        {
            return "../../../../";
        }
        else if(vLevel == 5)
        {
            return "../../../../../";
        }
        else if(vLevel == 6)
        {
            return "../../../../../../";
        }
        else if(vLevel == 7)
        {
            return "../../../../../../../";
        }
        else
        {
            return "./";
        }
    }
}
