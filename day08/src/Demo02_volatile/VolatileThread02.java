package Demo02_volatile;

public class VolatileThread02 extends Thread{

    private volatile boolean flag = false;

    public boolean isFlag() {
        return flag;
    }

    @Override
    public void run() {
        flag = true;
        System.out.println("flag=" + flag);
    }
}
