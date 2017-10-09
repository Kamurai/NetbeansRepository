<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Main.Universal" %>
<%@page import="Section2.Layout" %>
<%@page import="Section2.Section6.Section2.Custom" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <%
            Universal uni = new Universal();
            Custom cust = new Custom();
            Layout lay = new Layout(cust);
            int vLevel = 3;
            int vPage = 0;
            
            out.println(uni.WriteHeader(vLevel, 2));
        %>
    </head>
    <body>
        <%
            out.println(lay.WriteWebpage(vPage, vLevel));
        %>
    </body>
</html>
