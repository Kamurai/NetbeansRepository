<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Main.Universal" %>
<%@page import="Division2.Section5.Section1.Layout" %>
<%@page import="Division2.Section5.Section1.Custom" %>
<!DOCTYPE HTML>

<html>
    <head>
        <%
            Universal vUniversal = new Universal();
            Custom vCustom = new Custom();
            Layout vLayout = new Layout(vCustom);
            int vLevel = 3;
            int vPage = 5;
            

            out.println(vUniversal.getHead(vLevel, 2));
        %>
    </head>
        <%
            out.println(vLayout.getBody(vPage,vLevel));
        %>
    
</html>
