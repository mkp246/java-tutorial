package oop;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
        this.age =0;
    }

    public void printPerson() {
        System.out.println( "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}');
    }

    public class Me{
        private int me;
        public void see(){
            name+="me";
        }
    }

    public void becomeOlder(){
        this.age++;
    }

    public boolean isAdult(){
        return !(this.age<18);
    }

    public boolean isOlderThan(Person person){
        return this.age > person.age;
    }
}

