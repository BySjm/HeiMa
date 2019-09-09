package T7;

public class CountThread extends Thread{

    private int num;

    public CountThread(int num){
        this.num = num;
    }

    @Override
    public void run() {
        int sum  = 1;
        for (int i = num; i > 0; i--) {
            sum  *= i;
        }
        System.out.println(num + "阶乘的值为:" + sum);
    }
}
