package cn.bysjm.session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class CartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String name = request.getParameter("name");
        HttpSession session = request.getSession();
        Map<String, Integer> cart = (Map<String, Integer>) session.getAttribute("cart");
        Integer count = null;
        if (cart == null) {
            cart = new HashMap<>();
            count = 1;
        } else {
            count = cart.get(name);
            if (count == null) {
                count = 1;
            } else {
                count = count + 1;
            }
        }
        cart.put(name, count);
        session.setAttribute("cart", cart);
        response.getWriter().print("<a href='Product.html'>继续购物</a> <a href='cart.jsp'>查看购物车</a>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
