<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    System.out.println("a.jsp页面执行了");
    String username = request.getParameter("username");
    System.out.println(username);
%>
<jsp:forward page="B.jsp">
    <jsp:param name="name" value="zhangsan"/>
</jsp:forward>
</body>
</html>
