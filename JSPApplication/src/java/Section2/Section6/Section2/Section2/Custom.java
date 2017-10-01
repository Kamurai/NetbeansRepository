package Section2.Section6.Section2.Section2;

import Section2.Section6.Section2.*;
import Section2.Section6.*;
import Section2.*;

public class Custom extends Section2.Section6.Section2.Custom
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
        Result += "<a class=\"navlinkA\" href='"+bob.GetPath(level)+"Section2/Section6/index"+bob.GetExtension(extension)+"'>Editations</a><br/><br/>";
            Result += "<a class=\"navlinkB\" href='"+bob.GetPath(level)+"Section2/Section6/Project1"+bob.GetExtension(extension)+"'>Magic: The Tactical</a><br/><br/>";
            Result += "<a class=\"navlinkB\" href='"+bob.GetPath(level)+"Section2/Section6/Section2/index"+bob.GetExtension(extension)+"'>Warhammer 40K</a><br/><br/>";
                Result += "<a class=\"navlinkC\" href='"+bob.GetPath(level)+"Section2/Section6/Section2/Project1"+bob.GetExtension(extension)+"'>Mission!</a><br/><br/>";
                Result += "<a class=\"navlinkC\" href='"+bob.GetPath(level)+"Section2/Section6/Section2/Section2/index"+bob.GetExtension(extension)+"'>HTKB Armies</a><br/><br/>";
                    Result += "<a class=\"navlinkD\" href='"+bob.GetPath(level)+"Section2/Section6/Section2/Section2/Project1"+bob.GetExtension(extension)+"'>Ad Infinitum</a><br/><br/>";
                    Result += "<a class=\"navlinkD\" href='"+bob.GetPath(level)+"Section2/Section6/Section2/Section2/Project2"+bob.GetExtension(extension)+"'>Avia</a><br/><br/>";
                    Result += "<a class=\"navlinkD\" href='"+bob.GetPath(level)+"Section2/Section6/Section2/Section2/Project3"+bob.GetExtension(extension)+"'>De Luna</a><br/><br/>";
                    Result += "<a class=\"navlinkD\" href='"+bob.GetPath(level)+"Section2/Section6/Section2/Section2/Project4"+bob.GetExtension(extension)+"'>Eve</a><br/><br/>";
                    Result += "<a class=\"navlinkD\" href='"+bob.GetPath(level)+"Section2/Section6/Section2/Section2/Project5"+bob.GetExtension(extension)+"'>Geo Marines</a><br/><br/>";
                    Result += "<a class=\"navlinkD\" href='"+bob.GetPath(level)+"Section2/Section6/Section2/Section2/Project6"+bob.GetExtension(extension)+"'>Twin Fists</a><br/><br/>";
                    Result += "<a class=\"navlinkD\" href='"+bob.GetPath(level)+"Section2/Section6/Section2/Section2/Project7"+bob.GetExtension(extension)+"'>Voboulids</a><br/><br/>";
                    Result += "<a class=\"navlinkD\" href='"+bob.GetPath(level)+"Section2/Section6/Section2/Section2/Project8"+bob.GetExtension(extension)+"'>Fungi</a><br/><br/>";
                    Result += "<a class=\"navlinkD\" href='"+bob.GetPath(level)+"Section2/Section6/Section2/Section2/Project9"+bob.GetExtension(extension)+"'>Synergy</a><br/><br/>";
                    Result += "<a class=\"navlinkD\" href='"+bob.GetPath(level)+"Section2/Section6/Section2/Section2/Project10"+bob.GetExtension(extension)+"'>The Dark</a><br/><br/>";
                    Result += "<a class=\"navlinkD\" href='"+bob.GetPath(level)+"Section2/Section6/Section2/Section2/Project11"+bob.GetExtension(extension)+"'>Vivus Mortem</a><br/><br/>";
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
                Result += "HTKB Armies";
            }
            else if(input == 1)
            {
                Result += "Ad Infinitum";
            }
            else if(input == 2)
            {
                Result += "Avia";
            }
            else if(input == 3)
            {
                Result += "De Luna";
            }
            else if(input == 4)
            {
                Result += "Eve";
            }
            else if(input == 5)
            {
                Result += "Geo Marines";
            }
            else if(input == 6)
            {
                Result += "Twin Fists";
            }
            else if(input == 7)
            {
                Result += "Voboulids";
            }
            else if(input == 8)
            {
                Result += "Fungi";
            }
            else if(input == 9)
            {
                Result += "Synergy";
            }
            else if(input == 10)
            {
                Result += "The Dark";
            }
            else if(input == 11)
            {
                Result += "Vivus Mortem";
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
                Result += "HTKB Armies";
            }
            else if(input == 1)
            {
                Result += "Ad Infinitum";
            }
            else if(input == 2)
            {
                Result += "Avia";
            }
            else if(input == 3)
            {
                Result += "De Luna";
            }
            else if(input == 4)
            {
                Result += "Eve";
            }
            else if(input == 5)
            {
                Result += "Geo Marines";
            }
            else if(input == 6)
            {
                Result += "Twin Fists";
            }
            else if(input == 7)
            {
                Result += "Voboulids";
            }
            else if(input == 8)
            {
                Result += "Fungi";
            }
            else if(input == 9)
            {
                Result += "Synergy";
            }
            else if(input == 10)
            {
                Result += "The Dark";
            }
            else if(input == 11)
            {
                Result += "Vivus Mortem";
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
                Result += "This section is dedicated to HTKB designed armies based on the Warhammer 40K universe.";
            }
            else if(input == 1)
            {
                Result += "Ad Infinitum is a collective of A.I. constructs.  Little is known about these constructs ";
                Result += "as they are not known to negotiate.  While some technology has been recovered, it is rare ";
                Result += "to find anything viable after battles.";
            }
            else if(input == 2)
            {
                Result += "The Avia are a humanoid xenos that are naturally equipped with wings.  They can are the very least ";
                Result += "glide for short times without technological assistance.";
            }
            else if(input == 3)
            {
                Result += "De Luna is a designation for squads of walker vehicles that tend to ambush their targets.  ";
                Result += "While De Luna are automated vehicles, wreckage has determine that there are seats for ";
                Result += "pilots.  Theories range from A.I. control to remote communication.";
            }
            else if(input == 4)
            {
                Result += "The Eve are a race of terrifying beast creatures. ";
                Result += "These Xenos somewhat resemble large cats.";
            }
            else if(input == 5)
            {
                Result += "Geo Marines are a specialized Chapter concentrating equipment speciality.";
            }
            else if(input == 6)
            {
                Result += "This lost Chapter spent far too long stranded outside the reach of civilisation.  ";
                Result += "The Twin Fists specialize in close combat battles.";
            }
            else if(input == 7)
            {
                Result += "Vouboulids are a plant-like group of entities.  Using a hive structure, ";
                Result += "these Xenos seem to concentrate on populating one area at a time, causing a slow expansion.";
            }
            else if(input == 8)
            {
                Result += "These Xenos are unidentifiable as anything other than an advanced form of Fungus.  ";
                Result += "Their appearances range incredible wide, but tend to even resemble familiar forms of fungus.";
            }
            else if(input == 9)
            {
                Result += "These almost intangible Xenos appear to made of energy itself.  They use technology that appears unstable in nature.";
            }
            else if(input == 10)
            {
                Result += "The Dark are a Hive centered Xenos resembling a disturbing cross between snake, bird and insect.";
            }
            else if(input == 11)
            {
                Result += "Vivus mortem is a category for humans that are encountered and exhibit certain traits.  These possibly once humans ";
                Result += "have extreme abilities to endure the harshest environment, avoid lighted scenarios whenever possible, and attempt to ";
                Result += "take human prisoner whenever possible.  Escapees had stated that the Vivus Mortem would feed on them, and upon death ";
                Result += "and exposed bodies lose their excessive durability and seem to disintegrate rapidly enough to appear to 'turn to ash'.";
            }

        Result += "</p>";
        return Result;
    }
    
    public String Versions(int input)
    {
        String Result = "";
        if(input == 0)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/index.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/index.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section6/Section2/Section2/index.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section6/Section2/Section2/index.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section6/Section2/Section2/index.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section6/Section2/Section2/index.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/index.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section6/Section2/Section2/index\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/index.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section6/Section2/Section2/index.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section6/Section2/Section2/index.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/index.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section6/Section2/Section2/index\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section6/Section2/Section2/index.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section6/Section2/Section2/index\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section6/Section2/Section2/index\">Ruby on Rails</a><br/>";
        }
        else if(input == 1)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project1.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project1.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section6/Section2/Section2/Project1.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section6/Section2/Section2/Project1.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section6/Section2/Section2/Project1.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section6/Section2/Section2/Project1.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project1.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section6/Section2/Section2/Project1\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project1.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section6/Section2/Section2/Project1.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section6/Section2/Section2/Project1.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project1.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section6/Section2/Section2/Project1\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section6/Section2/Section2/Project1.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section6/Section2/Section2/Project1\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section6/Section2/Section2/Project1\">Ruby on Rails</a><br/>";
        }
        else if(input == 2)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project2.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project2.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section6/Section2/Section2/Project2.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section6/Section2/Section2/Project2.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section6/Section2/Section2/Project2.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section6/Section2/Section2/Project2.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project2.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section6/Section2/Section2/Project2\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project2.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section6/Section2/Section2/Project2.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section6/Section2/Section2/Project2.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project2.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section6/Section2/Section2/Project2\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section6/Section2/Section2/Project2.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section6/Section2/Section2/Project2\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section6/Section2/Section2/Project2\">Ruby on Rails</a><br/>";
        }
        else if(input == 3)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project3.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project3.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section6/Section2/Section2/Project3.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section6/Section2/Section2/Project3.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section6/Section2/Section2/Project3.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section6/Section2/Section2/Project3.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project3.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section6/Section2/Section2/Project3\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project3.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section6/Section2/Section2/Project3.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section6/Section2/Section2/Project3.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project3.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section6/Section2/Section2/Project3\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section6/Section2/Section2/Project3.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section6/Section2/Section2/Project3\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section6/Section2/Section2/Project3\">Ruby on Rails</a><br/>";
        }
        else if(input == 4)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project4.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project4.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section6/Section2/Section2/Project4.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section6/Section2/Section2/Project4.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section6/Section2/Section2/Project4.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section6/Section2/Section2/Project4.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project4.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section6/Section2/Section2/Project4\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project4.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section6/Section2/Section2/Project4.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section6/Section2/Section2/Project4.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project4.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section6/Section2/Section2/Project4\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section6/Section2/Section2/Project4.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section6/Section2/Section2/Project4\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section6/Section2/Section2/Project4\">Ruby on Rails</a><br/>";
        }
        else if(input == 5)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project5.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project5.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section6/Section2/Section2/Project5.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section6/Section2/Section2/Project5.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section6/Section2/Section2/Project5.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section6/Section2/Section2/Project5.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project5.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section6/Section2/Section2/Project5\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project5.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section6/Section2/Section2/Project5.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section6/Section2/Section2/Project5.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project5.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section6/Section2/Section2/Project5\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section6/Section2/Section2/Project5.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section6/Section2/Section2/Project5\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section6/Section2/Section2/Project5\">Ruby on Rails</a><br/>";
        }
        else if(input == 6)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project6.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project6.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section6/Section2/Section2/Project6.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section6/Section2/Section2/Project6.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section6/Section2/Section2/Project6.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section6/Section2/Section2/Project6.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project6.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section6/Section2/Section2/Project6\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project6.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section6/Section2/Section2/Project6.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section6/Section2/Section2/Project6.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project6.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section6/Section2/Section2/Project6\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section6/Section2/Section2/Project6.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section6/Section2/Section2/Project6\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section6/Section2/Section2/Project6\">Ruby on Rails</a><br/>";
        }
        else if(input == 7)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project7.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project7.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section6/Section2/Section2/Project7.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section6/Section2/Section2/Project7.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section6/Section2/Section2/Project7.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section6/Section2/Section2/Project7.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project7.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section6/Section2/Section2/Project7\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project7.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section6/Section2/Section2/Project7.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section6/Section2/Section2/Project7.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project7.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section6/Section2/Section2/Project7\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section6/Section2/Section2/Project7.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section6/Section2/Section2/Project7\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section6/Section2/Section2/Project7\">Ruby on Rails</a><br/>";
        }
        else if(input == 8)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project8.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project8.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section6/Section2/Section2/Project8.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section6/Section2/Section2/Project8.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section6/Section2/Section2/Project8.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section6/Section2/Section2/Project8.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project8.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section6/Section2/Section2/Project8\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project8.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section6/Section2/Section2/Project8.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section6/Section2/Section2/Project8.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project8.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section6/Section2/Section2/Project8\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section6/Section2/Section2/Project8.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section6/Section2/Section2/Project8\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section6/Section2/Section2/Project8\">Ruby on Rails</a><br/>";
        }
        else if(input == 9)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project9.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project9.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section6/Section2/Section2/Project9.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section6/Section2/Section2/Project9.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section6/Section2/Section2/Project9.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section6/Section2/Section2/Project9.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project9.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section6/Section2/Section2/Project9\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project9.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section6/Section2/Section2/Project9.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section6/Section2/Section2/Project9.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project9.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section6/Section2/Section2/Project9\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section6/Section2/Section2/Project9.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section6/Section2/Section2/Project9\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section6/Section2/Section2/Project9\">Ruby on Rails</a><br/>";
        }
        else if(input == 10)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project10.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project10.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section6/Section2/Section2/Project10.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section6/Section2/Section2/Project10.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section6/Section2/Section2/Project10.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section6/Section2/Section2/Project10.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project10.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section6/Section2/Section2/Project10\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project10.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section6/Section2/Section2/Project10.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section6/Section2/Section2/Project10.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project10.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section6/Section2/Section2/Project10\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section6/Section2/Section2/Project10.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section6/Section2/Section2/Project10\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section6/Section2/Section2/Project10\">Ruby on Rails</a><br/>";
        }
        else if(input == 11)
        {
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project11.html\">HTML</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project11.php\">PHP</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Javascript/Section2/Section6/Section2/Section2/Project11.html\">HTML Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/JQuery/Section2/Section6/Section2/Section2/Project11.html\">JQuery</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASP/Section2/Section6/Section2/Section2/Project11.asp\">ASP Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Section2/Section6/Section2/Section2/Project11.aspx\">ASP.NET Javascript</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project11.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:84/Section2/Section6/Section2/Section2/Project11\">Node JS</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/Section2/Section6/Section2/Section2/Project11.shtml\">Perl</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Section2/Section6/Section2/Section2/Project11.xhtml\">JSF</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Section2/Section6/Section2/Section2/Project11.cshtml\">ASP.NET Web App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/WebForm/Section2/Section6/Section2/Section2/Project11.aspx\">ASP.NET Webform</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:81/MVC/Section2/Section6/Section2/Section2/Project11\">ASP.NET MVC App</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org/SSI/Section2/Section6/Section2/Section2/Project11.html\">Apache SSI</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:82/Section2/Section6/Section2/Section2/Project11\">Python Web.py</a><br/>";
            Result += "<a href=\"http://htkb.dyndns.org:83/Section2/Section6/Section2/Section2/Project11\">Ruby on Rails</a><br/>";
        }
        return Result;
    }
}
