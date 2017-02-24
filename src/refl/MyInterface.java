package refl;

public interface MyInterface {
    public default String greet(){
        System.out.println("hello there");
        return "so cool?right!";
    }
}
