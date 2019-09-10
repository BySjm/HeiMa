package Demo01_Thread;

public class MyThread1 implements Runnable {

    private int count = 100;
    Object obj = new Object();

    @Override
    public void run() {
        synchronized (this) {
            while (true) {
                if (count > 0) {
                    System.out.println(Thread.currentThread().getName() + "当前数字是" + count);
                    count--;
                }
            }
        }
    }
}
