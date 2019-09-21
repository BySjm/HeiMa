package Demo06_CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class TestCyclicBarryDemo {

    public static void main(String[] args) {

        CyclicBarrier cb = new CyclicBarrier(5, new Meeting());

        Person p1 = new Person(cb);
        Person p2 = new Person(cb);
        Person p3 = new Person(cb);
        Person p4 = new Person(cb);
        Person p5 = new Person(cb);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
    }

}
