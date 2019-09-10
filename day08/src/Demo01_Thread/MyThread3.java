package Demo01_Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread3 implements Runnable{

    private int count = 100;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            lock.lock();
            if (count > 0){
                System.out.println(Thread.currentThread().getName() + "当前数字是" + count);
                count--;
            }
            lock.unlock();
        }
    }
}
