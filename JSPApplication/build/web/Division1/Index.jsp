<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Main.Universal" %>
<%@page import="Division1.Layout" %>
<%@page import="Division1.Custom" %>
<!DOCTYPE HTML>

<html>
    <head>
        <%
            Universal vUniversal = new Universal();
            Custom vCustom = new Custom();
            Layout vLayout = new Layout(vCustom);
            int vLevel = 1;
            int vPage = 0;
            
            out.println(vUniversal.WriteHeader(vLevel, 1));
        %>
    </head>
        <%
            out.println(vLayout.WriteWebpage(vPage, vLevel));
        %>
    
</html>
