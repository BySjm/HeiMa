package Search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {50, 10, 14, 21, 38, 45, 47, 53, 81, 87, 99};
    }

    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = (end + start) / 2;
            if (key == arr[middle]) {
                return middle;
            }   else if (arr[middle] > key) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }
}
