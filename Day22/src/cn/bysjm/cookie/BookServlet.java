package cn.bysjm.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class BookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        String id = request.getParameter("id");
        Cookie[] cookies = request.getCookies();

        Cookie cookie = null;
        if (cookies != null){
            for (Cookie ck : cookies) {
                if ("ids".equals(ck.getName())){
                    cookie = ck;
                }
            }
        }

        if (cookie == null){
            cookie = new Cookie("ids", id);
        }else {
            String value = cookie.getValue();
            String[] split = value.split("-");
            List<String> strings = Arrays.asList(split);
            if (!strings.contains(id)) {
                value = value + "-" + id;
                System.out.println(value);
            }
            cookie = new Cookie("ids", value);
        }
        response.addCookie(cookie);
        response.getWriter().print("<a href='book.html'>继续浏览书籍</a>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}