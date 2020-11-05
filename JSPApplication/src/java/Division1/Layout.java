package Division1;

public class Layout extends Main.Layout{
    public Layout(Custom vCustom){
        super(vCustom);
    }

    public String getNavigation(int vLevel){
        String vResult = "";
        
        vResult += "<ul class=\"navigationUl\">";
            vResult += "<li><a class=\"navlinkA\" href=\"./Index.jsp\">Board Games</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project1.jsp\">The Way</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project2.jsp\">Sacred Offerings</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project3.jsp\">Conversion</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project4.jsp\">Conspiratorium</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project5.jsp\">Monster Office Workplace</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project6.jsp\">MacCreedy's Mansion</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project7.jsp\">Dundered Acre Wood</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project8.jsp\">Conquer</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project9.jsp\">Assault</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project10.jsp\">Battle Princesses</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project11.jsp\">Armor Up</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project12.jsp\">Gynowars: Battle Arena</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project13.jsp\">Land of the Orcish Empire: Age of Magic</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project14.jsp\">Coliseum: Arena</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project15.jsp\">Nine Card</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project16.jsp\">Wars of Antarrea</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project17.jsp\">Antarrea RPG</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project18.jsp\">Super Dungeon Adventure</a></li>";
        vResult += "</ul>";
        
        return vResult;
    }

    public String getBody(int vPage, int vLevel){
        String vResult = "";
		
        vResult += "<body>";
            vResult += "<div id=\"idGeneralLayout\">";
                vResult += "<Header id=\"idHeaderRow\">";
                    vResult += "<div id=\"idHeaderRowCenter\" colspan=\"3\">";
                        vResult += vUniversal.getLogo(vLevel);
                    vResult += "</div>";
                vResult += "</Header>";
                vResult += "<Nav id=\"idNavigationRow\">";
                    vResult += "<div id=\"idNavigationBar\" colspan=\"3\">";
                        vResult += vUniversal.getNavBar(vLevel);
                    vResult += "</div>";
                vResult += "</Nav>";
                vResult += "<div id=\"idCenterRow\">";
                    vResult += "<div id=\"idCenterRowLeft\">";
                        vResult += vUniversal.getNavigationHeader();
                        vResult += getNavigation(vLevel);
                    vResult += "</div>";
                    vResult += "<div id=\"idCenterRowMain\">";
                        vResult += vCustom.getTitle(vPage);
                        vResult += vCustom.getContentHeader(vPage);
                        vResult += vCustom.getContent(vPage);
                    vResult += "</div>";
                    vResult += "<div id=\"idCenterRowRight\">";
	                    vResult += vUniversal.getInformationHeader();
	                    vResult += vUniversal.getInformation();
                        vResult += vCustom.getVersions(vPage);
                    vResult += "</div>";
                vResult += "</div>";
                vResult += "<Footer id=\"idFooterRow\">";
                    vResult += "<div id=\"idFooterMain\" colspan=\"3\">";
                    	vResult += vUniversal.getFooter();
                        vResult += vUniversal.getWebMaster();
                    vResult += "</div>";
                vResult += "</Footer>";
            vResult += "</div>";
        vResult += "</body>";
        
        return vResult;
    }
}
