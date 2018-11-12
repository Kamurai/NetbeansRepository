package Division1.Section1;

import Division1.Section1.Custom;

public class Layout extends Main.Layout
{
    public Layout(Custom vCustom)
    {
        super(vCustom);
    }

    public String getNavigation(int vLevel)
    {
        String vResult = "";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.getPath(vLevel)+"Division1/Section1/Index.jsp'>Databases</a><br/><br/>";
            vResult += "<a class=\"navlinkB\" href='"+vUniversal.getPath(vLevel)+"Division1/Section1/Project1.jsp'>Oracle</a><br/><br/>";
            vResult += "<a class=\"navlinkB\" href='"+vUniversal.getPath(vLevel)+"Division1/Section1/Project2.jsp'>Derby</a><br/><br/>";
            vResult += "<a class=\"navlinkB\" href='"+vUniversal.getPath(vLevel)+"Division1/Section1/Project3.jsp'>MySQL</a><br/><br/>";
            vResult += "<a class=\"navlinkB\" href='"+vUniversal.getPath(vLevel)+"Division1/Section1/Project4.jsp'>SQL Server</a><br/><br/>";
            vResult += "<a class=\"navlinkB\" href='"+vUniversal.getPath(vLevel)+"Division1/Section1/Project5.jsp'>Postgres</a><br/><br/>";
        return vResult;
    }

    public String getBody(int vPage, int vLevel)
    {
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
