<%--
  Created by IntelliJ IDEA.
  User: danie
  Date: 18-08-19
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create New User</title>
</head>
<body>

    <jsp:directive.include file="header.jsp"/>

    <div align="center">
        <h2>Create New User</h2>
    </div>

    <div align="center">

        <form action="create_user" method="post" onsubmit="return validateFormInput()">
            <table>
                <tr>
                    <td>Email:</td>
                    <td><input type="text" id="email" name="email" size="20"/></td>
                </tr>
                <tr>
                    <td>Full name:</td>
                    <td><input type="text" id="fullName" name="fullname" size="20"/></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" id="password" name="password" size="20"/></td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="Save">
                        <input type="reset" value="Cancel">
                    </td>
                </tr>
            </table>
        </form>

    </div>


    <jsp:directive.include file="footer.jsp"/>

</body>
<script type="text/javascript">
    function validateFormInput(){
        var fieldEmail = document.getElementById("email");
        var fieldFullName = document.getElementById("fullName");
        var fieldPassword = document.getElementById("password");

        if (fieldEmail.value.length==0){
            alert("email is required !");
            fieldEmail.focus;
            return false;
        }

        if (fieldFullName.value.length==0){
            alert("Name is required !");
            fieldFullName.focus;
            return false;
        }

        if (fieldPassword.value.length==0){
            alert("password is required !");
            fieldPassword.focus;
            return false;
        }

        return true;
    }
</script>
</html>
