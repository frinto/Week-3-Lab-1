<%-- 
    Document   : mainPage
    Created on : Sep 20, 2017, 1:02:55 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Page</title>
    </head>
    <body>
        <h1>Main Page</h1>
        <p>
            Hello, ${username} <a href ="login?successMessage=successfully logged out">Logout</a>
        </p>
    </body>
</html>
