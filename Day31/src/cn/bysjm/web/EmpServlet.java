package cn.bysjm.web;

import cn.bysjm.domain.Emp;
import cn.bysjm.domain.PageBean;
import cn.bysjm.service.EmpService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/empServlet")
public class EmpServlet extends HttpServlet {

    EmpService service = new EmpService();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("findAll".equals(action)) {
            findAll(request, response);
        } else if ("dels".equals(action)) {
            dels(request, response);
        } else if ("findByPage".equals(action)){
            findByPage(request, response);
        }else {
            response.getWriter().write("非法参数");
        }
    }

    protected void findByPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String currentPageStr = request.getParameter("currentPage");
        String pageSizeStr = request.getParameter("pageSize");
        Integer currentPage = Integer.valueOf(currentPageStr);
        Integer pageSize = Integer.valueOf(pageSizeStr);
        PageBean<Emp> pageBean = service.findByPage(currentPage,pageSize);
        request.setAttribute("pageBean",pageBean);
        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }

    //删除所选
    private void dels(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] values = request.getParameterValues("ids");
        service.dels(values);
        response.sendRedirect(request.getContextPath() + "/empServlet?action=findAll");
    }

    //查询所有
    private void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Emp> list = service.findAll();
        request.setAttribute("list", list);
        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
