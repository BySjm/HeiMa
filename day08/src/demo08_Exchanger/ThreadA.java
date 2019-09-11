package demo08_Exchanger;

import java.util.concurrent.Exchanger;

public class ThreadA extends Thread{

    private Exchanger ec;

    public ThreadA(Exchanger ec){
        this.ec = ec;
    }

    @Override
    public void run() {
        System.out.println("这是A线程执行了");

        try {
            System.out.println("把礼物传给A了");
            String str = "this is a gift";
            Object fromB = ec.exchange(str);
            System.out.println("来自B的礼物是" + fromB);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
