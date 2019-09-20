package TestDemo;

public class TestVariableArgumentsDemo<E> {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5));
    }

    //可变参数实际上是数组
    private static int sum(int... i) {
        int sum = 0;
        for (int j = 0; j < i.length; j++) {
            sum += i[j];
        }
        return sum;
    }
}
