package Demo01_Thread;

public class MyThread2 implements Runnable {

    private int count = 100;

    @Override
    public void run() {
        cell();
    }

    private synchronized void cell() {
        while (true) {
            if (count > 0) {
                System.out.println(Thread.currentThread().getName() + "当前数字是" + count);
                count--;
            }
        }
    }
}
