/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Section1;

import Main.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="Bean1")
@RequestScoped
public class Bean
{
    int vLevel;
    int vPage;
    
    Custom    vCustom;
    Universal vUniversal;

    public Bean()
    {
        vLevel = 0;
        vPage = 0;
        
        vCustom = new Custom();
        vUniversal = new Universal();
    }

   public void setVLevel(int vLevel)
    {
        this.vLevel = vLevel;
    }

    public void setVPage(int vPage)
    {
        this.vPage = vPage;
    }

    public int getVPage()
    {
        return vPage;
    }

    public String GetPath()
    {
        return vUniversal.GetPath(vLevel);
    }

    public String GetStylePath()
    {
        return vUniversal.GetPath(vLevel-1);
    }

    public String Content()
    {
        return vCustom.Content(getVPage());
    }

    public String WebMaster()
    {
        return vUniversal.WebMaster();
    }

    public String Information()
    {
        return vUniversal.Information();
    }

    public String setLayout(int vLevel, int vPage)
    {
        setVLevel(vLevel);
        setVPage(vPage);

        return GetPath()+"Section1/Layout.xhtml";
    }
}
