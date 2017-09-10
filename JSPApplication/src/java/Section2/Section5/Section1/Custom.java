package Section2.Section5.Section1;

import Section2.Section5.*;
import Section2.*;

public class Custom extends Section2.Section5.Custom
{
    Main.Universal bob;

    public Custom()
    {
        bob = new Main.Universal();
    }

    public String Navigation(int level, int extension)
    {
        String Result = "";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Section1/index"+bob.GetExtension(extension)+"'>Gynowars</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Project2"+bob.GetExtension(extension)+"'>Assault</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Project3"+bob.GetExtension(extension)+"'>Mars</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Section4/index"+bob.GetExtension(extension)+"'>Renley</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Section5/index"+bob.GetExtension(extension)+"'>Antarrea</a><br/><br/>";
            Result += "<a class=\"navlinkB\" href='"+bob.GetPath(level)+"Section2/Section5/Section1/Index"+bob.GetExtension(extension)+"'>Global</a><br/><br/>";
                Result += "<a class=\"navlinkC\" href='"+bob.GetPath(level)+"Section2/Section5/Section1/Project1"+bob.GetExtension(extension)+"'>Team Tactial: Crash Ball</a><br/><br/>";
                Result += "<a class=\"navlinkC\" href='"+bob.GetPath(level)+"Section2/Section5/Section1/Project2"+bob.GetExtension(extension)+"'>Wars of Antarrea</a><br/><br/>";
                Result += "<a class=\"navlinkC\" href='"+bob.GetPath(level)+"Section2/Section5/Section1/Project3"+bob.GetExtension(extension)+"'>Revolutions: Invading Nations</a><br/><br/>";
                Result += "<a class=\"navlinkC\" href='"+bob.GetPath(level)+"Section2/Section5/Section1/Project4"+bob.GetExtension(extension)+"'>Revolutions: Rebellion Against the Fist</a><br/><br/>";
                Result += "<a class=\"navlinkC\" href='"+bob.GetPath(level)+"Section2/Section5/Section1/Project5"+bob.GetExtension(extension)+"'>Revolutions: Return to Arms</a><br/><br/>";
                Result += "<a class=\"navlinkC\" href='"+bob.GetPath(level)+"Section2/Section5/Section1/Project6"+bob.GetExtension(extension)+"'>Revolutions: Post Wars</a><br/><br/>";
            Result += "<a class=\"navlinkB\" href='"+bob.GetPath(level)+"Section2/Section5/Section2/Index"+bob.GetExtension(extension)+"'>Grendol</a><br/><br/>";
            Result += "<a class=\"navlinkB\" href='"+bob.GetPath(level)+"Section2/Section5/Section3/Index"+bob.GetExtension(extension)+"'>Utopia</a><br/><br/>";
            Result += "<a class=\"navlinkB\" href='"+bob.GetPath(level)+"Section2/Section5/Section4/Index"+bob.GetExtension(extension)+"'>Elvia</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Section6/index"+bob.GetExtension(extension)+"'>Editations</a><br/><br/>";
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Project7/index"+bob.GetExtension(extension)+"'>Truth</a><br/><br/>";
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
                Result += "Global Antarrea";
            }
            else if(input == 1)
            {
                Result += "Team Tactical: Crash Ball";
            }
            else if(input == 2)
            {
                Result += "Wars of Antarrea";
            }
            else if(input == 3)
            {
                Result += "Revolutions: Invading Nations";
            }
            else if(input == 4)
            {
                Result += "Revolutions: Rebellion Against the Fist";
            }
            else if(input == 5)
            {
                Result += "Revolutions: Return to Arms";
            }
            else if(input == 6)
            {
                Result += "Revolutions: Post Wars";
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
                Result += "Global Antarrea";
            }
            else if(input == 1)
            {
                Result += "Team Tactical: Crash Ball";
            }
            else if(input == 2)
            {
                Result += "Wars of Antarrea";
            }
            else if(input == 3)
            {
                Result += "Revolutions: Invading Nations";
            }
            else if(input == 4)
            {
                Result += "Revolutions: Rebellion Against the Fist";
            }
            else if(input == 5)
            {
                Result += "Revolutions: Return to Arms";
            }
            else if(input == 6)
            {
                Result += "Revolutions: Post Wars";
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
                Result += "Here are projects based in the Antarrea universe:</br>";
                Result += "</br>";
                Result += "Team Tactical: Crash Ball:               Tactical board game centered on a battle version of football.</br>";
                Result += "Wars of Antarrea:                        Table-top game where two or more armies battle for supremacy.</br>";
                Result += "Revolutions: Invading Nations:           Tactical RPG, 1st story arc.</br>";
                Result += "Revolutions: Rebellion Against the Fist: Tactical RPG, 2nd story arc.</br>";
                Result += "Revolutions: Return to Arms:             Tactical RPG, 3rd story arc.</br>";
                Result += "Revoultions: Post Wars:                  Tactical RPG, 4th story arc.</br>";
            }
            else if(input == 1)
            {
                Result += "Team Tactical: Crash Ball is a tactical board game centered on a battle version of football.</br>";
            }
            else if(input == 2)
            {
                Result += "Wars of Antarrea is a table-top game where two or more armies battle for supremacy.</br>";
            }
            else if(input == 3)
            {
                Result += "Revolutions is a Tactical RPG with Invading Nations as its 1st story arc.</br>";
            }
            else if(input == 4)
            {
                Result += "Revolutions is a Tactical RPG with Rebellion Against the Fist as its 2nd story arc.</br>";
            }
            else if(input == 5)
            {
                Result += "Revolutions is a Tactical RPG with Return to Arms as its 3rd story arc.</br>";
            }
            else if(input == 6)
            {
                Result += "Revolutions is a Tactical RPG with Post Wars as its 4th story arc.</br>";
            }

