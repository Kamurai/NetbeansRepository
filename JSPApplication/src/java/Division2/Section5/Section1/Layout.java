package Division2.Section5.Section1;

public class Layout extends Main.Layout
{
    public Layout(Custom vCustom)
    {
        super(vCustom);
    }

    public String Navigation(int vLevel)
    {
        String vResult = "";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.GetPath(vLevel)+"Section2/Section1/Index.jsp'>Gynowars</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.GetPath(vLevel)+"Section2/Project2.jsp'>Assault</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.GetPath(vLevel)+"Section2/Project3.jsp'>Mars</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.GetPath(vLevel)+"Section2/Section4/Index.jsp'>Renley</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.GetPath(vLevel)+"Section2/Section5/Index.jsp'>Antarrea</a><br/><br/>";
            vResult += "<a class=\"navlinkB\" href='"+vUniversal.GetPath(vLevel)+"Section2/Section5/Section1/Index.jsp'>Global</a><br/><br/>";
                vResult += "<a class=\"navlinkC\" href='"+vUniversal.GetPath(vLevel)+"Section2/Section5/Section1/Project1.jsp'>Team Tactial: Crash Ball</a><br/><br/>";
                vResult += "<a class=\"navlinkC\" href='"+vUniversal.GetPath(vLevel)+"Section2/Section5/Section1/Project2.jsp'>Wars of Antarrea</a><br/><br/>";
                vResult += "<a class=\"navlinkC\" href='"+vUniversal.GetPath(vLevel)+"Section2/Section5/Section1/Project3.jsp'>Revolutions: Invading Nations</a><br/><br/>";
                vResult += "<a class=\"navlinkC\" href='"+vUniversal.GetPath(vLevel)+"Section2/Section5/Section1/Project4.jsp'>Revolutions: Rebellion Against the Fist</a><br/><br/>";
                vResult += "<a class=\"navlinkC\" href='"+vUniversal.GetPath(vLevel)+"Section2/Section5/Section1/Project5.jsp'>Revolutions: Return to Arms</a><br/><br/>";
                vResult += "<a class=\"navlinkC\" href='"+vUniversal.GetPath(vLevel)+"Section2/Section5/Section1/Project6.jsp'>Revolutions: Post Wars</a><br/><br/>";
            vResult += "<a class=\"navlinkB\" href='"+vUniversal.GetPath(vLevel)+"Section2/Section5/Section2/Index.jsp'>Grendol</a><br/><br/>";
            vResult += "<a class=\"navlinkB\" href='"+vUniversal.GetPath(vLevel)+"Section2/Section5/Section3/Index.jsp'>Utopia</a><br/><br/>";
            vResult += "<a class=\"navlinkB\" href='"+vUniversal.GetPath(vLevel)+"Section2/Section5/Section4/Index.jsp'>Elvia</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.GetPath(vLevel)+"Section2/Project6.jsp'>Truth</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.GetPath(vLevel)+"Section2/Project7.jsp'>Kingdoms</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.GetPath(vLevel)+"Section2/Project8.jsp'>Terminal World</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.GetPath(vLevel)+"Section2/Project9.jsp'>Monster Office Workplace</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.GetPath(vLevel)+"Section2/Project10.jsp'>Battle Princesses</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.GetPath(vLevel)+"Section2/Project11.jsp'>Sacred Offerings</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.GetPath(vLevel)+"Section2/Project12.jsp'>The Way</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.GetPath(vLevel)+"Section2/Project13.jsp'>Conspiratorium</a><br/><br/>";
        vResult += "<a class=\"navlinkA\" href='"+vUniversal.GetPath(vLevel)+"Section2/Project14.jsp'>Conversion</a><br/><br/>";
        return vResult;
    }

    public String WriteWebpage(int vPage, int vLevel)
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
