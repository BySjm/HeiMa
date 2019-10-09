<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>历史记录</title>
</head>
<body>
<%
    String[] books = {"","西游记","红楼梦","三国演义","水浒传"};
    Cookie[] cookies = request.getCookies();
    if (cookies != null){
        for (Cookie cook : cookies) {
            if ("ids".equals(cook.getName())){
                List<String> ids = Arrays.asList(cook.getValue().split("-"));
                for (String id : ids) {
                    response.getWriter().print(books[Integer.parseInt(id)] + " ");
                }
                return;
            }
        }
    }
    response.getWriter().print("你还没有看过任何书籍");
%>
</body>
</html>
