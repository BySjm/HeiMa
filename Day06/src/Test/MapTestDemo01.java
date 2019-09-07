package Test;

import java.util.HashMap;
import java.util.Scanner;

//输入一个字符串,统计字符串中每个字符出现次数
public class MapTestDemo01 {

    public static void main(String[] args) {
        System.out.println("请输入一个字符串:");
        String str = new Scanner(System.in).nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, ++count);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }

}
