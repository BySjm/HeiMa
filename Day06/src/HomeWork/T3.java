package HomeWork;

import java.util.*;

public class T3 {

    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1,2,3,3,4,2);
        Map<Integer, List<Integer>> map = classify(numbers);
        Set<Map.Entry<Integer, List<Integer>>> entries = map.entrySet();
        for (Map.Entry<Integer, List<Integer>> entry : entries) {
            System.out.println(entry.getKey() + "=" +  entry.getValue());
        }
    }

    public static Map<Integer,List<Integer>> classify(Collection<Integer> numbers){
        //创建一个Map集合，用于保存需要返回的数据
        Map<Integer, List<Integer>> map = new HashMap<>();
        //定义一个List类型的变量
        List<Integer> list = null;
        for (Integer number : numbers) {
            if (map.containsKey(number)){
                list = map.get(number);
            }else {
                list = new ArrayList<>();
            }
            list.add(number);
            map.put(number, list);
        }
        return map;
    }

}
