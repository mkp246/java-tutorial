package core.anno;

public class MyChildClass extends MyParentClass {

    @Override
    public void justAMethod() {
        System.out.println("Child class method");
    }

    @Deprecated
    public void anyMethodHere(){
        System.out.println("deprecated method");
    }
}
