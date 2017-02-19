package core.anno;


public class Test {
    @MyCustomAnnotation(studentName = "chitta", studentAddress = "VNS, India", books = {"B1","B2"})
    public static void main(String[] args) {
        MyChildClass myChildClass = new MyChildClass();
        myChildClass.anyMethodHere();
    }
}
