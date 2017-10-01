package Section1.Section4;

import Main.*;

public class Custom extends Section1.Custom
{
    Universal bob;

    public Custom()
    {
        bob = new Universal();
    }

    public String Navigation(int level, int extension)
    {
        String Result = "";
        Result += "<a class=\"navlinkA\" href='http://htkb.dyndns.org/Section1/index.html'>Basic HTML</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='http://htkb.dyndns.org/Section1/index.php'>PHP</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section1/Section2/index.jsp'>Javascript</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='http://htkb.dyndns.org/Section1/index.shtml'>Perl</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section1/Section4/index.jsp'>Java</a><br/><br/>";
            Result += "<a class=\"navlinkB\" href='"+bob.GetPath(level)+"Section1/Section4/Project1.jsp'>JSP Programming</a><br/><br/>";
            Result += "<a class=\"navlinkB\" href='http://htkb.dyndns.org:8080/JSFApplication/Section1/Section4/Project2.xhtml'>JSF Programming</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section1/Section5/index.jsp'>ASP.Net</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section1/Section6/index.jsp'>Databases</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href=\"http://htkb.dyndns.org/SSI/Section1/index.html\">Apache SSI</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href=\"http://htkb.dyndns.org:82/Section1/index\">Python Web.py</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href=\"http://htkb.dyndns.org:83/Section1/index\">Ruby on Rails</a><br/><br/>";
        return Result;
    }

    public String Title(int input)
    {
        String Result = "";
        Result += "<title>";
            if(input == 0)
            {
                Result += "Java Programming";
            }
            else if(input == 1)
            {
                Result += "JSP Programming";
            }
        Result += "</title>";
        return Result;
    }

    public String Header(int input)
    {
        String Result = "";
        Result += "<h2>";
        if(input == 0)
        {
            Result += "Java Programming";
        }
        else if(input == 1)
        {
            Result += "JSP Programming";
        }
        Result += "</h2>";
        
        return Result;
    }

    public String Content(int input)
    {
        String Result = "";
        Result += "<p id=\"idCenterContent\">";
            if(input == 0)
            {
                Result += "This section is dedicated to Java based programming.";
            }
            else if(input == 1)
            {
                Result += "This section is dedicated to JSP based programming.";
            }
        Result += "</p>";
        return Result;
    }
    
    public String Versions(int input)
    {
        String Result = "";
        if(input == 0)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section1/Section4/index.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section1/Section4/index.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section1/Section4/index.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section1/Section4/index.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section1/Section4/index.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section1/Section4/index.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section1/Section4/index.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section1/Section4/index\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section1/Section4/index.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section1/Section4/index.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section1/Section4/index.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section1/Section4/index.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section1/Section4/index\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section1/Section4/index.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section1/Section4/index\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section1/Section4/index\">Ruby on Rails</a><br/>";
        }
        else if(input == 1)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section1/Section4/Project1.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section1/Section4/Project1.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section1/Section4/Project1.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section1/Section4/Project1.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section1/Section4/Project1.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section1/Section4/Project1.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section1/Section4/Project1.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section1/Section4/Project1\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section1/Section4/Project1.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section1/Section4/Project1.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section1/Section4/Project1.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section1/Section4/Project1.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section1/Section4/Project1\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section1/Section4/Project1.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section1/Section4/Project1\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section1/Section4/Project1\">Ruby on Rails</a><br/>";
        }
        return Result;
    }
}
