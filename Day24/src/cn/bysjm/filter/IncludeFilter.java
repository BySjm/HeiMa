package cn.bysjm.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/index.jsp", dispatcherTypes = DispatcherType.INCLUDE)
public class IncludeFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("begin");
        chain.doFilter(req, resp);
        System.out.println("end");
        //Subinterfaces
        //Superinterfaces
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
