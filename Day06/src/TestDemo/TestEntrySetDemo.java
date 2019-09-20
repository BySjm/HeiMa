package TestDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestEntrySetDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("张三", 20);
        map.put("李四", 21);
        map.put("王五", 22);
        map.put("赵六", 23);
        map.put("田七", 24);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        }

    }
}
