package TestDemo;

public @interface Book {
    int price() default 100;
    String name();
    String[] authors();
}
