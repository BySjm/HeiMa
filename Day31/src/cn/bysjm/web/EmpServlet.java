package cn.bysjm.web;

import cn.bysjm.domain.Emp;
import cn.bysjm.domain.PageBean;
import cn.bysjm.domain.QueryVo;
import cn.bysjm.service.EmpService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

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
        } else if ("findByCondition".equals(action)) {
            findByCondition(request, response);
        } else if ("updateData".equals(action)) {
            updateData(request, response);
        } else if ("updateEmp".equals(action)) {
            updateEmp(request, response);
        }else if ("addEmp".equals(action)){
            addEmp(request, response);
        }else {
            response.getWriter().write("非法参数");
        }
    }

    //分页
    private void findByCondition(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ename = request.getParameter("ename");
        String address = request.getParameter("address");
        String currentPageStr = request.getParameter("currentPage");
        String pageSizeStr = request.getParameter("pageSize");
        Integer currentPage = Integer.valueOf(currentPageStr);
        Integer pageSize = Integer.valueOf(pageSizeStr);
        QueryVo queryVo = new QueryVo(ename, address, currentPage, pageSize);
        PageBean<Emp> pageBean = service.findByCondition(queryVo);
        request.setAttribute("pageBean", pageBean);
        request.setAttribute("ename", ename);
        request.setAttribute("address", address);
        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }

    //更新
    private void updateData(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Emp emp = service.updateData(Integer.parseInt(id));
        request.setAttribute("emp", emp);
        request.getRequestDispatcher("/update.jsp").forward(request, response);
    }

    private void updateEmp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> parameterMap = request.getParameterMap();
        Emp emp = new Emp();
        try {
            BeanUtils.populate(emp, parameterMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        service.updateEmp(emp);
        response.sendRedirect(request.getContextPath() + "/empServlet?action=findByCondition&currentPage=1&pageSize=5");
    }

    private void addEmp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> parameterMap = request.getParameterMap();
        Emp emp = new Emp();
        try {
            BeanUtils.populate(emp, parameterMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        service.addEmp(emp);
        response.sendRedirect(request.getContextPath() + "/empServlet?action=findByCondition&currentPage=1&pageSize=5");
    }

    private void findByPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String currentPageStr = request.getParameter("currentPage");
        String pageSizeStr = request.getParameter("pageSize");
        Integer currentPage = Integer.valueOf(currentPageStr);
        Integer pageSize = Integer.valueOf(pageSizeStr);
        PageBean<Emp> pageBean = service.findByPage(currentPage, pageSize);
        request.setAttribute("pageBean", pageBean);
        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }

    //删除所选
    private void dels(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] values = request.getParameterValues("ids");
        if (values == null) {
            values = request.getParameter("id").split(",");
        }
        service.dels(values);

        response.sendRedirect(request.getContextPath() + "/empServlet?action=findByCondition&currentPage=1&pageSize=5");
    }

    //查询所有
    private void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Emp> list = service.findAll();
        request.setAttribute("list", list);
        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }


}
