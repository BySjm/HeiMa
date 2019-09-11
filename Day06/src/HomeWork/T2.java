package HomeWork;

import java.util.Arrays;
import java.util.HashSet;

public class T2 {

    public static void main(String[] args) {
        System.out.println(create());
    }

    private static String create() {
        String[] red = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
                "24", "25", "26", "27", "28", "29", "30", "31", "32", "33"};
        //创建蓝球
        String[] blue = "01,02,03,04,05,06,07,08,09,10,11,12,13,14,15,16".split(",");

        HashSet<String> set = new HashSet<>();
        while (set.size() < 6) {
            set.add(red[(int) (Math.random() * 33)]);
        }
        String[] arr = new String[7];
        set.toArray(arr);
        arr[6] = blue[(int) (Math.random() * 16)];
        return Arrays.toString(arr);
    }
}
