package Test;

import java.util.HashMap;
import java.util.Set;

//keySet遍历Map
public class TestKeySetDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("张三", 20);
        map.put("李四", 21);
        map.put("王五", 22);
        map.put("赵六", 23);
        map.put("田七", 24);
        System.out.println(map);
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s);
        }
    }
}
