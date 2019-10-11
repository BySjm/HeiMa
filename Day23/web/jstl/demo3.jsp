<%@ page import="java.util.*" %>
<%@ page import="cn.bysim.domain.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>普通for循环</h3>
<c:forEach begin="0" end="10" step="1" var="s">
    ${s}
</c:forEach>
<h3>增强for循环</h3>
<%
    List<User> list = new ArrayList<>();
    list.add(new User("整节课1","12345"));
    list.add(new User("整节课2","12345"));
    list.add(new User("整节课3","12345"));
    list.add(new User("整节课4","12345"));
    list.add(new User("整节课5","12345"));
    list.add(new User("整节课6","12345"));
    request.setAttribute("user",list);
%>
<c:forEach items="${user}" var="list" varStatus="s">
    ${s.index} ${s.count} ${list.username}<br>
</c:forEach>
<hr>
<%
    Map<String,Object> map = new HashMap<>();
    map.put("key1", "郭德纲");
    map.put("key2", "谦大爷");
    map.put("key3", "小岳岳");
    request.setAttribute("map", map);
%>
<c:forEach items="${map}" var="entry">
    ${entry.key} ${entry.value} <br>
</c:forEach>
</body>
</html>
