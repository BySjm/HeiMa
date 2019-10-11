<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        pageContext.setAttribute("name","1");
        request.setAttribute("name","2");
        session.setAttribute("name","3");
        application.setAttribute("name","4");
        List<String> list = new ArrayList<>();
        list.add("路飞");
        list.add("索隆");
        list.add("山治");
        pageContext.setAttribute("list",list);
        Map<String,String> map = new HashMap<>();
        map.put("name","京龙");
        map.put("age","18");
        map.put("gender","男");
        pageContext.setAttribute("map",map);
    %>
${name}<br>
${list}<br>
${list[0]}<br>
${map}<br>
${map.name}<br>
${map["age"]}<br>
</body>
</html>