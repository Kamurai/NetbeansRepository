/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="MainBean")
@RequestScoped
public class Bean
{
    int level;
    int page;
    int extension;

    Custom    cust;
    Universal uni;

    public Bean()
    {
        //level = 0;
        //page = 0;
        extension = 4;

        cust = new Custom();
        uni = new Universal();
    }

    public void setLevel(int lvl)
    {
        level = lvl;
    }

    public void setPage(int pg)
    {
        page = pg;
    }

    public int getPage()
    {
        return page;
    }

    public String GetPath()
    {
        String temp = uni.GetPath(level);
        return temp;
    }

    public String GetStylePath()
    {
        return uni.GetPath(level-1);
    }

    public String GetExtension()
    {
        return uni.GetExtension(extension);
    }

    public String Content()
    {
        return cust.Content(getPage());
    }

    public String WebMaster()
    {
        return uni.WebMaster();
    }

    public String Information()
    {
        return uni.Information();
    }
    
    public String OtherVersions()
    {
        return uni.OtherVersions();
    }
    
    public String Versions()
    {
        return cust.Versions(getPage());
    }

    public String setLayout(int lvl, int pg)
    {
        setLevel(lvl);
        setPage(pg);

        return GetPath()+"Layout.xhtml";
    }
}
