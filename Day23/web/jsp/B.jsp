<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    out.print("B.jsp页面执行了");
    String username = request.getParameter("username");
    String name = request.getParameter("name");
    out.print(username);
    out.print(name);
%>
</body>
</html>
