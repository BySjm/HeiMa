<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        List<String> list = new ArrayList<>();
        pageContext.setAttribute("list",list);
    %>
${empty list}
    <hr>
${pageContext.request.contextPath}
</body>
</html>
