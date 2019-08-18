<%--
  Created by IntelliJ IDEA.
  User: danie
  Date: 18-08-19
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Page</title>
</head>
<body>
    <jsp:directive.include file="header.jsp"/>

    <div align="center">
        <h2>Administrative DashBoard</h2>
    </div>

    <div align="center">
        <h2>quick actions:</h2>
        <a href="create_book">new book</a>
        <a href="create_user">new user</a>
        <a href="create_category">new category</a>
        <a href="create_customer">new customer</a>
    </div>

    <div align="center">
        <hr width="60%"/>
        <h2>Recent Sales:</h2>
        <hr width="60%"/>
    </div>

    <div align="center">
        <hr width="60%"/>
        <h2>Recent Reviews:</h2>
        <hr width="60%"/>
    </div>

    <div align="center">
        <hr width="60%"/>
        <h2>Statistics:</h2>
        <hr width="60%"/>
    </div>

    <jsp:directive.include file="footer.jsp"/>
</body>
</html>
