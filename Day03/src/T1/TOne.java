package T1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TOne {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = format.format(date);
        System.out.println(now);
    }
}
