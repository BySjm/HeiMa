package Demo10_DeadLock;

import demo08_Exchanger.ThreadA;

public class TestDeadLock {

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        Thread t1 =  new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj1){
                    System.out.println("线程1抢到了第一个锁对象，还需要第二个锁对象");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj2){
                        System.out.println("线程1抢到了第二个锁对象");
                        System.out.println("执行任务！");
                    }
                }
            }
        });
        t1.start();
        Thread t2 =  new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj2){
                    System.out.println("线程2抢到了第一个锁对象，还需要第二个锁对象");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj1){
                        System.out.println("线程2抢到了第二个锁对象");
                        System.out.println("执行任务！");
                    }
                }
            }
        });
        t2.start();
    }

}
