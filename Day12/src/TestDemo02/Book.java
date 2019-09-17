package TestDemo02;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Book {
    int price();
    String name();
    String[] authors();
}
