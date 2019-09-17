package TestDemo04;

import java.util.Random;

public class ItHeiMa implements SchoolService{
    @Override
    public String login(String username, String password) throws InterruptedException {
        Thread.sleep(1000);
        String result = "";
        if ("admin".equals(username) && "123".equals(password)) {
            result = "登录成功..";
        } else {
            result = "登录失败";
        }
        return result;
    }

    @Override
    public int searchMyScore() throws InterruptedException {
        System.out.println("正在查询成绩...");
        Thread.sleep(1000);
        int score = new Random().nextInt(101);
        return score;
    }

    @Override
    public String buyCourse(int money) throws InterruptedException {
        System.out.println("正在支付...");
        Thread.sleep(1000);
        String result = "";
        if (money > 1000) {
            result = "购买成功..";
        } else {
            result = "购买失败,错误码509...";
        }
        return result;
    }
}
