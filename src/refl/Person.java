package refl;

public class Person {
    private String name;
    private String salary;
    private String hometown;
    public int age;

    public Person(String name, String salary, String hometown) {
        this.name = name;
        this.salary = salary;
        this.hometown = hometown;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
