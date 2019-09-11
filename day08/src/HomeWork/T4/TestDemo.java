package HomeWork.T4;

public class TestDemo {
    public static void main(String[] args) {

        MyRunnable r = new MyRunnable();

        Thread t1 = new Thread(r, "前门");
        Thread t2 = new Thread(r, "后门");

        t1.start();
        t2.start();

    }
}
