package T1;

public class HomeWork1 {
    public static void main(String[] args) {
        int[] arr = {1, 432, 4, 325, 24, 365, 25, 89, 6, 3, 476, 875, 846};
        //BubbleSort(arr);
        SelectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

}
