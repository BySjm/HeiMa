package FanXing;

public class TestDemo06 {

    public static void main(String[] args) {
        String[] str = {"张安","李四","上课","官翻机","深刻","高考放假","功能"};
        method(str);
    }

    public static <E> void method(E[] e) {
        for (int min = 0, max = e.length - 1; min < max; min++, max--) {
            E temp = e[min];
            e[min] = e[max];
            e[max] = temp;
        }

        for (E now : e) {
            System.out.println(now);
        }
    }

}
