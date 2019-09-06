package Test;

import java.util.ArrayList;

public abstract class TestDemo02<E> {
    public abstract void method(E e);
}
class Test02{
    public static void main(String[] args) {
        TestDemo02<String> test = new TestDemo02<String>() {
            @Override
            public void method(String s) {

            }
        };
    }
}