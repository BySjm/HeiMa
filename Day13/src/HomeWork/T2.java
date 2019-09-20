package HomeWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 二.请用户键盘录入他的生日，要求格式(yyyy/MM/dd)。
 * 请打印他出生那天是星期几？以及他一周岁生日那天是星期几？
 * 注意：如果用户输入生日格式错误，要提示重新输入！(可以利用异常处理)
 */
public class T2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的生日:格式(yyyy/MM/dd)");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = null;
        String birth = null;
        while (true){
            try {
                birth = sc.nextLine();
                date = sdf.parse(birth);
                break;
            } catch (ParseException e) {
                System.out.println("你输入的格式有误,请重新输入你的生日:格式(yyyy/MM/dd)");
            }
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        String[] weekOfDay = {"日", "一", "二", "三", "四", "五", "六"};
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("你出身的那天是星期" + weekOfDay[calendar.get(Calendar.DAY_OF_WEEK) - 1]);
        String[] split = birth.split("/");
        calendar.set(Calendar.YEAR, Integer.parseInt(split[0]) + 1);
        System.out.println("一周岁生日那天是星期" + weekOfDay[calendar.get(Calendar.DAY_OF_WEEK) - 1]);

    }
}
