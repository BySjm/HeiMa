package Test;

public class TestDemo03<E> {
    E a;
}
class Test03{
    public static void main(String[] args) {
        TestDemo03<String> test = new TestDemo03<String>();
        test.a = "String";
    }

}