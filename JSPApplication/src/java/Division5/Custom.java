package Division5;

import DataMethods.*;

public class Custom extends Main.Custom{
    DerbyMethod dMethod;
    MySQLMethod mMethod;
    OracleMethod oMethod;
    PostgresMethod pMethod;
    SQLServerExpressMethod eMethod;
    SQLServerMethod sMethod;

    public Custom(){
        super();
    
        dMethod = new DerbyMethod();
        mMethod = new MySQLMethod();
        oMethod = new OracleMethod();
        pMethod = new PostgresMethod();
        eMethod = new SQLServerExpressMethod();
        sMethod = new SQLServerMethod();
    }

    public String getTitle(int vPage){
        String vResult = "";
        String vDefault = "";
        
        vDefault = "Database Programming";
        
        vResult += "<title>";
            if(vPage == 0){
                vResult += vDefault;
            }else if(vPage == 1){
                vResult += "Oracle Programming";
            }else if(vPage == 2){
                vResult += "Derby Programming";
            }else if(vPage == 3){
                vResult += "MySQL Programming";
            }else if(vPage == 4){
                vResult += "SQL Server Programming";
            }else if(vPage == 5){
                vResult += "Postgres Programming";
            }else{
                vResult += vDefault;
            }
       vResult += "</title>";
        return vResult;
    }

    public String getContentHeader(int vPage){
        String vResult = "";
        String vDefault = "";
        
        vDefault = "Database Programming";
        
        vResult += "<h2>";
            if(vPage == 0){
                vResult += vDefault;
            }else if(vPage == 1){
                vResult += "Oracle Programming";
            }else if(vPage == 2){
                vResult += "Derby Programming";
            }else if(vPage == 3){
                vResult += "MySQL Programming";
            }else if(vPage == 4){
                vResult += "SQL Server Programming";
            }else if(vPage == 5){
                vResult += "Postgres Programming";
            }else{
                vResult += vDefault;
            }
        vResult += "</h2>";
        
        return vResult;
    }

