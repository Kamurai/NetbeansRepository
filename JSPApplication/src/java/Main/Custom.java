package Main;

public class Custom{
    protected Universal vUniversal;

    public Custom(){
        this.vUniversal = new Universal();
    }

    public String getTitle(int vPage){
        String vResult = "";
        String vDefault = "";
        
        vDefault = "HTKB Home Page";
        
        vResult += "<title>";
            if(vPage == 0){
                vResult += vDefault;
            }else if(vPage == 1){
                vResult += "About Us";
            }else if(vPage == 2){
                vResult += "Media";
            }else if(vPage == 3){
                vResult += "Git Hubs";
            }else if(vPage == 4){
                vResult += "Web Apps";
            }else{
                vResult += vDefault;
            }
        vResult += "</title>";
		
        return vResult;
    }

    public String getContentHeader(int vPage){
        String vResult = "";
        String vDefault = "";
        
        vDefault = "Welcome to the House That Kamurai Built!";
        
        vResult += "<h2>";
            if(vPage == 0){
                vResult += vDefault;
            }else if(vPage == 1){
                vResult += "About Us";
            }else if(vPage == 2){
                vResult += "Media";
            }else if(vPage == 3){
                vResult += "Git Hubs";
            }else if(vPage == 4){
                vResult += "Web Apps";
            }else{
                vResult += vDefault;
            }
        vResult += "</h2>";
		
        return vResult;
    }

    public String getContent(int vPage){
        String vResult = "";
        String vDefault = "";
        
        vDefault += "The House That Kamurai Built is an entertainment company with the primary focus ";
        vDefault += "of increasing awesome by stimulating intelligent conversation and entertainment via discussion and ";
        vDefault += "game design.<br>";
        vDefault += "Increase the Awesome with us!<br>";
        
        vResult += "<div id=\"idCenterContent\">";
        
        if(vPage == 0){
            vResult += vDefault;
        }else if(vPage == 1){
            vResult += "We are working to build this into a better place.</br>";
            vResult += "If you found this, then you must be at least (Awesome/2).</br>";
            vResult += "Stay tuned, right now it's all about laying foundation for the future.</br>";
        }else if(vPage == 2){
            vResult += "You can find us at all these different places:</br>";
            vResult += "<br/>";
            vResult += "<br/>";
            vResult += "#WeAreMovieClub:";
            vResult += "<br/>";
            vResult += "<br/>";
            vResult += "<a href=\"http://www.youtube.com/WeAreMovieClub\">Youtube.com/WeAreMovieClub:  A place for movie discussion.</a></br>";
            vResult += "<a href=\"http://WeAreMovieClub.tumblr.com\">WeAreMovieClub.tumblr.com: We have a tumblr!</a></br>";
            vResult += "<a href=\"http://www.twitter.com/WeAreMovieClub\">@WeAreMovieClub on Twitter: Let us know about your movie thoughts.</a></br>";
            vResult += "<a href=\"http://www.facebook.com/WeAreMovieClub\">facebook.com/WeAreMovieClub: Talk about movie with us.</a></br>";
            vResult += " <br/>";
            vResult += " <br/>";
        
            vResult += " <br/>";
                vResult += "HTKB Productions";
            vResult += " <br/>";
            vResult += " <br/>";
                vResult += "<a href=\"http://www.youtube.com/GamingDivision528\">Gaming Division:  A Youtube Channel for game stuff.</a></br>";
                vResult += "<a href=\"http://www.youtube.com/JamOnToast528\">Jam On Toast:  A Youtube Channel for media stuff.</a></br>";
                vResult += "<a href=\"http://www.ustream.tv/channel/Kamurai\">UStream:  Streams show up here too.</a></br>";
                vResult += "<a href=\"http://www.firetalk.com/HTKB\">FireTalk:  Streams show up here too.</a></br>";
                vResult += "<a href=\"http://www.younow.com/HTKB\">YouNow:  Streams show up here too.</a></br>";
                vResult += "<a href=\"http://www.soundcloud.com/HTKB\">Sound Cloud:  Listen to our podcasts.</a></br>";
                vResult += "<a href=\"http://HTKB.podbean.com/\">Pod Bean:  Listen to our podcasts.</a></br>";
                vResult += "<a href=\"http://www.youtube.com/HTKB\">Youtube:  Thoughts and life discussions.</a></br>";
                vResult += "<a href=\"http://www.patreon.com/HTKBProductions\">Patreon:  You can help make our dreams reality.</a></br>";
                vResult += "<a href=\"http://www.facebook.com/HouseThatKamuraiBuilt\">Facebook: Talk about movie with us.</a></br>";
                vResult += "<a href=\"http://HouseThatKamuraiBuilt.tumblr.com\">HouseThatKamuraiBuilt.tumblr.com: We have a tumblr!</a></br>";
                vResult += "<a href=\"http://myspace.com/HouseThatKamuraiBuilt\">Myspace: Wow, there\"s even a MySpace!</a></br>";
            vResult += " <br/>";
                vResult += "Here are some of our member\"s pages:</br>";
            vResult += " <br/>";
                vResult += "Kamurai:";
            vResult += " <br/>";
            vResult += " <br/>";
                vResult += "<a href=\"http://twitter.com/#!/Kamurai25\">Kamurai\"s Twitter.</a></br>";
                vResult += "<a href=\"http://Instagram.com/Kamurai25\">Kamurai\"s Instagram.</a></br>";
                vResult += "<a href=\"./.\">Kamurai\"s Snapchat: Kamurai</a></br>";
                vResult += "<a href=\"http://www.facebook.com/cris.kamurai\">Kamurai\"s Facebook.</a></br>";
                vResult += "<a href=\"https://www.gplus.com/Members/Cris-Kamurai\">Kamurai\"s Google Plus.</a></br>";
                vResult += "<a href=\"http://www.yoyogames.com/users/Kamurai\">Kamurai\"s YoYo Games page:  See some of the games he\"s posted.</a></br>";
            
        }else if(vPage == 3){
            vResult += "Here are some GitHub Repositories related to this site:";
        }else if(vPage == 4){
            vResult += "Here are some related Web Applications:";
        }else{
            vResult += vDefault;
        }
        
        vResult += "</div>";
        
        return vResult;
    }
    
