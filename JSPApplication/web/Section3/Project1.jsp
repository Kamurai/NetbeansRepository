<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Main.Universal" %>
<%@page import="Section3.Layout" %>
<%@page import="Section3.Custom" %>
<!DOCTYPE HTML>

<html>
    <head>
        <%
            Universal uni = new Universal();
            Custom cust = new Custom();
            Layout lay = new Layout(cust);
            int level = 1;
            int pagenumber = 1;
            int extension = 3;

            out.println(uni.WriteHeader(level, 3));
        %>
    </head>
        <%
            out.println(lay.WriteWebpage(pagenumber,level,extension));
        %>
</html>
