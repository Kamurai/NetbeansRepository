package Division1;

public class Custom extends Main.Custom
{
    public Custom()
    {
        super();
    }
    
    public String getContent(int vPage) {
        String vDefault = "./Content/Content_Index.xhtml";
        String vResult = "";
        
        if(vPage <= 0){
            vResult += vDefault;
        }else if(vPage == 1){
            vResult += "./Content/Content_Project1.xhtml";
        }else if(vPage == 2){
            vResult += "./Content/Content_Project2.xhtml";
        }else if(vPage == 3){
            vResult += "./Content/Content_Project3.xhtml";
        }else if(vPage == 4){
            vResult += "./Content/Content_Project4.xhtml";
        }else if(vPage == 5){
            vResult += "./Content/Content_Project5.xhtml";
        }else if(vPage == 6){
            vResult += "./Content/Content_Project6.xhtml";
        }else if(vPage == 7){
            vResult += "./Content/Content_Project7.xhtml";
        }else if(vPage == 8){
            vResult += "./Content/Content_Project8.xhtml";
        }else if(vPage == 9){
            vResult += "./Content/Content_Project9.xhtml";
        }else if(vPage == 10){
            vResult += "./Content/Content_Project10.xhtml";
        }else if(vPage == 11){
            vResult += "./Content/Content_Project11.xhtml";
        }else if(vPage == 12){
            vResult += "./Content/Content_Project12.xhtml";
        }else if(vPage == 13){
            vResult += "./Content/Content_Project13.xhtml";
        }else if(vPage == 14){
            vResult += "./Content/Content_Project14.xhtml";
        }else if(vPage == 15){
            vResult += "./Content/Content_Project15.xhtml";
        }else if(vPage == 16){
            vResult += "./Content/Content_Project16.xhtml";
        }else if(vPage == 17){
            vResult += "./Content/Content_Project17.xhtml";
        }else if(vPage == 18){
            vResult += "./Content/Content_Project18.xhtml";
        }else{
            vResult += vDefault;
        }

        return vResult;
    }
    
    public String getVersions(int vPage){
        String vDefault = "./Content/Versions_Index.xhtml";
        String vResult = "";
                
        if(vPage <= 0){
            vResult += vDefault;
        }else if(vPage == 1){
            vResult += "./Content/Versions_Project1.xhtml";
        }else if(vPage == 2){
            vResult += "./Content/Versions_Project2.xhtml";
        }else if(vPage == 3){
            vResult += "./Content/Versions_Project3.xhtml";
        }else if(vPage == 4){
            vResult += "./Content/Versions_Project4.xhtml";
        }else if(vPage == 5){
            vResult += "./Content/Versions_Project5.xhtml";
        }else if(vPage == 6){
            vResult += "./Content/Versions_Project6.xhtml";
        }else if(vPage == 7){
            vResult += "./Content/Versions_Project7.xhtml";
        }else if(vPage == 8){
            vResult += "./Content/Versions_Project8.xhtml";
        }else if(vPage == 9){
            vResult += "./Content/Versions_Project9.xhtml";
        }else if(vPage == 10){
            vResult += "./Content/Versions_Project10.xhtml";
        }else if(vPage == 11){
            vResult += "./Content/Versions_Project11.xhtml";
        }else if(vPage == 12){
            vResult += "./Content/Versions_Project12.xhtml";
        }else if(vPage == 13){
            vResult += "./Content/Versions_Project13.xhtml";
        }else if(vPage == 14){
            vResult += "./Content/Versions_Project14.xhtml";
        }else if(vPage == 15){
            vResult += "./Content/Versions_Project15.xhtml";
        }else if(vPage == 16){
            vResult += "./Content/Versions_Project16.xhtml";
        }else if(vPage == 17){
            vResult += "./Content/Versions_Project17.xhtml";
        }else if(vPage == 18){
            vResult += "./Content/Versions_Project18.xhtml";
        }else{
            vResult += vDefault;
        }

        return vResult;
    }
}
