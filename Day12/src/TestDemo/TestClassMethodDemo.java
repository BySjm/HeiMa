package TestDemo;

public class TestClassMethodDemo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class clazz = Cat.class;
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        Object instance = clazz.newInstance();
        System.out.println(instance);
    }
}
