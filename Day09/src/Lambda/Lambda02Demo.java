package Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda02Demo {
    public static void main(String[] args) {
        Integer[] arr = {1, 512, 435, 5434, 67, 90, 3};

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        Arrays.sort(arr, (o1, o2) -> o2 - o1);

    }
}
