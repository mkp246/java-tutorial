package core.anno;

@CanBeRepeated("the color is green")
@CanBeRepeated("the color is red")
@CanBeRepeated("the color is blue")
@MyCustomAnnotation(studentName = "kaka", studentAddress = "ind", books = {"cd"})
public class RepeatTest {

}
