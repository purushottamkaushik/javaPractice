package annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@interface MyAnnotation {

    String param1() default "p1";
    boolean param2() default false;

    int[] param3() default {};

}
