<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Main.Universal" %>
<%@page import="Section2.Layout" %>
<%@page import="Section2.Section6.Section2.Section2.Custom" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <%
            Universal vUniversal = new Universal();
            Custom vCustom = new Custom();
            Layout layout = new Layout(vCustom);
            int vLevel = 4;
            int vPage = 6;
            

            out.println(vUniversal.WriteHeader(vLevel, 2));
        %>
    </head>
    <body>
        <%
            out.println(layout.WriteWebpage(vPage,vLevel));
        %>
    </body>
</html>
