<%-- 
    Document   : login
    Created on : Sep 20, 2017, 1:01:38 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <div>
            <form action="login" method="post">
                Username: <input type="text" name="username" value="${username}"></br>
                Password: <input type="password" name="password" value="${password}"></br>
                <input type="submit" value="login">
            </form>
        </div>
        ${errorMessage}
        ${successMessage}
    </body>
</html>
