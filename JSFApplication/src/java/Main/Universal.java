package Main;

public class Universal
{
    public Universal()
    {

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
        String Result = "";
        Result += "This page is written using JSF.";
        Result += "Other versions of this page are here:";
        return Result;
    }

    public String getWebMaster()
    {
        String Result = "";
        Result += "Website managed by Kamurai.";
        return Result;
    }

    public String getPath(int level)
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
