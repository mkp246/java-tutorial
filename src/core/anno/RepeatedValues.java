package core.anno;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
public @interface RepeatedValues {
    CanBeRepeated[] value();
}
