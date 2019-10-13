package cn.bysjm.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/index.jsp")
public class FilterDemo01 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("FilterDemo01过滤器执行了");
        chain.doFilter(req, resp);
        System.out.println("FilterDemo01过滤器增强了");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
