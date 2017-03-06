<%--
  Created by IntelliJ IDEA.
  User: 朱云鹏
  Date: 2017/3/6
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>

<h1>welcome</h1>
<form action="${pageContext.request.contextPath}/user/register" method="post">
    <table>
        <tr>
            <td>username:</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>password:</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="submit"/>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
