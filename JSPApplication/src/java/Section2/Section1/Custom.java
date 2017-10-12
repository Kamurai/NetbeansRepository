package Section2.Section1;

import Section2.*;

public class Custom extends Section2.Custom
{
    Main.Universal universal;

    public Custom()
    {
        this.universal = new Main.Universal();
    }

    public String Navigation(int vLevel)
    {
        String Result = "";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Section1/Section2/Section1/Project1.jsp'>Gynowars</a><br/><br/>";
            Result += "<a class=\"navlinkB\" href='"+universal.GetPath(vLevel)+"Section2/Section1/Project1.html'>Gynowars RPG</a><br/><br/>";
            Result += "<a class=\"navlinkB\" href='"+universal.GetPath(vLevel)+"Section2/Section1/Project2.html'>Gynowars: Battle Arena CCG</a><br/><br/>";
            Result += "<a class=\"navlinkB\" href='"+universal.GetPath(vLevel)+"Section2/Section1/Project3.html'>Gynowars: Crash Ball</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Project2.jsp'>Assault</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Project3.jsp'>Mars</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Section4/Section2/Section1/Project1.jsp'>Renley</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Section5/Section2/Section1/Project1.jsp'>Antarrea</a><br/><br/>";
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
                Result += "Gynowars";
            }
            else if(vPage == 1)
            {
                Result += "Gynowars RPG";
            }
            else if(vPage == 2)
            {
                Result += "Gynowars: Battle Arena CCG";
            }
            else if(vPage == 3)
            {
                Result += "Gynowars: Crash Ball";
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
                Result += "Gynowars";
            }
            else if(vPage == 1)
            {
                Result += "Gynowars RPG";
            }
            else if(vPage == 2)
            {
                Result += "Gynowars: Battle Arena CCG";
            }
            else if(vPage == 3)
            {
                Result += "Gynowars: Crash Ball";
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
                Result += "This section is dedicated to projects centered in the Gynowars universe.";
            }
            else if(vPage == 1)
            {
                Result += "The Gynowars RPG is a 'pokemon-like' tactical RPG.";
                Result += "The protagonist uses creatures to fight battles against other creatures to progress through the storyline.";
            }
            else if(vPage == 2)
            {
                Result += "Gynowars: Battle Arena is a CCG that pits teams of creatures against each other ";
                Result += "in an arena-like environment.  There are several scenarios to run, to include:";
                Result += "</br>";
                Result += "'Death Match', 'Ring the Bell', and 'Head Hunt'.";
            }
            else if(vPage == 3)
            {
                Result += "Gynowars: Crash Ball is a turn based strategy board game.  Basically it's gridiron with Gynos.";
            }
            
        Result += "</p>";
        return Result;
    }
    
    public String Versions(int vPage)
    {
        String Result = "";
        if(vPage == 0)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section1/Section2/Section1/Project1.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section1/Section2/Section1/Project1.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section1/Section2/Section1/Project1.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section1/Section2/Section1/Project1.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section1/Section2/Section1/Project1.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section1/Section2/Section1/Project1.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section1/Section2/Section1/Project1.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section1/Section2/Section1/Project1\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section1/Section2/Section1/Project1.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section1/Section2/Section1/Project1.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section1/Section2/Section1/Project1.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section1/Section2/Section1/Project1.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section1/Section2/Section1/Project1\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section1/Section2/Section1/Project1.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section1/Section2/Section1/Project1\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section1/Section2/Section1/Project1\">Ruby on Rails</a><br/>";
        }
        else if(vPage == 1)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section1/Project1.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section1/Project1.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section1/Project1.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section1/Project1.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section1/Project1.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section1/Project1.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section1/Project1.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section1/Project1\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section1/Project1.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section1/Project1.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section1/Project1.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section1/Project1.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section1/Project1\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section1/Project1.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section1/Project1\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section1/Project1\">Ruby on Rails</a><br/>";
        }
        else if(vPage == 2)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section1/Project2.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section1/Project2.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section1/Project2.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section1/Project2.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section1/Project2.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section1/Project2.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section1/Project2.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section1/Project2\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section1/Project2.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section1/Project2.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section1/Project2.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section1/Project2.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section1/Project2\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section1/Project2.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section1/Project2\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section1/Project2\">Ruby on Rails</a><br/>";
        }
        else if(vPage == 3)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section1/Project3.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section1/Project3.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section1/Project3.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section1/Project3.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section1/Project3.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section1/Project3.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section1/Project3.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section1/Project3\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section1/Project3.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section1/Project3.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section1/Project3.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section1/Project3.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section1/Project3\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section1/Project3.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section1/Project3\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section1/Project3\">Ruby on Rails</a><br/>";
        }
        return Result;
    }
}
