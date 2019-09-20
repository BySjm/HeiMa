package TestDemo;

//匿名内部类只能用局部变量，不能修改局部变量
public class Sout {

    public static int a = 1;

    public static void main(String[] args) {

        Object obj = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        if (a == 2){
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println("1");
                        a = 2;
                        obj.notify();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        if (a == 1){
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println("2");
                        a = 1;
                        obj.notify();
                    }
                }
            }
        }).start();
    }
}
//18811523253