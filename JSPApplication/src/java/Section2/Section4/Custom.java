package Section2.Section4;

import Section2.*;

public class Custom extends Section2.Custom
{
    Main.Universal bob;

    public Custom()
    {
        bob = new Main.Universal();
    }

    public String Navigation(int level, int extension)
    {
        String Result = "";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Section1/Section2/Section4/index"+bob.GetExtension(extension)+"'>Gynowars</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Project2"+bob.GetExtension(extension)+"'>Assault</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Project3"+bob.GetExtension(extension)+"'>Mars</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Section4/Section2/Section4/index"+bob.GetExtension(extension)+"'>Renley</a><br/><br/>";
            Result += "<a class=\"navlinkB\" href='"+bob.GetPath(level)+"Section2/Section4/Project1.html'>Warring Nations</a><br/><br/>";
            Result += "<a class=\"navlinkB\" href='"+bob.GetPath(level)+"Section2/Section4/Project2.html'>Psychodom: The One Empire</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Section5/Section2/Section4/index"+bob.GetExtension(extension)+"'>Antarrea</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Section6/Section2/Section4/index"+bob.GetExtension(extension)+"'>Editations</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Project7/Section2/Section4/index"+bob.GetExtension(extension)+"'>Truth</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Project8"+bob.GetExtension(extension)+"'>Kingdoms</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Project9"+bob.GetExtension(extension)+"'>Terminal World</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Project10"+bob.GetExtension(extension)+"'>Monster Office Workplace</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Project11"+bob.GetExtension(extension)+"'>Battle Princesses</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Project12"+bob.GetExtension(extension)+"'>Sacred Offerings</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Project13"+bob.GetExtension(extension)+"'>The Way</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Project14"+bob.GetExtension(extension)+"'>Conspiratorium</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Project15"+bob.GetExtension(extension)+"'>Conversion</a><br/><br/>";
        return Result;
    }

    public String Title(int input)
    {
        String Result = "";
        Result += "<title>";
            if(input == 0)
            {
                Result += "Renley";
            }
            else if(input == 1)
            {
                Result += "Warring Nations";
            }
            else if(input == 2)
            {
                Result += "Psychodom: The One Empire";
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
            Result += "Renley";
        }
        else if(input == 1)
        {
            Result += "Warring Nations";
        }
        else if(input == 2)
        {
            Result += "Psychodom: The One Empire";
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
                Result += "This section is dedicated to projects centered in the Renley universe.";
            }
            else if(input == 1)
            {
                Result += "Warring Nations is a Tactical RPG involving squad based battles.";
                Result += "Characters advance classes based on their weapon proficiencies and/or currently equipped weapons.";
            }
            else if(input == 2)
            {
                Result += "Psychodom: The One Empire is a 3rd person perspective Adventure / RPG.";
                Result += "The protagonist is tasked with investigating various situations leading ";
                Result += "to a conspiracy about who is really ruling the continent.";
            }
            
        Result += "</p>";
        return Result;
    }
    
    public String Versions(int input)
    {
        String Result = "";
        if(input == 0)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section4/index.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section4/index.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section4/index.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section4/index.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section4/index.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section4/index.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section4/index.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section4/index\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section4/index.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section4/index.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section4/index.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section4/index.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section4/index\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section4/index.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section4/index\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section4/index\">Ruby on Rails</a><br/>";
        }
        else if(input == 1)
        {
            Result += "<a href=\"http://htkb.dyndns.org/index.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/index.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/index.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/index.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/index.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/index.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/index.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/index\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/index.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/index.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/index.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/index.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/index\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/index.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/index\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/index\">Ruby on Rails</a><br/>";
        }
        else if(input == 2)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section4/Project2.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section4/Project2.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section4/Project2.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section4/Project2.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section4/Project2.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section4/Project2.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section4/Project2.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section4/Project2.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section4/Project2.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Main/Section2/Section4/Project2\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section4/Project2.html\">Apache SSI</a><br/>";
        }
        return Result;
    }
}
