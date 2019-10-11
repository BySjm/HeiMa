<%@ page import="cn.bysim.domain.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user = new User("张三丰","123456");
    request.setAttribute("user",user);
%>
<c:if test="${not empty user}">
    你好,${user.username}
</c:if>
<c:if test="${empty user}">
    你好,请登录
</c:if>
</body>
</html>
