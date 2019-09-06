package Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestDemo01 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Hi");
        list.add("World");
        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String a = iterator.next();
            System.out.println(a);
        }
        System.out.println("------------------------------");
        for (String s : list ) {
            System.out.println(s);
        }

    }
}
