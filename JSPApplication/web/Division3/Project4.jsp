<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Main.Universal" %>
<%@page import="Division3.Layout" %>
<%@page import="Division3.Custom" %>
<!DOCTYPE HTML>

<html>
    <head>
        <%
            Universal vUniversal = new Universal();
            Custom vCustom = new Custom();
            Layout vLayout = new Layout(vCustom);
            int vLevel = 1;
            int vPage = 4;
            

            out.println(vUniversal.getHead(vLevel, 3));
        %>
    </head>
        <%
            out.println(vLayout.getBody(vPage,vLevel));
        %>
</html>
