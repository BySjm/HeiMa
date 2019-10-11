<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="../index.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="top.jsp" %>
<h3>this is a body page</h3>
<%
    int i = 1 / 0;
%>
<%@include file="foot.jsp" %>
</body>
</html>
