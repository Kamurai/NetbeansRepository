<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Main.Universal" %>
<%@page import="Section1.Layout" %>
<%@page import="Section1.Section2.Custom" %>
<!DOCTYPE HTML>

<html>
    <head>
        <%
            Universal uni = new Universal();
            Custom cust = new Custom();
            Layout lay = new Layout(cust);
            int vLevel = 2;
            int vPage = 0;
            
            out.println(uni.WriteHeader(vLevel, 1));
        %>
    </head>
    <body>
        <%
            out.println(lay.WriteWebpage(vPage, vLevel));
        %>
    </body>
</html>
