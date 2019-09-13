package HomeWork.T2;

import java.util.function.Function;
import java.util.stream.Stream;

public class T2 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, -2, -3, 4, -5);
        stream.map(integer -> Math.abs(integer)).forEach(System.out::println);
    }
}
