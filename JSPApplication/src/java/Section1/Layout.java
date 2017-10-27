package Section1;

public class Layout extends Main.Layout
{
    public Layout(Custom vCustom)
    {
        super(vCustom);
    }

    public String Navigation(int vLevel)
    {
        String vResult = "";
        vResult += "<a class=\"navlinkA\" href='http://htkb.dyndns.org/Section1/Index.html'>Basic HTML</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href='http://htkb.dyndns.org/Section1/Index.php'>PHP</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.GetPath(vLevel)+"Section1/Section2/Index.jsp'>Javascript</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href='http://htkb.dyndns.org/Section1/Index.shtml'>Perl</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.GetPath(vLevel)+"Section1/Section4/Index.jsp'>Java</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.GetPath(vLevel)+"Section1/Section5/Index.jsp'>ASP.Net</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.GetPath(vLevel)+"Section1/Section6/Index.jsp'>Databases</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href=\"http://htkb.dyndns.org/SSI/Section1/Index.html\">Apache SSI</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href=\"http://htkb.dyndns.org:82/Section1/Index\">Python Web.py</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href=\"http://htkb.dyndns.org:83/Section1/Index\">Ruby on Rails</a><br/><br/>";
        return vResult;
    }

    public String WriteWebpage(int vPage, int vLevel)
    {
        String vResult = "";
        vResult += "<body id=\"idBody\">";
            vResult += "<table id=\"idTableMain\">";
                vResult += "<tr id=\"idHeaderRow\">";
                    vResult += "<td id=\"idHeaderRowCenter\" colspan=\"3\">";
                        vResult += vUniversal.TitlePicture(vLevel);
                    vResult += "</td>";
                vResult += "</tr>";
                vResult += "<tr id=\"idNavigationRow\">";
                    vResult += "<td id=\"idNavigationBar\" colspan=\"3\">";
                        vResult += vUniversal.NavBar(vLevel);
                    vResult += "</td>";
                vResult += "</tr>";
                vResult += "<tr id=\"idCenterRow\">";
                    vResult += "<td id=\"idCenterRowLeft\">";
                        vResult += "<h4>";
                            vResult += "Navigation";
                        vResult += "</h4>";
                        vResult += Navigation(vLevel);
                    vResult += "</td>";
                    vResult += "<td id=\"idCenterRowMain\">";
                        vResult += vCustom.Title(vPage);
                        vResult += vCustom.Header(vPage);
                        vResult += vCustom.Content(vPage);
                    vResult += "</td>";
                    vResult += "<td id=\"idCenterRowRight\">";
                        vResult += "<h4>";
                            vResult += "Information";
                        vResult += "</h4>";
                        vResult += vUniversal.Information();
                        vResult += vCustom.Versions(vPage);
                    vResult += "</td>";
                vResult += "</tr>";
                vResult += "<tr id=\"idFooterRow\">";
                    vResult += "<td id=\"idFooterMain\" colspan=\"3\">";
                            vResult += "<p id=\"idFooterContent\">";
                                vResult += vUniversal.Footer();
                            vResult += "</p>";
                            vResult += "<p id=\"idFooterContent\">";
                                    vResult += vUniversal.WebMaster();
                            vResult += "</p>";
                    vResult += "</td>";
                vResult += "</tr>";
            vResult += "</table>";
        vResult += "</body>";
        return vResult;
    }
}
