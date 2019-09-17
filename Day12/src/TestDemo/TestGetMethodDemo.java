package TestDemo;

import java.lang.reflect.Method;

public class TestGetMethodDemo {
    public static void main(String[] args) throws Exception {
        Class cc = Cat.class;
        Method method1 = cc.getMethod("method1", int.class);
        System.out.println(method1);
        Method method2 = cc.getMethod("method2", int.class, String.class);
        System.out.println(method2);
        Method method3 = cc.getDeclaredMethod("method3", String.class);
        System.out.println(method3);
        System.out.println("============================");
        Cat cat = new Cat();
        method1.invoke(cat, 20);
        method2.invoke(cat,5, "宝宝");
        method3.setAccessible(true);
        method3.invoke(cat, "(宝ᴗ宝)");
    }
}
