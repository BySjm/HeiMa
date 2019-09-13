package HomeWork;

import java.util.stream.Stream;

public class T1 {
    public static void main(String[] args) {
        Object[] array = Stream.of("黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏".split("，")).filter(s -> s.startsWith("郭")).toArray();
        for (Object o : array) {
            System.out.print(o + "  ");
        }
    }
}
