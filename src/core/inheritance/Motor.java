package core.inheritance;

public class Motor extends Component{
    private String motorType;

    public Motor(String id, String producer, String description, String motorType) {
        super(id, producer, description);
        this.motorType = motorType;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "motorType='" + motorType + '\'' +
                '}'+ super.toString();
    }

    public String getMotorType() {
        return motorType;
    }
}
