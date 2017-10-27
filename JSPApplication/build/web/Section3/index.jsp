<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Main.Universal" %>
<%@page import="Section3.Layout" %>
<%@page import="Section3.Custom" %>
<!DOCTYPE HTML>

<html>
    <head>
        <%
            Universal vUniversal = new Universal();
            Custom vCustom = new Custom();
            Layout layout = new Layout(vCustom);
            int vLevel = 1;
            int vPage = 0;
            
            out.println(vUniversal.WriteHeader(vLevel, 3));
        %>
    </head>
    <body>
        <%
            out.println(layout.WriteWebpage(vPage, vLevel));
        %>
    </body>
</html>
