package TestDemo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Dog {
    int value();
}
@Dog(100)
class Demo{

}