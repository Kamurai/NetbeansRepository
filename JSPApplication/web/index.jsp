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
            int level = 0;
            int pagenumber = 0;
            int extension = 3;

            out.println(uni.WriteHeader(level, 0));
        %>
    </head>
        <%
            out.println(lay.WriteWebpage(pagenumber,level,extension));
        %>

</html>
