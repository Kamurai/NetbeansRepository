<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Main.Universal" %>
<%@page import="Division3.Section2.Layout" %>
<%@page import="Division3.Section2.Custom" %>
<!DOCTYPE HTML>

<html>
    <head>
        <%
            Universal vUniversal = new Universal();
            Custom vCustom = new Custom();
            Layout vLayout = new Layout(vCustom);
            int vLevel = 2;
            int vPage = 2;
            int vDivision = 3;

            out.println(vUniversal.getHead(vLevel, vDivision));
        %>
    </head>    
        <%
            out.println(vLayout.getBody(vPage,vLevel));
        %>
    
</html>