    public String getContent(int vPage){
        String vResult = "";
        String vDefault = "";
        
        vDefault = "This section is dedicated to database based programming.";
        
        vResult += "<div id=\"idCenterContent\">";
            if(vPage == 0)
            {
                vResult += vDefault;
            }else if(vPage == 1){
                vResult += "This section is dedicated to Oracle based programming.";
                vResult += "<table class=\"classTable\">";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += "Index";
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += "Color";
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += oMethod.getColorData("0",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += oMethod.getColorData("Oracle 11g",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += oMethod.getColorData("1",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += oMethod.getColorData("Red",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += oMethod.getColorData("2",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += oMethod.getColorData("Orange",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += oMethod.getColorData("3",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += oMethod.getColorData("Yellow",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += oMethod.getColorData("4",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += oMethod.getColorData("Green",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += oMethod.getColorData("5",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += oMethod.getColorData("Blue",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += oMethod.getColorData("6",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += oMethod.getColorData("Indigo",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += oMethod.getColorData("7",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += oMethod.getColorData("Violet",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                vResult += "</table>";
            }else if(vPage == 2){
                vResult += "This section is dedicated to Derby based programming.";
                vResult += "<table class=\"classTable\">";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += "Index";
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += "Color";
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += dMethod.getColorData("0",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += dMethod.getColorData("Derby",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += dMethod.getColorData("1",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += dMethod.getColorData("Red",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += dMethod.getColorData("2",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += dMethod.getColorData("Orange",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += dMethod.getColorData("3",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += dMethod.getColorData("Yellow",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += dMethod.getColorData("4",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += dMethod.getColorData("Green",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += dMethod.getColorData("5",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += dMethod.getColorData("Blue",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += dMethod.getColorData("6",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += dMethod.getColorData("Indigo",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += dMethod.getColorData("7",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += dMethod.getColorData("Violet",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    
                vResult += "</table>";
            }
            else if(vPage == 3)
            {
                vResult += "This section is dedicated to MySQL based programming.";
                vResult += "<table class=\"classTable\">";                
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += "Index";
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += "Color";
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += mMethod.getColorData("0",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += mMethod.getColorData("MySQL",1);
                        vResult += "</td>";
                    vResult += "</tr>";vResult += "<tr>";
                        vResult += "<td>";
                            vResult += mMethod.getColorData("1",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += mMethod.getColorData("Red",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += mMethod.getColorData("2",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += mMethod.getColorData("Orange",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += mMethod.getColorData("3",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += mMethod.getColorData("Yellow",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += mMethod.getColorData("4",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += mMethod.getColorData("Green",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += mMethod.getColorData("5",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += mMethod.getColorData("Blue",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += mMethod.getColorData("6",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += mMethod.getColorData("Indigo",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += mMethod.getColorData("7",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += mMethod.getColorData("Violet",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    
                vResult += "</table>";
            }
            else if(vPage == 4)
            {
                vResult += "This section is dedicated to SQL Server based programming.";
                vResult += "<table class=\"classTable\">";                
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += "SQL Server Instance";
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += "";
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += "Index";
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += "Color";
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += sMethod.getColorData("0",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += sMethod.getColorData("SQL Server",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += sMethod.getColorData("1",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += sMethod.getColorData("Red",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += sMethod.getColorData("2",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += sMethod.getColorData("Orange",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += sMethod.getColorData("3",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += sMethod.getColorData("Yellow",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += sMethod.getColorData("4",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += sMethod.getColorData("Green",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += sMethod.getColorData("5",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += sMethod.getColorData("Blue",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += sMethod.getColorData("6",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += sMethod.getColorData("Indigo",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += sMethod.getColorData("7",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += sMethod.getColorData("Violet",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                vResult += "</table>";
            }
            else if(vPage == 5)
            {
                vResult += "This section is dedicated to Postgres based programming.";
                vResult += "<table class=\"classTable\">";                
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += "Index";
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += "Color";
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += pMethod.getColorData("0",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += pMethod.getColorData("PostgreSQL",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += pMethod.getColorData("1",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += pMethod.getColorData("Red",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += pMethod.getColorData("2",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += pMethod.getColorData("Orange",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += pMethod.getColorData("3",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += pMethod.getColorData("Yellow",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += pMethod.getColorData("4",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += pMethod.getColorData("Green",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += pMethod.getColorData("5",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += pMethod.getColorData("Blue",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += pMethod.getColorData("6",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += pMethod.getColorData("Indigo",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    vResult += "<tr>";
                        vResult += "<td>";
                            vResult += pMethod.getColorData("7",0);
                        vResult += "</td>";
                        vResult += "<td>";
                            vResult += pMethod.getColorData("Violet",1);
                        vResult += "</td>";
                    vResult += "</tr>";
                    
                vResult += "</table>";
            }
            else
            {
                vResult += vDefault;
            }

        vResult += "</div>";
        return vResult;
    }
    
    public String getVersions(int vPage)
    {
        String vResult = "";
        String vDefault = "";
        
        vDefault += "<a href=\"http://htkb.dyndns.org/Division5/Index.html\">HTML</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org/Division5/Index.php\">PHP</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org/Division5/Index.shtml\">Perl</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org/SSI/Division5/Index.html\">Apache SSI</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org/Javascript/Division5/Index.html\">HTML Javascript</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org/JQuery/Division5/Index.html\">JQuery</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org/AngularJS/Division5/Index.html\">Angular JS</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Division5/Index.xhtml\">JSF</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org:8080/ProjectSpringTestSite/Division5/Index\">JSP Spring MVC</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org:81/ASP/Division5/Index.asp\">ASP VBscript</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Division5/Index.aspx\">ASP.NET Javascript</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Division5/Index.cshtml\">ASP.NET Web App</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org:81/WebForm/Division5/Index.aspx\">ASP.NET Webform</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org:81/MVC/Division5/Index\">ASP.NET MVC App</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org:82/Division5/Index\">Python Web.py</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org:83/Division5/Index\">Ruby on Rails</a><br/>";
        vDefault += "<a href=\"http://htkb.dyndns.org:84/Division5/Index\">Node JS</a><br/>";
         
        if(vPage == 0)
        {
            vResult += vDefault;
        }
        else if(vPage == 1)
        {
            vResult += "<a href=\"http://htkb.dyndns.org/Division5/Project1.html\">HTML</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/Division5/Project1.php\">PHP</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/Division5/Project1.shtml\">Perl</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/SSI/Division5/Project1.html\">Apache SSI</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/Javascript/Division5/Project1.html\">HTML Javascript</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/JQuery/Division5/Project1.html\">JQuery</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/AngularJS/Division5/Project1.html\">Angular JS</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Division5/Project1.xhtml\">JSF</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:8080/ProjectSpringTestSite/Division5/Project1\">JSP Spring MVC</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/ASP/Division5/Project1.asp\">ASP VBscript</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Division5/Project1.aspx\">ASP.NET Javascript</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Division5/Project1.cshtml\">ASP.NET Web App</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/WebForm/Division5/Project1.aspx\">ASP.NET Webform</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/MVC/Division5/Project1\">ASP.NET MVC App</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:82/Division5/Project1\">Python Web.py</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:83/Division5/Project1\">Ruby on Rails</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:84/Division5/Project1\">Node JS</a><br/>";
        }
        else if(vPage == 2)
        {
            vResult += "<a href=\"http://htkb.dyndns.org/Division5/Project2.html\">HTML</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/Division5/Project2.php\">PHP</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/Division5/Project2.shtml\">Perl</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/SSI/Division5/Project2.html\">Apache SSI</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/Javascript/Division5/Project2.html\">HTML Javascript</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/JQuery/Division5/Project2.html\">JQuery</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/AngularJS/Division5/Project2.html\">Angular JS</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Division5/Project2.xhtml\">JSF</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:8080/ProjectSpringTestSite/Division5/Project2\">JSP Spring MVC</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/ASP/Division5/Project2.asp\">ASP VBscript</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Division5/Project2.aspx\">ASP.NET Javascript</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Division5/Project2.cshtml\">ASP.NET Web App</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/WebForm/Division5/Project2.aspx\">ASP.NET Webform</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/MVC/Division5/Project2\">ASP.NET MVC App</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:82/Division5/Project2\">Python Web.py</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:83/Division5/Project2\">Ruby on Rails</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:84/Division5/Project2\">Node JS</a><br/>";
        }
        else if(vPage == 3)
        {
            vResult += "<a href=\"http://htkb.dyndns.org/Division5/Project3.html\">HTML</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/Division5/Project3.php\">PHP</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/Division5/Project3.shtml\">Perl</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/SSI/Division5/Project3.html\">Apache SSI</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/Javascript/Division5/Project3.html\">HTML Javascript</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/JQuery/Division5/Project3.html\">JQuery</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/AngularJS/Division5/Project3.html\">Angular JS</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Division5/Project3.xhtml\">JSF</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:8080/ProjectSpringTestSite/Division5/Project3\">JSP Spring MVC</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/ASP/Division5/Project3.asp\">ASP VBscript</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Division5/Project3.aspx\">ASP.NET Javascript</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Division5/Project3.cshtml\">ASP.NET Web App</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/WebForm/Division5/Project3.aspx\">ASP.NET Webform</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/MVC/Division5/Project3\">ASP.NET MVC App</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:82/Division5/Project3\">Python Web.py</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:83/Division5/Project3\">Ruby on Rails</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:84/Division5/Project3\">Node JS</a><br/>";
        }
        else if(vPage == 4)
        {
            vResult += "<a href=\"http://htkb.dyndns.org/Division5/Project4.html\">HTML</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/Division5/Project4.php\">PHP</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/Division5/Project4.shtml\">Perl</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/SSI/Division5/Project4.html\">Apache SSI</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/Javascript/Division5/Project4.html\">HTML Javascript</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/JQuery/Division5/Project4.html\">JQuery</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/AngularJS/Division5/Project4.html\">Angular JS</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Division5/Project4.xhtml\">JSF</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:8080/ProjectSpringTestSite/Division5/Project4\">JSP Spring MVC</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/ASP/Division5/Project4.asp\">ASP VBscript</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Division5/Project4.aspx\">ASP.NET Javascript</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Division5/Project4.cshtml\">ASP.NET Web App</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/WebForm/Division5/Project4.aspx\">ASP.NET Webform</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/MVC/Division5/Project4\">ASP.NET MVC App</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:82/Division5/Project4\">Python Web.py</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:83/Division5/Project4\">Ruby on Rails</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:84/Division5/Project4\">Node JS</a><br/>";
        }
        else if(vPage == 5)
        {
            vResult += "<a href=\"http://htkb.dyndns.org/Division5/Project5.html\">HTML</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/Division5/Project5.php\">PHP</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/Division5/Project5.shtml\">Perl</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/SSI/Division5/Project5.html\">Apache SSI</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/Javascript/Division5/Project5.html\">HTML Javascript</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/JQuery/Division5/Project5.html\">JQuery</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org/AngularJS/Division5/Project5.html\">Angular JS</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:8080/JSFApplication/Division5/Project5.xhtml\">JSF</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:8080/ProjectSpringTestSite/Division5/Project5\">JSP Spring MVC</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/ASP/Division5/Project5.asp\">ASP VBscript</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/ASPNET/Division5/Project5.aspx\">ASP.NET Javascript</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/WebApplication/Division5/Project5.cshtml\">ASP.NET Web App</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/WebForm/Division5/Project5.aspx\">ASP.NET Webform</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:81/MVC/Division5/Project5\">ASP.NET MVC App</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:82/Division5/Project5\">Python Web.py</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:83/Division5/Project5\">Ruby on Rails</a><br/>";
            vResult += "<a href=\"http://htkb.dyndns.org:84/Division5/Project5\">Node JS</a><br/>";
        }
        else
        {
            vResult += vDefault;
        }
        return vResult;
    }
}
