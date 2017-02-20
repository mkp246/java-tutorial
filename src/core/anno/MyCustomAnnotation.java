package core.anno;

import java.lang.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;

@Documented
@Target({ElementType.TYPE_USE, ElementType.METHOD})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MyCustomAnnotation {
    int studentAge() default 18;

    String studentName();

    String studentAddress();

    String stuStream() default "CSE";

    int count() default 0;

    String[] books();
}
