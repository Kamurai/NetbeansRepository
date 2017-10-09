package Section2.Section5.Section1;

import Section2.Section5.*;
import Section2.*;

public class Custom extends Section2.Section5.Custom
{
    Main.Universal universal;

    public Custom()
    {
        universal = new Main.Universal();
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
                Result += "<a class=\"navlinkC\" href='"+universal.GetPath(vLevel)+"Section2/Section5/Section1/Project1.jsp'>Team Tactial: Crash Ball</a><br/><br/>";
                Result += "<a class=\"navlinkC\" href='"+universal.GetPath(vLevel)+"Section2/Section5/Section1/Project2.jsp'>Wars of Antarrea</a><br/><br/>";
                Result += "<a class=\"navlinkC\" href='"+universal.GetPath(vLevel)+"Section2/Section5/Section1/Project3.jsp'>Revolutions: Invading Nations</a><br/><br/>";
                Result += "<a class=\"navlinkC\" href='"+universal.GetPath(vLevel)+"Section2/Section5/Section1/Project4.jsp'>Revolutions: Rebellion Against the Fist</a><br/><br/>";
                Result += "<a class=\"navlinkC\" href='"+universal.GetPath(vLevel)+"Section2/Section5/Section1/Project5.jsp'>Revolutions: Return to Arms</a><br/><br/>";
                Result += "<a class=\"navlinkC\" href='"+universal.GetPath(vLevel)+"Section2/Section5/Section1/Project6.jsp'>Revolutions: Post Wars</a><br/><br/>";
            Result += "<a class=\"navlinkB\" href='"+universal.GetPath(vLevel)+"Section2/Section5/Section2/Index.jsp'>Grendol</a><br/><br/>";
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
                Result += "Global Antarrea";
            }
            else if(vPage == 1)
            {
                Result += "Team Tactical: Crash Ball";
            }
            else if(vPage == 2)
            {
                Result += "Wars of Antarrea";
            }
            else if(vPage == 3)
            {
                Result += "Revolutions: Invading Nations";
            }
            else if(vPage == 4)
            {
                Result += "Revolutions: Rebellion Against the Fist";
            }
            else if(vPage == 5)
            {
                Result += "Revolutions: Return to Arms";
            }
            else if(vPage == 6)
            {
                Result += "Revolutions: Post Wars";
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
                Result += "Global Antarrea";
            }
            else if(vPage == 1)
            {
                Result += "Team Tactical: Crash Ball";
            }
            else if(vPage == 2)
            {
                Result += "Wars of Antarrea";
            }
            else if(vPage == 3)
            {
                Result += "Revolutions: Invading Nations";
            }
            else if(vPage == 4)
            {
                Result += "Revolutions: Rebellion Against the Fist";
            }
            else if(vPage == 5)
            {
                Result += "Revolutions: Return to Arms";
            }
            else if(vPage == 6)
            {
                Result += "Revolutions: Post Wars";
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
                Result += "Here are projects based in the Antarrea universe:</br>";
                Result += "</br>";
                Result += "Team Tactical: Crash Ball:               Tactical board game centered on a battle version of football.</br>";
                Result += "Wars of Antarrea:                        Table-top game where two or more armies battle for supremacy.</br>";
                Result += "Revolutions: Invading Nations:           Tactical RPG, 1st story arc.</br>";
                Result += "Revolutions: Rebellion Against the Fist: Tactical RPG, 2nd story arc.</br>";
                Result += "Revolutions: Return to Arms:             Tactical RPG, 3rd story arc.</br>";
                Result += "Revoultions: Post Wars:                  Tactical RPG, 4th story arc.</br>";
            }
            else if(vPage == 1)
            {
                Result += "Team Tactical: Crash Ball is a tactical board game centered on a battle version of football.</br>";
            }
            else if(vPage == 2)
            {
                Result += "Wars of Antarrea is a table-top game where two or more armies battle for supremacy.</br>";
            }
            else if(vPage == 3)
            {
                Result += "Revolutions is a Tactical RPG with Invading Nations as its 1st story arc.</br>";
            }
            else if(vPage == 4)
            {
                Result += "Revolutions is a Tactical RPG with Rebellion Against the Fist as its 2nd story arc.</br>";
            }
            else if(vPage == 5)
            {
                Result += "Revolutions is a Tactical RPG with Return to Arms as its 3rd story arc.</br>";
            }
            else if(vPage == 6)
            {
                Result += "Revolutions is a Tactical RPG with Post Wars as its 4th story arc.</br>";
            }

