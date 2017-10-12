<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Main.Universal" %>
<%@page import="Section2.Layout" %>
<%@page import="Section2.Section5.Custom" %>
<!DOCTYPE HTML>

<html>
    <head>
        <%
            Universal universal = new Universal();
            Custom custom = new Custom();
            Layout layout = new Layout(custom);
            int vLevel = 2;
            int vPage = 0;
            
            out.println(universal.WriteHeader(vLevel, 2));
        %>
    </head>
    <body>
        <%
            out.println(layout.WriteWebpage(vPage, vLevel));
        %>
    </body>
</html>
