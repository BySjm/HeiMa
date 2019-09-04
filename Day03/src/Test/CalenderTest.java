package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderTest {
    public static void main(String[] args) throws ParseException {
        Calendar cld = Calendar.getInstance();
        System.out.println(cld);
        System.out.println("-----今天的日历信息-----");
        getSome(cld);
        //200天后是星期几？
        cld.add(Calendar.DAY_OF_MONTH, 200);
        System.out.println("-----200天后-----");
        getSome(cld);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("1996-11-11");
        cld.setTime(date);
        System.out.println("-----1996-11-11的日历信息-----");
        getSome(cld);

    }

    public static void getSome(Calendar cld){
        //年
        System.out.println("年份" + cld.get(Calendar.YEAR));
        //月
        System.out.println("月份" + (cld.get(Calendar.MONTH) + 1));
        //日
        System.out.println("日" + cld.get(Calendar.DAY_OF_MONTH));
        //星期几
        int week = cld.get(Calendar.DAY_OF_WEEK);
        System.out.println("星期" + getWeek(week));
    }

    public static char getWeek(int week){
        char[] chars = {'日', '1', '2', '3', '4', '5', '6'};
        return chars[week - 1];
    }

}
