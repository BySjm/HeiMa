package Demo02_Volatile;

public class TestVolatileDemo2 {
    public static void main(String[] args) {
        VolatileThread02 volatileThread = new VolatileThread02();
        volatileThread.start();

        while (true) {
            if (volatileThread.isFlag()) {
                System.out.println("执行了~~~~");
            }
        }
    }
}
