<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Main.Universal" %>
<%@page import="Main.Layout" %>
<%@page import="Main.Custom" %>
<!DOCTYPE HTML>

<html>
    <head>
        <%
            Universal uni = new Universal();
            Custom cust = new Custom();
            Layout lay = new Layout(cust);
            int vLevel = 0;
            int vPage = 0;
            
            out.println(uni.WriteHeader(vLevel, 0));
        %>
    </head>
        <%
            out.println(lay.WriteWebpage(vPage, vLevel));
        %>

</html>
