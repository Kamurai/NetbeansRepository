<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Main.Universal" %>
<%@page import="Division2.Layout" %>
<%@page import="Division2.Custom" %>
<!DOCTYPE HTML>

<html>
    <head>
        <%
            Universal vUniversal = new Universal();
            Custom vCustom = new Custom();
            Layout vLayout = new Layout(vCustom);
            int vPage = 1;
            int vLevel = 1;
            int vDivision = 2;
            
            out.println(vUniversal.getHead(vLevel, vDivision));
        %>
    </head>
        <%
            out.println(vLayout.getBody(vPage,vLevel));
        %>
    
</html>
