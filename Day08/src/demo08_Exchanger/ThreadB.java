package demo08_Exchanger;

import java.util.concurrent.Exchanger;

public class ThreadB extends Thread{

    private Exchanger ec;

    public ThreadB(Exchanger ec){
        this.ec = ec;
    }

    @Override
    public void run() {
        System.out.println("B线程运行了");
        try {
            System.out.println("把礼物给A了");
            String str = "this is another gift";
            Object fromA = ec.exchange(str);
            System.out.println("这是来自A的礼物" + fromA);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