        Result += "</p>";
        return Result;
    }
    
    public String Versions(int vPage)
    {
        String Result = "";
        if(vPage == 0)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Index.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Index.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section5/Section1/Index.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section5/Section1/Index.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section5/Section1/Index.asp\">ASP VBscript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section5/Section1/Index.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section1/Index.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section5/Section1/Index\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Index.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section5/Section1/Index.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section5/Section1/Index.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section1/Index.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section5/Section1/Index\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section5/Section1/Index.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section5/Section1/Index\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section5/Section1/Index\">Ruby on Rails</a><br/>";
        }
        else if(vPage == 1)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project1.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project1.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section5/Section1/Project1.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section5/Section1/Project1.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section5/Section1/Project1.asp\">ASP VBscript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section5/Section1/Project1.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section1/Project1.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section5/Section1/Project1\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project1.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section5/Section1/Project1.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section5/Section1/Project1.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section1/Project1.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section5/Section1/Project1\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section5/Section1/Project1.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section5/Section1/Project1\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section5/Section1/Project1\">Ruby on Rails</a><br/>";
        }
        else if(vPage == 2)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project2.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project2.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section5/Section1/Project2.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section5/Section1/Project2.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section5/Section1/Project2.asp\">ASP VBscript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section5/Section1/Project2.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section1/Project2.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section5/Section1/Project2\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project2.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section5/Section1/Project2.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section5/Section1/Project2.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section1/Project2.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section5/Section1/Project2\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section5/Section1/Project2.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section5/Section1/Project2\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section5/Section1/Project2\">Ruby on Rails</a><br/>";
        }
        else if(vPage == 3)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project3.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project3.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section5/Section1/Project3.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section5/Section1/Project3.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section5/Section1/Project3.asp\">ASP VBscript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section5/Section1/Project3.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section1/Project3.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section5/Section1/Project3\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project3.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section5/Section1/Project3.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section5/Section1/Project3.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section1/Project3.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section5/Section1/Project3\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section5/Section1/Project3.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section5/Section1/Project3\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section5/Section1/Project3\">Ruby on Rails</a><br/>";
        }
        else if(vPage == 4)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project4.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project4.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section5/Section1/Project4.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section5/Section1/Project4.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section5/Section1/Project4.asp\">ASP VBscript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section5/Section1/Project4.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section1/Project4.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section5/Section1/Project4\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project4.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section5/Section1/Project4.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section5/Section1/Project4.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section1/Project4.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section5/Section1/Project4\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section5/Section1/Project4.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section5/Section1/Project4\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section5/Section1/Project4\">Ruby on Rails</a><br/>";
        }
        else if(vPage == 5)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project5.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project5.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section5/Section1/Project5.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section5/Section1/Project5.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section5/Section1/Project5.asp\">ASP VBscript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section5/Section1/Project5.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section1/Project5.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section5/Section1/Project5\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project5.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section5/Section1/Project5.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section5/Section1/Project5.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section1/Project5.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section5/Section1/Project5\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section5/Section1/Project5.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section5/Section1/Project5\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section5/Section1/Project5\">Ruby on Rails</a><br/>";
        }
        else if(vPage == 6)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project6.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project6.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section5/Section1/Project6.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section5/Section1/Project6.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section5/Section1/Project6.asp\">ASP VBscript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section5/Section1/Project6.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section1/Project6.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section5/Section1/Project6\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section5/Section1/Project6.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section5/Section1/Project6.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section5/Section1/Project6.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section5/Section1/Project6.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section5/Section1/Project6\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section5/Section1/Project6.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section5/Section1/Project6\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section5/Section1/Project6\">Ruby on Rails</a><br/>";
        }
        return Result;
    }
}
