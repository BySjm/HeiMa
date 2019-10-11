<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3 align="center">用户列表</h3>
<table border="1px" align="center" width="300px">
    <tr align="center">
        <th>编号</th>
        <th>用户名</th>
        <th>密码</th>
    </tr>
    <c:forEach items="${users}" var="user" varStatus="s">
        <tr align="center">
            <td>${s.count}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
