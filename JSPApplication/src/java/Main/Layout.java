package Main;

public class Layout
{
    protected Universal vUniversal;
    protected Custom vCustom;

    public Layout(Custom vCustom)
    {
        this.vUniversal = new Universal();
        this.vCustom = vCustom;
    }

    public String Navigation(int vLevel)
    {
        String vResult = "";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.GetPath(vLevel)+"AboutUs.jsp'>About Us</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.GetPath(vLevel)+"Media.jsp'>Media</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.GetPath(vLevel)+"Minecraft.jsp'>Minecraft!</a><br/><br/>";
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
