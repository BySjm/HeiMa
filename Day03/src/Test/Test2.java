package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        Date dateNow = new Date();
        long dateNowTime = dateNow.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH-ss-mm");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生日期:(格式:yyyy-MM-dd HH-ss-mm)");
        String str = sc.next();
        Date dateBir = format.parse(str);
        long dateBirTime = dateBir.getTime();
        long day = (dateNowTime - dateBirTime) / 24 / 60 / 60 / 1000;
        System.out.println("你已经来地球" + day + "天了呦~");
    }
}
