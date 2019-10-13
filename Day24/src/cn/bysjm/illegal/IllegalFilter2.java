package cn.bysjm.illegal;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class IllegalFilter2 implements Filter {

    //保存非法字符
    private List<String> illegalWords = new ArrayList<>();

    public void init(FilterConfig config) throws ServletException {
        InputStream is = IllegalFilter.class.getClassLoader().getResourceAsStream("illegalwords.txt");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(is, "utf-8"));
            String line = null;
            while ((line = br.readLine()) != null) {
                illegalWords.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //判断输入的字符
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletRequestDecorate hsrd = new HttpServletRequestDecorate(request, illegalWords);
        chain.doFilter(hsrd, resp);
    }

    public void destroy() {
    }
}
