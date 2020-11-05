package Main;

public class Universal{
    public Universal(){

    }

    public String getHead(int vLevel, int vDivision){
        String vResult = "";
        vResult += "<link rel=\"shortcut icon\" href=\""+getPath(vLevel)+"Pictures/favicon.ico\" type=\"image/x-icon\" />";
        vResult += "<link rel=\"icon\" href=\""+getPath(vLevel)+"Pictures/favicon.ico\" type=\"image/x-icon\" />";
        
        if(vDivision == 1){
            vResult += "<link href=\"http://htkb.dyndns.org/Styles/Division1.css\" rel=\"stylesheet\" type=\"text/css\">";
        }else if(vDivision == 2){
            vResult += "<link href=\"http://htkb.dyndns.org/Styles/Division2.css\" rel=\"stylesheet\" type=\"text/css\">";
        }else if(vDivision == 3){
            vResult += "<link href=\"http://htkb.dyndns.org/Styles/Division3.css\" rel=\"stylesheet\" type=\"text/css\">";
        }else if(vDivision == 4){
            vResult += "<link href=\"http://htkb.dyndns.org/Styles/Division4.css\" rel=\"stylesheet\" type=\"text/css\">";
        }else if(vDivision == 5){
            vResult += "<link href=\"http://htkb.dyndns.org/Styles/Division5.css\" rel=\"stylesheet\" type=\"text/css\">";
        }else if(vDivision == 6){
            vResult += "<link href=\"http://htkb.dyndns.org/Styles/Division6.css\" rel=\"stylesheet\" type=\"text/css\">";
        }else if(vDivision == 7){
            vResult += "<link href=\"http://htkb.dyndns.org/Styles/Division7.css\" rel=\"stylesheet\" type=\"text/css\">";
        }else{
            vResult += "<link href=\"http://htkb.dyndns.org/Styles/Main.css\" rel=\"stylesheet\" type=\"text/css\">";
        }
		
        return vResult;
    }

    public String getLogo(int vLevel){
        String vResult = "";
        vResult += "<img  id=\"idLogo\" src=\"http://htkb.dyndns.org/Pictures/logoHTKB.jpg\"><br>";

        return vResult;
    }

    public String getWebMaster(){
        String vResult = "";
		
        vResult += "Website managed by Kamurai.";
		
        return vResult;
    }

    public String getNavBar(int vLevel){
        String vResult = "";
		
        vResult += "<ul class=\\\"navBarUl\\\">";
        vResult += "<a class=\"navBar\" href=\"/JSPApplication/Index.jsp\">Home</a>";
        vResult += "<a class=\"navBar\" href=\"/JSPApplication/Division1/Index.jsp\">Board Games</a>";
        vResult += "<a class=\"navBar\" href=\"/JSPApplication/Division2/Index.jsp\">Digital Board Games</a>";
        vResult += "<a class=\"navBar\" href=\"/JSPApplication/Division3/Index.jsp\">Video Games</a>";
        vResult += "<a class=\"navBar\" href=\"/JSPApplication/Division4/Index.jsp\">Downloadables</a>";
        vResult += "<a class=\"navBar\" href=\"/JSPApplication/Division5/Index.jsp\">Database Work</a>";
        vResult += "</ul>";
        
	return vResult;
    }

    public String getNavigationHeader(){
        String vResult = "";
	
        vResult += "<h4 class=\"headerColorBlack\">";
	vResult += "Navigation";
	vResult += "</h4>";
	
	return vResult;
    }

    public String getInformationHeader(){
        String vResult = "";
	
        vResult += "<h4 class=\"headerColorBlack\">";
	vResult += "Information";
	vResult += "</h4>";
	
	return vResult;
    }

    public String getInformation(){
        String vResult = "";
		
        vResult += "This is written using JSP.<br><br>";
        vResult += "Other versions of this page are here:<br>";
		
        return vResult;
    }
    
    public String getFooter(){
        String vResult = "";
		
        vResult += "© Copyright 2012 All rights reserved<br>";
        vResult += "House That Kamurai Built<br>";
		
        return vResult;
    }

    public String getGDR(){
        String vResult = "";
		
        vResult += "<a href=\"http://htkb.dyndns.org/Section3/downloads/GDR.zip\">You can download my Games Development Report here.</a></br>";
        
		return vResult;
    }

    public String getWinRAR(){
        String vResult = "";
		
        vResult += "<a href=\"http://htkb.dyndns.org/Section3/downloads/wrar371.exe\">You may need WinRar to open zip files from this site.</a></br>";
        
		return vResult;
    }
    
    public String getPath(int vLevel){
        if(vLevel <= 0)
        {
            return "./";
        }
        else if(vLevel == 1)
        {
            return "../";
        }
        else if(vLevel == 2)
        {
            return "../../";
        }
        else if(vLevel == 3)
        {
            return "../../../";
        }
        else if(vLevel == 4)
        {
            return "../../../../";
        }
        else if(vLevel == 5)
        {
            return "../../../../../";
        }
        else if(vLevel == 6)
        {
            return "../../../../../../";
        }
        else if(vLevel == 7)
        {
            return "../../../../../../../";
        }
        else
        {
            return "./";
        }
    }
}
