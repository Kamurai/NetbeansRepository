package Division2.Section1;

public class Custom extends Main.Custom
{
    public Custom()
    {
        super();
    }

    public String getContent(int vPage){
        String vDefault = "./Content/Content_Index.xhtml";
        String vResult = "";
        
        if(vPage <= 0){
            vResult += vDefault;
        }else if(vPage == 1){
            vResult += "./Content/Content_Project1.xhtml";
        }else if(vPage == 2){
            vResult += "./Content/Content_Project2.xhtml";
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
        }else{
            vResult += vDefault;
        }

        return vResult;
    }
}
