package HomeWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 三.请用户键盘录入他的生日，要求格式(yyyy-MM-dd)。
 *    请编程计算他来到世界多少天？
 *    注意：如果用户输入生日格式错误，要提示重新输入！(可以利用异常处理)
 */
public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的生日:格式(yyyy-MM-dd)");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        String birth = null;
        while (true){
            try {
                birth = sc.nextLine();
                date = sdf.parse(birth);
                break;
            } catch (ParseException e) {
                System.out.println("你输入的格式有误,请重新输入你的生日:格式(yyyy-MM-dd)");
            }
        }
        long bir = date.getTime();
        long now = System.currentTimeMillis();
        long day = (now - bir) / 1000 / 60 / 60 / 24;
        System.out.println("你来到世界已经"+ day +"多少天");
    }
}
