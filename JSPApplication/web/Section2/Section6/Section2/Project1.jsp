<%-- 
    Document   : index
    Created on : Dec 15, 2014, 5:03:20 PM
    Author     : Kamurai
--%>

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
            int level = 3;
            int pagenumber = 1;
            int extension = 3;

            out.println(uni.WriteHeader(level, 2));
        %>
    </head>
    <body>
        <%
            out.println(lay.WriteWebpage(pagenumber,level,extension));
        %>
    </body>
</html>
