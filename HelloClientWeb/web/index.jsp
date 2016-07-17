
<%@page import="service.Hello_Service"%>
<%@page import="service.Hello"%>
<%-- 
    Document   : index
    Created on : Sep 4, 2013, 12:25:46 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% 
        Hello_Service hsv=new Hello_Service();
            Hello helo=hsv.getHelloPort();
            out.print(helo.hello("Rama, Rama.. Kya Hai Ye Drama!!!!"));
        
        %>
    </body>
</html>
