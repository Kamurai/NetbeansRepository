<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Main.Universal" %>
<%@page import="Section1.Layout" %>
<%@page import="Section1.Section2.Custom" %>
<!DOCTYPE HTML>

<html>
    <head>
        <%
            Universal vUniversal = new Universal();
            Custom vCustom = new Custom();
            Layout vLayout = new Layout(vCustom);
            int vLevel = 2;
            int vPage = 0;
            
            out.println(vUniversal.WriteHeader(vLevel, 1));
        %>
    </head>
        <%
            out.println(vLayout.WriteWebpage(vPage, vLevel));
        %>
   
</html>
