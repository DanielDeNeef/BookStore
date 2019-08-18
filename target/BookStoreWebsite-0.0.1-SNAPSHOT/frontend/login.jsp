<%--
  Created by IntelliJ IDEA.
  User: danie
  Date: 17-08-19
  Time: 23:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <jsp:directive.include file="header.jsp"/>

    <div align="center">
        <h2>Login</h2>
        <form action="">
            email: <input type="text" size="10"><br>
            password: <input type="password" size="10">
            <input type="submit" value="login">
        </form>
    </div>

    <jsp:directive.include file="footer.jsp"/>
</body>
</html>
