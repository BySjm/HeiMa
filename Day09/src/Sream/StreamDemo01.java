package Sream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo01 {
    public static void main(String[] args) {
        //Stream<String> original = Stream.of("A", "BB", "333", "4444", "55555");

        //过滤操作filter
        //original.filter( s -> s.length() > 2).forEach(System.out::println);
        //提取前几个limit
        //original.limit(3).forEach(System.out::println);
        //跳过前几个skip
        //original.skip(3).forEach(System.out::println);
        //map
        //original.map( s -> (int)s.charAt(0)).forEach(System.out::println);
        //合并两个流concat
        Stream.concat(Stream.of("1", "2", "3", "4", "5"), Stream.of("6", "7", "8", "9", "10")).forEach(System.out::println);
        Stream.concat(Stream.of("1", "2", "3", "4", "5"), Stream.of("6", "7", "8", "9", "10")).forEach( s -> System.out.println("元素" + s));
        //统计数量count()
        //System.out.println(original.count());
        //遍历forEach
        //original.forEach(System.out::println);
    }
}
