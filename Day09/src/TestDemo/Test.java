package TestDemo;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("12"));

        Integer[] arr = {1,2,3};
        Arrays.sort(arr, (o1, o2) -> o2 -o1);
    }
}
