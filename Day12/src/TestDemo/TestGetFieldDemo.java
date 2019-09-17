package TestDemo;

import java.lang.reflect.Field;

public class TestGetFieldDemo {
    public static void main(String[] args) throws Exception{
        Class cc = Cat.class;
        Field age = cc.getDeclaredField("age");
        System.out.println(age);
//        Field[] fields = cc.getFields();
        age.setAccessible(true);
        Cat c = new Cat();
        age.set(c, 41);
        System.out.println(c);

        Object o = age.get(c);
        System.out.println(o);
    }
}
