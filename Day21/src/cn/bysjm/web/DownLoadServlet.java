package cn.bysjm.web;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.URLEncoder;
import java.util.Base64;

public class DownLoadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fileName = request.getParameter("fileName");
        ServletContext servletContext = getServletContext();
//        String path = servletContext.getRealPath("download/" + fileName);
//        File file = new File(path);
//        FileInputStream is = new FileInputStream(file);
        //以上三行代码可以缩写为这一句
        InputStream is = servletContext.getResourceAsStream("download/" + fileName);
        ServletOutputStream os = response.getOutputStream();
        String value = request.getHeader("user-agent");
        String encode = null;
        if (value.contains("Firefox")){
            // base64位
            Base64.Encoder encoder = Base64.getEncoder();
            encode = "=?utf-8?B?" + encoder.encodeToString(fileName.getBytes("utf-8")) + "?=";
        }else {
            // utf-8位
            encode = URLEncoder.encode(fileName,"utf-8");
        }
        response.setHeader("content-disposition","attachment;filename="+encode);
        IOUtils.copy(is,os);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
