package TestDemo;

public interface TestDemo05<E> {
    void method(E e);
}
class A implements TestDemo05<String>{

    @Override
    public void method(String s) {

    }
}
class B <E> implements TestDemo05<E>{

    @Override
    public void method(E e) {

    }
}