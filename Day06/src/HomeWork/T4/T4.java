package HomeWork.T4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class T4 {

    public static void main(String[] args) {
        getNum("helloworld java");
    }

    private static String getNum(String str){
        //char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char at = str.charAt(i);
            if (map.containsKey(at)){
                Integer integer = map.get(at);
                map.put(at, integer + 1);
            }else {
                if (at == 32){
                    continue;
                }else
                    map.put(at, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.print(entry.getKey() + "(" + entry.getValue() + ")");
        }
        return null;
    }

}
