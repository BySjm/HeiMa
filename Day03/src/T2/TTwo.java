package T2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TTwo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = format.parse("2018-03-04");
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy年MM月dd日");
        String format2 = format1.format(parse);
        System.out.println(format2);
    }
}
