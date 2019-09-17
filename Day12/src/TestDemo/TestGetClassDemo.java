package TestDemo;

public class TestGetClassDemo {
    public static void main(String[] args) throws Exception{
        //获取字节码文件对象
        Class clazz1 = Cat.class;
        System.out.println(clazz1);
        System.out.println("=========================");
        Cat cc = new Cat();
        Class class2 = cc.getClass();
        System.out.println(class2);
        System.out.println("=========================");
        Class clazz3 = Class.forName("TestDemo.Cat");
        System.out.println(clazz3);
        System.out.println("=========================");
        System.out.println(clazz1 == class2);
        System.out.println(clazz3 == class2);
        System.out.println(clazz1 == clazz3);
    }
}
