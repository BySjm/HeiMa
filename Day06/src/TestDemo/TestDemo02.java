package TestDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestDemo02 {
    public static void main(String[] args) {

        ArrayList<Dog> list = new ArrayList<>();
        list.add(new Dog("旺财1", 15));
        list.add(new Dog("旺财2", 9));

        Collections.sort(list, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.age - o2.age;
            }
        });

        System.out.println(list);

    }
}
