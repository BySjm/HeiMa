package Sream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCollectorStreamDemo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("jack", "jack", "tom", "jerry", "marry", "hanmmeimei", "lilei");

        //System.out.println(stream.collect(Collectors.toList()));

        System.out.println(stream.collect(Collectors.toSet()));

//        Object[] objects = stream.toArray();
//        for (Object object : objects) {
//            System.out.println(object);
//        }

    }
}
