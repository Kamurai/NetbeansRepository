<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Main.Universal" %>
<%@page import="Section2.Layout" %>
<%@page import="Section2.Custom" %>
<!DOCTYPE HTML>

<html>
    <head>
        <%
            Universal vUniversal = new Universal();
            Custom vCustom = new Custom();
            Layout vLayout = new Layout(vCustom);
            int vLevel = 1;
            int vPage = 14;
            

            out.println(vUniversal.WriteHeader(vLevel, 2));
        %>
    </head>
        <%
            out.println(vLayout.WriteWebpage(vPage,vLevel));
        %>
    
</html>
