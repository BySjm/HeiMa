package TestDemo03;

public class TestDemo {

    @MyTest
    public void method1(){
        System.out.println("method1执行了");
    }

    public void method2(){
        System.out.println("method2执行了");
    }

    @MyTest
    public void method3(){
        System.out.println("method3执行了");
    }

}
