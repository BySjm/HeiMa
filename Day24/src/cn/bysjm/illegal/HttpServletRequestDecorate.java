package cn.bysjm.illegal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.List;

public class HttpServletRequestDecorate extends HttpServletRequestWrapper {

    private List<String> illegalWords;

    public HttpServletRequestDecorate(HttpServletRequest request,List<String> illegalWords) {
        super(request);
        this.illegalWords = illegalWords;
    }

    @Override
    public String getParameter(String name) {
        String message = super.getParameter(name);
        for (String illegalWord : illegalWords) {
            if (message.contains(illegalWord)){
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < illegalWord.length(); i++) {
                    sb.append("*");
                }
                message = message.replace(illegalWord,sb.toString());
            }
        }
        return message;
    }
}
