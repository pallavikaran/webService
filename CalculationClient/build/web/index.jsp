<%-- 
    Document   : index
    Created on : Sep 4, 2013, 2:23:55 PM
    Author     : Administrator
--%>

<%@page import="service.Calculator"%>
<%@page import="service.Calculator_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="Action">
            <input type="text" name="n1"/>
            <input type="text" name="n2"/>
            <input type="submit" name="calc" value="sum"/>
            <input type="submit" name="calc" value="diff"/>
            <input type="submit" name="calc" value="prod"/>
            <input type="submit" name="calc" value="div"/>
        </form>
        
    </body>
</html>
