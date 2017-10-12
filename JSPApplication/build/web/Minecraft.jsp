<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Main.Universal" %>
<%@page import="Main.Layout" %>
<%@page import="Main.Custom" %>
<!DOCTYPE HTML>

<html>
    <head>
        <%
            Universal universal = new Universal();
            Custom custom = new Custom();
            Layout layout = new Layout(custom);
            int vLevel = 0;
            int vPage = 3;
            

            out.println(universal.WriteHeader(vLevel, 0));
        %>
    </head>
    <body>
        <%
            out.println(layout.WriteWebpage(vPage,vLevel));
        %>
    </body>
</html>
