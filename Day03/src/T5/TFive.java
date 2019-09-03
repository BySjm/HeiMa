package T5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TFive {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy年MM/DD HH时mm分ss秒");
        Date parse1 = format1.parse("2014年09/28 23时13分01秒");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM月DD日 HH时mm分ss秒");
        Date parse2 = format2.parse("2009-02月12日 12时02分01秒");
        long time1 = parse1.getTime();
        long time2 = parse2.getTime();
        long day = (time1 - time2) / 1000 / 60 / 60 / 24;
        System.out.println(day);
    }
}
