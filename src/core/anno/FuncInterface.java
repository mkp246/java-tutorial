package core.anno;

public class FuncInterface {
    public static void main(String[] args) {
        MyCustomInterface myCustomInterface = new MyCustomInterface() {
            @Override
            public int doSomething() {
                return 32;
            }
        };

        @SuppressWarnings("unused")
        MyCustomInterface myCustomInterface1 =() -> (44);
    }

}

@FunctionalInterface
interface MyCustomInterface{
    int doSomething();
}