    public String getVersions(int vPage){
        String vResult = "";
        String vDefault = "";
        
        vDefault += "<li><a href=\"http://htkb.dyndns.org/Index.html\">HTML</a></li>";
        vDefault += "<li><a href=\"http://htkb.dyndns.org/Index.shtml\">Perl</a></li>";
        vDefault += "<li><a href=\"http://htkb.dyndns.org/SSI/Index.html\">Apache SSI</a></li>";
        vDefault += "<li><a href=\"http://htkb.dyndns.org/Javascript/Index.html\">HTML Javascript</a></li>";
        vDefault += "<li><a href=\"http://htkb.dyndns.org/JQuery/Index.html\">JQuery</a></li>";
        vDefault += "<li><a href=\"http://htkb.dyndns.org/AngularJS/Index.html\">Angular JS</a></li>";
        vDefault += "<li><a href=\"http://htkb.dyndns.org/JSX/Index.html\">JSX</a></li>";
	vDefault += "<li><a href=\"http://htkb.dyndns.org/XLST/Index.xml\">XSLT</a></li>";
	vDefault += "<li><a href=\"http://htkb.dyndns.org:8080/JSFApplication/Index.xhtml\">JSF</a></li>";
	vDefault += "<li><a href=\"http://htkb.dyndns.org:8080/JSPApplication/Index.jsp\">JSP</a></li>";
        vDefault += "<li><a href=\"http://htkb.dyndns.org:8080/SpringMVC/Index\">JSP Spring MVC</a></li>";
	vDefault += "<li><a href=\"http://htkb.dyndns.org:81/ASPNET/Index.aspx\">ASP.NET Javascript</a></li>";
	vDefault += "<li><a href=\"http://htkb.dyndns.org:81/ASP/Index.asp\">ASP VBscript</a></li>";
	vDefault += "<li><a href=\"http://htkb.dyndns.org:81/WebApplication/Index.cshtml\">ASP.NET Web App</a></li>";
	vDefault += "<li><a href=\"http://htkb.dyndns.org:81/WebForm/Index.aspx\">ASP.NET Webform</a></li>";
	vDefault += "<li><a href=\"http://htkb.dyndns.org:81/MVC/Index\">ASP.NET MVC App</a></li>";
	vDefault += "<li><a href=\"http://htkb.dyndns.org:82/Index\">Python Web.py</a></li>";
	vDefault += "<li><a href=\"http://htkb.dyndns.org:83/Index\">Ruby on Rails</a></li>";
	vDefault += "<li><a href=\"http://htkb.dyndns.org:84/Index\">Node JS</a></li>";
	vDefault += "<li><a href=\"http://htkb.dyndns.org:85/Index\">Angular 2+</a></li>";
	vDefault += "<li><a href=\"http://htkb.dyndns.org:86/Index\">ReactJS</a></li>";
        
        vResult += "<ul class=\"versionsUl\">";
		
        if(vPage == 0){
            vResult += vDefault;
        }else if(vPage == 1){
            vResult += "<li><a href=\"http://htkb.dyndns.org/AboutUs.html\">HTML</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/AboutUs.php\">PHP</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/AboutUs.shtml\">Perl</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/SSI/AboutUs.html\">Apache SSI</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/Javascript/AboutUs.html\">HTML Javascript</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/JQuery/AboutUs.html\">JQuery</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/AngularJS/AboutUs.html\">Angular JS</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/JSX/AboutUs.html\">JSX</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/XLST/AboutUs.xml\">XSLT</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:8080/JSFApplication/AboutUs.xhtml\">JSF</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:8080/JSPApplication/AboutUs.jsp\">JSP</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:8080/SpringMVC/AboutUs\">JSP Spring MVC</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:81/ASPNET/AboutUs.aspx\">ASP.NET Javascript</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:81/ASP/AboutUs.asp\">ASP VBscript</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:81/WebApplication/AboutUs.cshtml\">ASP.NET Web App</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:81/WebForm/AboutUs.aspx\">ASP.NET Webform</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:81/MVC/AboutUs\">ASP.NET MVC App</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:82/AboutUs\">Python Web.py</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:83/AboutUs\">Ruby on Rails</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:84/AboutUs\">Node JS</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:85/AboutUs\">Angular 2+</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:86/AboutUs\">ReactJS</a></li>";
        }else if(vPage == 2){
            vResult += "<li><a href=\"http://htkb.dyndns.org/Media.html\">HTML</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/Media.php\">PHP</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/Media.shtml\">Perl</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/SSI/Media.html\">Apache SSI</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/Javascript/Media.html\">HTML Javascript</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/JQuery/Media.html\">JQuery</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/AngularJS/Media.html\">Angular JS</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/JSX/Media.html\">JSX</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/XLST/Media.xml\">XLST</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:8080/JSFApplication/Media.xhtml\">JSF</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:8080/JSPApplication/Media.jsp\">JSP</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:8080/SpringMVC/Media\">JSP Spring MVC</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:81/ASPNET/Media.aspx\">ASP.NET Javascript</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:81/ASP/Media.asp\">ASP VBscript</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:81/WebApplication/Media.cshtml\">ASP.NET Web App</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:81/WebForm/Media.aspx\">ASP.NET Webform</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:81/MVC/Media\">ASP.NET MVC App</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:82/Media\">Python Web.py</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:83/Media\">Ruby on Rails</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:84/Media\">Node JS</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:85/Media\">Angular 2+</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:86/Media\">ReactJS</a></li>";
        }else if(vPage == 3){
            vResult += "<li><a href=\"http://htkb.dyndns.org/GitHubs.html\">HTML</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/GitHubs.php\">PHP</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/GitHubs.shtml\">Perl</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/SSI/GitHubs.html\">Apache SSI</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/Javascript/GitHubs.html\">HTML Javascript</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/JQuery/GitHubs.html\">JQuery</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/AngularJS/GitHubs.html\">Angular JS</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/JSX/GitHubs.html\">JSX</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/XLST/GitHubs.xml\">XLST</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:8080/JSFApplication/GitHubs.xhtml\">JSF</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:8080/JSPApplication/GitHubs.jsp\">JSP</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:8080/SpringMVC/GitHubs\">JSP Spring MVC</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:81/ASPNET/GitHubs.aspx\">ASP.NET Javascript</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:81/ASP/GitHubs.asp\">ASP VBscript</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:81/WebApplication/GitHubs.cshtml\">ASP.NET Web App</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:81/WebForm/GitHubs.aspx\">ASP.NET Webform</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:81/MVC/GitHubs\">ASP.NET MVC App</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:82/GitHubs\">Python Web.py</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:83/GitHubs\">Ruby on Rails</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:84/GitHubs\">Node JS</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:85/GitHubs\">Angular 2+</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:86/GitHubs\">ReactJS</a></li>";
        }else if(vPage == 4){
            vResult += "<li><a href=\"http://htkb.dyndns.org/WebApps.html\">HTML</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/WebApps.php\">PHP</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/WebApps.shtml\">Perl</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/SSI/WebApps.html\">Apache SSI</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/Javascript/WebApps.html\">HTML Javascript</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/JQuery/WebApps.html\">JQuery</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/AngularJS/WebApps.html\">Angular JS</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/JSX/WebApps.html\">JSX</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org/XLST/WebApps.xml\">XLST</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:8080/JSFApplication/WebApps.xhtml\">JSF</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:8080/JSPApplication/WebApps.jsp\">JSP</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:8080/SpringMVC/WebApps\">JSP Spring MVC</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:81/ASPNET/WebApps.aspx\">ASP.NET Javascript</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:81/ASP/WebApps.asp\">ASP VBscript</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:81/WebApplication/WebApps.cshtml\">ASP.NET Web App</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:81/WebForm/WebApps.aspx\">ASP.NET Webform</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:81/MVC/WebApps\">ASP.NET MVC App</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:82/WebApps\">Python Web.py</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:83/WebApps\">Ruby on Rails</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:84/WebApps\">Node JS</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:85/WebApps\">Angular 2+</a></li>";
            vResult += "<li><a href=\"http://htkb.dyndns.org:86/WebApps\">ReactJS</a></li>";
        }else{
            vResult += vDefault;
        }
		
        vResult += "</ul>";
        
        return vResult;
    }
}
