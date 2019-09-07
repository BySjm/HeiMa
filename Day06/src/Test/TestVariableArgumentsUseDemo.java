package Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestVariableArgumentsUseDemo<E> {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "java","php","C#","python","C++");
        System.out.println(list);
    }

}
