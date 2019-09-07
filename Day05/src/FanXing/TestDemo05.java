package FanXing;

public class TestDemo05 {
    public static void main(String[] args) {
        String[] str = {"a", "b", "c", "d"};
        method(str, 2, 3);
    }

    public static <E> void method(E[] e, int a, int b) {
        E temp = e[a - 1];
        e[a - 1] = e[b - 1];
        e[b - 1] = temp;
        for (E e1 : e) {
            System.out.println(e1);
        }
    }

}
