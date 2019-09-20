package TestDemo;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] copy = Arrays.copyOf(arr, 6);
        for (int a : copy) {
            System.out.println(a);
        }
    }
}
