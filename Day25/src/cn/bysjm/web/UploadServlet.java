package cn.bysjm.web;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@WebServlet("/uploadServlet")
public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ServletFileUpload servletFileUpload = new ServletFileUpload(new DiskFileItemFactory());
            List<FileItem> fileItems = servletFileUpload.parseRequest(request);
            for (FileItem fileItem : fileItems) {
                //是普通项
                if (fileItem.isFormField()) {
                    String name = fileItem.getFieldName();// 获取普通项的参数名称
                    String value = fileItem.getString();// 获取普通项的参数值
                    System.out.println(name + " " + value);
                }else {//是文件
                    String fileName = fileItem.getName();
                    System.out.println(fileName);
                    InputStream is = fileItem.getInputStream();
                    String path = getServletContext().getRealPath("upload/");
                    System.out.println(path);
//                    FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\SanJiaoMao\\Desktop\\1\\"+fileName));
//                    FileOutputStream fos = new FileOutputStream("C:\\Users\\SanJiaoMao\\Desktop\\1\\copy.png");
                    FileOutputStream fos = new FileOutputStream(new File(path+fileName));
                    IOUtils.copy(is,fos);
                    is.close();
                    fos.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
