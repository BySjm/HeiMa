<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Integer money = 10;
    request.setAttribute("money",money);
%>
<c:choose>
    <c:when test="${money==500}">
        单身狗....
    </c:when>
    <c:when test="${money>500}">
        撩一个小姐姐
    </c:when>
    <c:when test="${money>5000}">
        你好呀大佬
    </c:when>
    <c:otherwise>
        来传智啊！！！！
    </c:otherwise>
</c:choose>
</body>
</html>
