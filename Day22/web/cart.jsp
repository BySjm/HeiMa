<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车</title>
</head>
<body>
<%
    Map<String, Integer> cart = (Map<String, Integer>) request.getSession().getAttribute("cart");
    if (cart == null){
        response.getWriter().print("你的购物车还没有任何物品");
    }else {
        for (String name : cart.keySet()){
            response.getWriter().print("商品的名称是："+name+",商品的数量是:"+cart.get(name));
            response.getWriter().print("<br/>");
        }
    }
%>
</body>
</html>
