package Demo02_volatile;

public class TestVolatileDemo {
    public static void main(String[] args) {
        VolatileThread volatileThread = new VolatileThread();
        volatileThread.start();

        while (true){
            synchronized (volatileThread){
                if (volatileThread.isFlag()){
                    System.out.println("执行了~~~~");
                }
            }
        }

    }
}
