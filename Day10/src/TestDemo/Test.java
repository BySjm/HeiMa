package TestDemo;

import java.io.File;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        File file = new File("ab");
        file.mkdir();
        File file2 = new File("ab\\cd");
        System.out.println(file2.mkdirs());

//        Stream.of("90","80","70","60").map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s);
//            }
//        });
//
//        Stream.of("90","80","70","60").map((s) -> Integer.parseInt(s));
//        Stream.of("90","80","70","60").map(Integer::parseInt);
//
        Stream.of("90","80","70","60").map(Integer::parseInt).toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[]{};
            }
        });


        Integer[] arr = Stream.of("90","80","70","60").map(Integer::parseInt).toArray(Integer[]::new);

    }
}
