package Demo03_Atomic;

public class TestVolatileAtomicThreadDemo {
    public static void main(String[] args) {
        VolatileAtomicThreader02 thread = new VolatileAtomicThreader02();
        for (int i = 0; i < 100; i++) {
            new Thread(thread).start();
        }
    }
}
