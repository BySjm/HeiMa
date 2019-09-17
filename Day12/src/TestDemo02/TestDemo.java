package TestDemo02;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) throws Exception{
        Class cc = Demo.class;
        Method method = cc.getMethod("show");
        boolean b = method.isAnnotationPresent(Book.class);
        if (b){
            Book book = method.getAnnotation(Book.class);
            String name = book.name();
            int price = book.price();
            String[] authors = book.authors();
            System.out.println(name);
            System.out.println(price);
            System.out.println(Arrays.toString(authors));
        }else {
            System.out.println("没有该注解");
        }
    }
}
