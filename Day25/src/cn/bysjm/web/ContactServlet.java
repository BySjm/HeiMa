package cn.bysjm.web;

import cn.bysjm.domain.Contact;
import cn.bysjm.service.ContactService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet("/contactServlet")
public class ContactServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("findAll".equals(action)){
            findAll(request, response);
        }else if ("add".equals(action)){
            add(request, response);
        }else if ("delete".equals(action)){
            delete(request, response);
        }else if ("findById".equals(action)){
            findById(request, response);
        }else if ("update".equals(action)){
            update(request, response);
        }
    }

    private void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ContactService contactService = new ContactService();
        List<Contact> list = contactService.findAll();
        request.setAttribute("list", list);
        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> map = request.getParameterMap();
        ContactService service = new ContactService();
        Contact contact = new Contact();
        try {
            BeanUtils.populate(contact,map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        service.save(contact);
        response.sendRedirect(request.getContextPath()+"/contactServlet?action=findAll");
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        ContactService service = new ContactService();
        service.delete(id);
        response.sendRedirect(request.getContextPath()+"/contactServlet?action=findAll");
    }

    private void findById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String id = request.getParameter("id");
        ContactService service = new ContactService();
        Contact contact = service.findById(id);
        request.setAttribute("contact",contact);
        request.getRequestDispatcher("/update.jsp").forward(request,response);
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        Map<String, String[]> parameterMap = request.getParameterMap();
        Contact contact = new Contact();
        try {
            BeanUtils.populate(contact,parameterMap);
        } catch ( Exception e) {
            e.printStackTrace();
        }
        ContactService service = new ContactService();
        service.update(contact);
        response.sendRedirect(request.getContextPath()+"/contactServlet?action=findAll");
    }

}
