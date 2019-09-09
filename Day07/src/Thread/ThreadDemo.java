package Thread;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        MyThread2 myThread2 = new MyThread2();
        Thread thread1 = new Thread(myThread2);
        thread.start();
        thread1.start();

        for (int i = 0; i < 15; i++) {
            System.out.println("吃饭" + i);
        }

    }
}
