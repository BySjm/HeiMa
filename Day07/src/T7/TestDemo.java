package T7;

public class TestDemo {
    public static void main(String[] args) {
        new CountThread(10).start();
        new CountThread(5).start();
        new CountThread(8).start();
    }
}
