/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Section2.Section5.Section1;

import Section2.Section1.*;
import Section2.*;
import Main.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="Bean2_5_1")
@RequestScoped
public class Bean
{
    int level;
    int page;
    int extension;

    Custom    cust;
    Main.Universal uni;

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
        return uni.GetPath(level);
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

    public String setLayout(int lvl, int pg)
    {
        setLevel(lvl);
        setPage(pg);

        return GetPath()+"Section2/Section5/Section1/Layout.xhtml";
    }
}
