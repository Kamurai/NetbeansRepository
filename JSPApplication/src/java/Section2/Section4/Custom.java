package Section2.Section4;

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
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Section1/Section2/Section4/Index.jsp'>Gynowars</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Project2.jsp'>Assault</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Project3.jsp'>Mars</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Section4/Section2/Section4/Index.jsp'>Renley</a><br/><br/>";
            Result += "<a class=\"navlinkB\" href='"+universal.GetPath(vLevel)+"Section2/Section4/Project1.html'>Warring Nations</a><br/><br/>";
            Result += "<a class=\"navlinkB\" href='"+universal.GetPath(vLevel)+"Section2/Section4/Project2.html'>Psychodom: The One Empire</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+universal.GetPath(vLevel)+"Section2/Section5/Section2/Section4/Index.jsp'>Antarrea</a><br/><br/>";
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
                Result += "Renley";
            }
            else if(vPage == 1)
            {
                Result += "Warring Nations";
            }
            else if(vPage == 2)
            {
                Result += "Psychodom: The One Empire";
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
            Result += "Renley";
        }
        else if(vPage == 1)
        {
            Result += "Warring Nations";
        }
        else if(vPage == 2)
        {
            Result += "Psychodom: The One Empire";
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
                Result += "This section is dedicated to projects centered in the Renley universe.";
            }
            else if(vPage == 1)
            {
                Result += "Warring Nations is a Tactical RPG involving squad based battles.";
                Result += "Characters advance classes based on their weapon proficiencies and/or currently equipped weapons.";
            }
            else if(vPage == 2)
            {
                Result += "Psychodom: The One Empire is a 3rd person perspective Adventure / RPG.";
                Result += "The protagonist is tasked with investigating various situations leading ";
                Result += "to a conspiracy about who is really ruling the continent.";
            }
            
        Result += "</p>";
        return Result;
    }
    
    public String Versions(int vPage)
    {
        String Result = "";
        if(vPage == 0)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section4/Index.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section4/Index.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section4/Index.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section4/Index.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section4/Index.asp\">ASP VBscript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section4/Index.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section4/Index.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section4/Index\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section4/Index.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section4/Index.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section4/Index.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section4/Index.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section4/Index\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section4/Index.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section4/Index\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section4/Index\">Ruby on Rails</a><br/>";
        }
        else if(vPage == 1)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section4/Project1.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section4/Project1.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section4/Project1.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section4/Project1.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section4/Project1.asp\">ASP VBscript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section4/Project1.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section4/Project1.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section4/Project1\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section4/Project1.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section4/Project1.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section4/Project1.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section4/Project1.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section4/Project1\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section4/Project1.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section4/Project1\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section4/Project1\">Ruby on Rails</a><br/>";
        }
        else if(vPage == 2)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section4/Project2.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section4/Project2.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section4/Project2.html\">HTML Javascript</a><br/>";
			Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section4/Project2.html\">JQuery</a><br/>";
			Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section4/Project2.asp\">ASP VBscript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section4/Project2.aspx\">ASP.NET Javascript</a><br/>";
			Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section4/Project2\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section4/Project2.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section4/Project2.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section4/Project2.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section4/Project2.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Main/Section2/Section4/Project2\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section4/Project2.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section4/Project2\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section4/Project2\">Ruby on Rails</a><br/>";
        }
        return Result;
    }
}
