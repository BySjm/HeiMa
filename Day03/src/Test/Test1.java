package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws ParseException {
        //2019年09月13日 08时20分20秒
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date parse1 = format1.parse("2019年09月13日 08时20分20秒");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String format = format2.format(parse1);
        System.out.println(format);
    }
}
