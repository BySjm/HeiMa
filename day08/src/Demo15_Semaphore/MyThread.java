package Demo15_Semaphore;

import java.util.concurrent.Semaphore;

public class MyThread extends Thread{

    private Semaphore sp;

    public MyThread(Semaphore sp){
        this.sp = sp;
    }

    @Override
    public void run() {
        try {
            //获取许可
            sp.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + "开始时间:" + System.currentTimeMillis());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + "结束时间:" + System.currentTimeMillis());
        //归还许可
        sp.release();
    }
}