        Result += "</p>";
        return Result;
    }
    
    public String Versions(int input)
    {
        String Result = "";
        if(input == 0)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/index.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/index.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section5/Section1/index.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section5/Section1/index.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section5/Section1/index.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/index.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section5/Section1/index.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section5/Section1/index.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section1/index.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section5/Section1/index\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section5/Section1/index.html\">Apache SSI</a><br/>";
        }
        else if(input == 1)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project1.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project1.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section5/Section1/Project1.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section5/Section1/Project1.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section5/Section1/Project1.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project1.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section5/Section1/Project1.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section5/Section1/Project1.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section1/Project1.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section5/Section1/Project1\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section5/Section1/Project1.html\">Apache SSI</a><br/>";
        }
        else if(input == 2)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project2.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project2.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section5/Section1/Project2.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section5/Section1/Project2.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section5/Section1/Project2.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project2.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section5/Section1/Project2.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section5/Section1/Project2.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section1/Project2.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Main/Section2/Section5/Section1/Project2\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section5/Section1/Project2.html\">Apache SSI</a><br/>";
        }
        else if(input == 3)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project3.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project3.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section5/Section1/Project3.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section5/Section1/Project3.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section5/Section1/Project3.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project3.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section5/Section1/Project3.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section5/Section1/Project3.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section1/Project3.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section5/Section1/Project3\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section5/Section1/Project3.html\">Apache SSI</a><br/>";
        }
        else if(input == 4)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project4.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project4.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section5/Section1/Project4.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section5/Section1/Project4.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section5/Section1/Project4.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project4.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section5/Section1/Project4.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section5/Section1/Project4.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section1/Project4.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section5/Section1/Project4\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section5/Section1/Project4.html\">Apache SSI</a><br/>";
        }
        else if(input == 5)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project5.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project5.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section5/Section1/Project5.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section5/Section1/Project5.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section5/Section1/Project5.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project5.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section5/Section1/Project5.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section5/Section1/Project5.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section1/Project5.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section5/Section1/Project5\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section5/Section1/Project5.html\">Apache SSI</a><br/>";
        }
        else if(input == 6)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project6.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project6.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section5/Section1/Project6.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section5/Section1/Project6.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section5/Section1/Project6.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project6.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section5/Section1/Project6.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section5/Section1/Project6.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section1/Project6.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section5/Section1/Project6\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section5/Section1/Project6.html\">Apache SSI</a><br/>";
        }
        return Result;
    }
}
