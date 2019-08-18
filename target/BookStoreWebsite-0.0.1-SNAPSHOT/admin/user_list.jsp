
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html lang="eng">
<head>
    <title>Mangage Users</title>
</head>
<body>

    <jsp:directive.include file="header.jsp"/>

    <div align="center">
        <h2>Users Management</h2>
        <a href="user_form.jsp">Create New User</a>
    </div>

    <c:if test="${message != null}">
        <div align="center">
            <h4>${message}</h4>
        </div>
    </c:if>

    <div align="center">

        <table border="1">
            <tr>
                <th>Index</th>
                <th>ID</th>
                <th>E-mail</th>
                <th>Name</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="user" items="${listUsers}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${user.userId}</td>
                    <td>${user.email}</td>
                    <td>${user.fullName}</td>
                    <td>
                        <a href="">Edit</a>
                        <a href="">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>

    <jsp:directive.include file="footer.jsp"/>

</body>
</html>
