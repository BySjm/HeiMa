package T2;

public interface A {
    void showA();
    default void showB(){
        System.out.println("BBBB");
    }
}
