package TestDemo;

import java.util.LinkedList;

public class TestDemo07 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.push("qwe");
        String pop = linkedList.pop();
        System.out.println(pop);
    }
}
