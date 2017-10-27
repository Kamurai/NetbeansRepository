<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Main.Universal" %>
<%@page import="Section1.Layout" %>
<%@page import="Section1.Section5.Custom" %>
<!DOCTYPE HTML>

<html>
    <head>
        <%
            Universal vUniversal = new Universal();
            Custom vCustom = new Custom();
            Layout layout = new Layout(vCustom);
            int vLevel = 2;
            int vPage = 0;
            
            out.println(vUniversal.WriteHeader(vLevel, 1));
        %>
    </head>
    <body>
        <%
            out.println(layout.WriteWebpage(vPage, vLevel));
        %>
    </body>
</html>
