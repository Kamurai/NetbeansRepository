<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Main.Universal" %>
<%@page import="Division2.Layout" %>
<%@page import="Division2.Section1.Custom" %>
<!DOCTYPE HTML>

<html>
    <head>
        <%
            Universal vUniversal = new Universal();
            Custom vCustom = new Custom();
            Layout vLayout = new Layout(vCustom);
            int vLevel = 2;
            int vPage = 3;
            

            out.println(vUniversal.WriteHeader(vLevel, 2));
        %>
    </head>
        <%
            out.println(vLayout.WriteWebpage(vPage,vLevel));
        %>
    
</html>
