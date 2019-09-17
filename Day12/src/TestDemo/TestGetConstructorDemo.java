package TestDemo;

import java.lang.reflect.Constructor;

public class TestGetConstructorDemo {
    public static void main(String[] args) throws Exception {
        //获取Class对象
        Class clazz = Cat.class;
        //获取构造方法
        Constructor con1 = clazz.getConstructor();
        System.out.println(con1);

        Constructor con2 = clazz.getConstructor(int.class, String.class);
        System.out.println(con2);

        Constructor con3 = clazz.getConstructor(int.class);
        System.out.println(con3);

        Constructor con4 = clazz.getDeclaredConstructor(String.class);
        System.out.println(con4);
        System.out.println("============================");

        Object o1 = con1.newInstance();
        System.out.println(o1);

        Object o2 = con2.newInstance(10, "蓝猫");
        System.out.println(o2);

        con4.setAccessible(true);
        Object o4 = con4.newInstance("英短");
        System.out.println(o4);
    }
}
