package core.anno;

public class AnnotatedSubClass extends CustomAnnotationClassTest{
    @Override
    public String anotherAnnotatedMethod() {
        return "i am sub class";
    }
}
