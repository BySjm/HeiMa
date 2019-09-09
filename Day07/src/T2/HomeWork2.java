package T2;

import java.util.Objects;

public class HomeWork2 {

    public static void main(String[] args) throws Exception {
        int[] arr = {1, 432, 4, 325, 24, 365, 25, 89, 6, 3, 476, 875, 846};
        getMax(arr);
    }

    public static int getMax(int[] arr) throws Exception {
        //Objects.requireNonNull(arr);
        if (arr == null)
            throw new NullPointerException("空指针");
        if (arr.length == 0)
            throw new ArrayIndexOutOfBoundsException("数组下标越界");
        int max = arr[0];
        if (arr.length == 1)
            return max;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max)
//                arr[i] = max;
//        }
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }
}
