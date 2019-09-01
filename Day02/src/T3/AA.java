package T3;

public interface AA {
    void showA();
    private void show10(String str){
        for (int i = 0; i < 10; i++) {
            System.out.print(str + "  ");
        }
        System.out.println();
    }
    default void showB10(String str){
        show10(str);
    }
    default void showC10(String str){
        show10(str);
    }
}
