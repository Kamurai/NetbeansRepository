<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Main.Universal" %>
<%@page import="Section2.Layout" %>
<%@page import="Section2.Section5.Section2.Custom" %>
<!DOCTYPE HTML>

<html>
    <head>
        <%
            Universal vUniversal = new Universal();
            Custom vCustom = new Custom();
            Layout layout = new Layout(vCustom);
            int vLevel = 3;
            int vPage = 1;
            

            out.println(vUniversal.WriteHeader(vLevel, 2));
        %>
    </head>
    <body>
        <%
            out.println(layout.WriteWebpage(vPage,vLevel));
        %>
    </body>
</html>
