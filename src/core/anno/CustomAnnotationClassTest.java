package core.anno;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@CustomAnnotationClass(date = "2012-03-03", description = "anno class")
public class CustomAnnotationClassTest {
    @CustomAnnotationClass(date = "2012-03-03", description = "anno method")
    public static void main(String[] args) {
        Class<CustomAnnotationClassTest> object = CustomAnnotationClassTest.class;
        Annotation[] annotations = object.getAnnotations();
        System.out.println("all class anno");
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        if (object.isAnnotationPresent(CustomAnnotationClass.class)) {
            System.out.println("custom type anno present");
            System.out.println(object.getAnnotation(CustomAnnotationClass.class));
        }

        System.out.println("all method anno");
        for (Method method : object.getDeclaredMethods()) {
            CustomAnnotationClass annotation = method.getAnnotation(CustomAnnotationClass.class);
            System.out.println(annotation);
        }

        System.out.println("anno in sub class via inheritance : " + AnnotatedSubClass.class.isAnnotationPresent(CustomAnnotationClass.class));
        return;
    }

    @CustomAnnotationClass(author = "firend", date = "2012-04-29", description = "anno tests")
    public String anotherAnnotatedMethod() {
        return "bla bla";
    }
}
