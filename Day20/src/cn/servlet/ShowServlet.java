package cn.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ShowServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        response.setContentType("text/html;charset=utf-8");
        Object count = servletContext.getAttribute("count");
        PrintWriter writer = response.getWriter();
        if (count == null) {
            writer.print("您当前还没有访问过该网站");
        } else {
            writer.print("您访问网站的次数是" + count);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
