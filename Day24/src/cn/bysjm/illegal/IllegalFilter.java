package cn.bysjm.illegal;

import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IllegalFilter implements Filter {

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
        String message = req.getParameter("message");
        for (String illegalWord : illegalWords) {
            if (message.contains(illegalWord)){
                resp.getWriter().print("很抱歉，您输入的内容有敏感字符，请重新输入发布....");
                return;
            }
        }
        chain.doFilter(req, resp);
    }

    public void destroy() {
    }
}
