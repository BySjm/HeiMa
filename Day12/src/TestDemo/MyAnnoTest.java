package TestDemo;

import jdk.jfr.Percentage;

import java.lang.annotation.Target;

@MyAnno
public class MyAnnoTest {
    @MyAnno
    String name;

    @MyAnno
    public MyAnnoTest(@MyAnno String name) {
        this.name = name;
    }

    @MyAnno
    public void method(){
        int age;
        System.out.println("...");
    }

}
