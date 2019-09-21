package ProducerAndConsumer;

public class TestProducerAndConsumerDemo {
    public static void main(String[] args) {

        BaoZi bz = new BaoZi();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (bz) {
                        if (bz.bz) {
                            try {
                                bz.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println("生产者生产好了包子");
                        bz.bz = true;
                        System.out.println("吃货快来吃吧");
                        bz.notify();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (bz) {
                        if (!bz.bz) {
                            try {
                                bz.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println("吃货开始吃包子");
                        bz.bz = false;
                        System.out.println("生产者快做吧");
                        bz.notify();
                    }
                }
            }
        }).start();

    }
}
