package Division2.Section5.Section3;

public class Custom extends Division2.Section5.Custom
{
    public Custom()
    {
        super();
    }

    public String Title(int vPage)
    {
        String vResult = "";
        String vDefault = "";
        
        vDefault = "Utopia";
        
        vResult += "<title>";
            if(vPage == 0)
            {
                vResult += vDefault;
            }
            else if(vPage == 1)
            {
                vResult += "Elemental Angels";
            }
            else
            {
                vResult += vDefault;
            }
            
        vResult += "</title>";
        return vResult;
    }

    public String Header(int vPage)
    {
        String vResult = "";
        String vDefault = "";
        
        vDefault = "Utopia";
        
        vResult += "<h2>";
            if(vPage == 0)
            {
                vResult += vDefault;
            }
            else if(vPage == 1)
            {
                vResult += "Elemental Angels";
            }
            else
            {
                vResult += vDefault;
            }
        vResult += "</h2>";
        
        return vResult;
    }

    public String Content(int vPage)
    {
        String vResult = "";
        String vDefault = "";
        
        vDefault += "Here are projects based in the Utopia Nation:</br>";
        vDefault += "</br>";
        vDefault += "Elemental Angels: An adventure game with RPG elements based in the Avia Nation.</br>";
        
        vResult += "<div id=\"idCenterContent\">";
            if(vPage == 0)
            {
                vResult += vDefault;
            }
            else if(vPage == 1)
            {
                vResult += "Elemental Angels: Adventure game with RPG elements based in the Avia Nation.</br>";
            }
            else
            {
                vResult += vDefault;
            }

        vResult += "</div>";
        return vResult;
    }
    
    public String Versions(int vPage)
    {
        String vResult = "";
        String vDefault = "";
        
        vDefault += "<a href=\"http://htkb.dyndns.org/Division2/Section5/Section3/Index.html\">HTML</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org/Division2/Section5/Section3/Index.php\">PHP</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org/Division2/Section5/Section3/Index.shtml\">Perl</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org/SSI/Division2/Section5/Section3/Index.html\">Apache SSI</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org/Javascript/Division2/Section5/Section3/Index.html\">HTML Javascript</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org/JQuery/Division2/Section5/Section3/Index.html\">JQuery</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org/AngularJS/Division2/Section5/Section3/Index.html\">Angular JS</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Division2/Section5/Section3/Index.xhtml\">JSF</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org:8080/ProjectSpringTestSite/Division2/Section5/Section3/Index\">JSP Spring MVC</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org:81/ASP/Division2/Section5/Section3/Index.asp\">ASP VBscript</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Division2/Section5/Section3/Index.aspx\">ASP.NET Javascript</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Division2/Section5/Section3/Index.cshtml\">ASP.NET Web App</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org:81/WebForm/Division2/Section5/Section3/Index.aspx\">ASP.NET Webform</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org:81/MVC/Division2/Section5/Section3/Index\">ASP.NET MVC App</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org:82/Division2/Section5/Section3/Index\">Python Web.py</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org:83/Division2/Section5/Section3/Index\">Ruby on Rails</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org:84/Division2/Section5/Section3/Index\">Node JS</a><br/>";
        
        if(vPage == 0)
        {
            vResult += vDefault;
        }
        else
        {
            vResult += vDefault;
        }
        return vResult;
    }
}
