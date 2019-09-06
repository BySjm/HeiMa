package Test;

public class TestDemo04 {

    public <E> void method(E e){

    }
}
class Test04{
    public static void main(String[] args) {
        TestDemo04 test = new TestDemo04();
        test.<String>method("aa");
    }
}
