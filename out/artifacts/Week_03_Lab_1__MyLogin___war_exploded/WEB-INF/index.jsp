<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>Login</h1>

<c:import url="/includes/header.html" />

<form action="${url}" method="post">
    Username: <input type="text" name="username" value="${username}"></br>
    Password: <input type="password" name="password" value="${password}"></br>
    <input type="submit" value="login">
</form>
    
    
${errorMessage}
${successMessage}

<c:import url="/includes/footer.html" />

