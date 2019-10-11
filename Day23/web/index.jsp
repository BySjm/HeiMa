<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
%>
<%--<%=list %>--%>
<%
  out.print(97);//97
  out.write(97);//a
  response.getWriter().print(97);//97
  response.getWriter().write(97);//a
%>
<a href="jsp/a.jsp">跳转到a.jsp页面</a>
<a href="${pageContext.request.contextPath}/jsp/a.jsp">跳转到a.jsp页面</a>
</body>
</html>
