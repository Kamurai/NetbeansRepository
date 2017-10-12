package Section2.Section5.Section2;

import Section2.Section5.*;
import Section2.*;

public class Custom extends Section2.Section5.Custom
{
    Main.Universal universal;

    public Custom()
    {
        this.universal = new Main.Universal();
    }

    public String Navigation(int vLevel)
    {
        String Result = "";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Section1/Index.jsp'>Gynowars</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Project2.jsp'>Assault</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Project3.jsp'>Mars</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Section4/Index.jsp'>Renley</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Section5/Index.jsp'>Antarrea</a><br/><br/>";
            Result += "<a class=\"navlinkB\" href='"+universal.GetPath(vLevel)+"Section2/Section5/Section1/Index.jsp'>Global</a><br/><br/>";
            Result += "<a class=\"navlinkB\" href='"+universal.GetPath(vLevel)+"Section2/Section5/Section2/Index.jsp'>Grendol</a><br/><br/>";
                Result += "<a class=\"navlinkC\" href='"+universal.GetPath(vLevel)+"Section2/Section5/Section2/Project1.jsp'>Land of the Orcish Empire: Age of Magic</a><br/><br/>";
                Result += "<a class=\"navlinkC\" href='"+universal.GetPath(vLevel)+"Section2/Section5/Section2/Project2.jsp'>Coliseum: Arena</a><br/><br/>";
            Result += "<a class=\"navlinkB\" href='"+universal.GetPath(vLevel)+"Section2/Section5/Section3/Index.jsp'>Utopia</a><br/><br/>";
            Result += "<a class=\"navlinkB\" href='"+universal.GetPath(vLevel)+"Section2/Section5/Section4/Index.jsp'>Elvia</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Project6.jsp'>Truth</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Project7.jsp'>Kingdoms</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Project8.jsp'>Terminal World</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Project9.jsp'>Monster Office Workplace</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Project10.jsp'>Battle Princesses</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Project11.jsp'>Sacred Offerings</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Project12.jsp'>The Way</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Project13.jsp'>Conspiratorium</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Project14.jsp'>Conversion</a><br/><br/>";
        return Result;
    }

    public String Title(int vPage)
    {
        String Result = "";
        Result += "<title>";
            if(vPage == 0)
            {
                Result += "Grendol";
            }
            else if(vPage == 1)
            {
                Result += "Land of the Orcish Empire: Age of Magic";
            }
            else if(vPage == 2)
            {
                Result += "Coliseum: Arena";
            }

        Result += "</title>";
        return Result;
    }

    public String Header(int vPage)
    {
        String Result = "";
        Result += "<h2>";
        if(vPage == 0)
        {
            Result += "Grendol";
        }
        else if(vPage == 1)
        {
            Result += "Land of the Orcish Empire: Age of Magic";
        }
        else if(vPage == 2)
        {
            Result += "Coliseum: Arena";
        }
        Result += "</h2>";
        
        return Result;
    }

    public String Content(int vPage)
    {
        String Result = "";
        Result += "<p id=\"idCenterContent\">";
            if(vPage == 0)
            {
                Result += "Here are projects based in the Grendol Empire:</br>";
                Result += "</br>";
                Result += "Land of the Orcish Empire: Age of Magic: a CCG based on the different factions that ";
                Result += "comprise the Grendol Empire.</br>";
                Result += "Coliseum: Arena: a CCG representing the gladitorial arenas of Grendol.</br>";
            }
            else if(vPage == 1)
            {
                Result += "Land of the Orcish Empire: Age of Magic: is a CCG based on the different factions that ";
                Result += "comprise the Grendol Empire.";
            }
            else if(vPage == 2)
            {
                Result += "Coliseum: Arena is a CCG representing the gladitorial arenas of Grendol.";
            }

        Result += "</p>";
        return Result;
    }
    
    public String Versions(int vPage)
    {
        String Result = "";
        if(vPage == 0)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section2/Index.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section2/Index.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section5/Section2/Index.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section5/Section2/Index.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section5/Section2/Index.asp\">ASP VBscript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section5/Section2/Index.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section2/Index.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section5/Section2/Index\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section2/Index.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section5/Section2/Index.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section5/Section2/Index.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section2/Index.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section5/Section2/Index\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section5/Section2/Index.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section5/Section2/Index\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section5/Section2/Index\">Ruby on Rails</a><br/>";
        }
        else if(vPage == 1)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section2/Project1.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section2/Project1.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section5/Section2/Project1.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section5/Section2/Project1.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section5/Section2/Project1.asp\">ASP VBscript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section5/Section2/Project1.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section2/Project1.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section5/Section2/Project1\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section2/Project1.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section5/Section2/Project1.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section5/Section2/Project1.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section2/Project1.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section5/Section2/Project1\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section5/Section2/Project1.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section5/Section2/Project1\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section5/Section2/Project1\">Ruby on Rails</a><br/>";
        }
        else if(vPage == 2)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section2/Project2.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section2/Project2.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section5/Section2/Project2.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section5/Section2/Project2.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section5/Section2/Project2.asp\">ASP VBscript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section5/Section2/Project2.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section2/Project2.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section5/Section2/Project2\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section2/Project2.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section5/Section2/Project2.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section5/Section2/Project2.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section2/Project2.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section5/Section2/Project2\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section5/Section2/Project2.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section5/Section2/Project2\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section5/Section2/Project2\">Ruby on Rails</a><br/>";
        }
        return Result;
    }
}
