package core.inheritance;

public class Component {
    private String id;
    private String producer;
    private String description;

    public Component(String id, String producer, String description) {
        this.id = id;
        this.producer = producer;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Component{" +
                "id='" + id + '\'' +
                ", producer='" + producer + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getProducer() {
        return producer;
    }

    public String getDescription() {
        return description;
    }
}
