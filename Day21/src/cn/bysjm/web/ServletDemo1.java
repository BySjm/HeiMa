package cn.bysjm.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1--请求方式 GET/POST
        String method = request.getMethod();
        System.out.println(method);
        //2--请求行中的资源地址部分->/Day21/sd1
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);
        //3 ---获取客户端请求完整URL->http://localhost:8080/Day21/sd1
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURL);
        //4 ---获取请求协议和版本->HTTP/1.1
        String protocol = request.getProtocol();
        System.out.println(protocol);
        //5 ---获取端口
        int localPort = request.getLocalPort();
        System.out.println(localPort);
        //6 ---获取请求者的ip地址
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
        //7 ---获取当前的项目名路径->/Day21
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
