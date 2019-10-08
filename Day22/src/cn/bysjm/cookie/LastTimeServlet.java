package cn.bysjm.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LastTimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决中文乱码
        response.setContentType("text/html;charset=utf-8");
        //时间
        String date = URLEncoder.encode(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").
                format(new Date()), "utf-8");
        Cookie cookie = new Cookie("time", date);
        cookie.setPath(request.getContextPath());
        cookie.setMaxAge(60);
        //写回给浏览器
        response.addCookie(cookie);
        //
        Cookie[] cookies = request.getCookies();
        if (cookies != null){
            for (Cookie cookie1 : cookies) {
                if ("time".equals(cookie1.getName())){
                    String decode = URLDecoder.decode(cookie1.getValue(), "utf-8");
                    response.getWriter().print("您上次的访问时间是:" + decode);
                    return;
                }
            }
        }
        response.getWriter().print("该用户没有访问过");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
