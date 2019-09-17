package TestDemo03;

import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws Exception{
        Class aClass = TestDemo.class;
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)){
                method.invoke(new TestDemo());
            }
        }
    }
}
