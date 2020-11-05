package Division5;

import Division5.Custom;

public class Layout extends Main.Layout{
    public Layout(Custom vCustom){
        super(vCustom);
    }

    public String getNavigation(int vLevel){
        String vResult = "";
        
        vResult += "<ul class=\"navigationUl\">";
            vResult += "<li><a class=\"navlinkA\" href=\"./Index.jsp\">Database Work</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project1.jsp\">Oracle</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project2.jsp\">Derby</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project3.jsp\">MySQL</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project4.jsp\">SQL Server</a></li>";
            vResult += "<li><a class=\"navlinkA\" href=\"./Project5.jsp\">Postgres</a></li>";
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
