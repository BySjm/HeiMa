package Demo04_ConcurrentHashMap;

public class MyThread extends Thread{

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            ConcurrentHashMapDemo.map.put(this.getName() + i, this.getName());
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
