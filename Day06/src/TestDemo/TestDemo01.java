package TestDemo;

import java.util.*;

public class TestDemo01 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("张三1", 20);
        map.put("张三2", 20);
        map.put("张三3", 20);
        map.put("张三4", 20);
        map.put("张三5", 20);

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            entry.getKey();
        }

        System.out.println(map);

    }
}
