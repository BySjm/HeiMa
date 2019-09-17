package TestDemo;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE,ElementType.TYPE,ElementType.METHOD,ElementType.CONSTRUCTOR,ElementType.FIELD,ElementType.PARAMETER})
public @interface MyAnno {
}
