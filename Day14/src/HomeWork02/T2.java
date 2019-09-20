package HomeWork02;

public class T2 {
    public static void main(String[] args) {
        String str = "我是你";
        boolean b = str.matches("[\\u4e00-\\u9fa5]+");
        System.out.println(b);
    }
}
