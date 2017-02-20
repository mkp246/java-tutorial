package core.anno;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Inherited
public @interface CustomAnnotationClass {
    public String author() default "KK";
    public String date();
    public String description();
}
