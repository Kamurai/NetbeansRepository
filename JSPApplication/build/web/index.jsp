<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Main.Universal" %>
<%@page import="Main.Layout" %>
<%@page import="Main.Custom" %>
<!DOCTYPE HTML>

<html>
    <head>
        <%
            Universal vUniversal = new Universal();
            Custom vCustom = new Custom();
            Layout vLayout = new Layout(vCustom);
            int vLevel = 0;
            int vPage = 0;
            
            out.println(vUniversal.getHead(vLevel, 0));
        %>
    </head>
        <%
            out.println(vLayout.getBody(vPage, vLevel));
        %>

</html>
