package efective.serializable;

import java.io.Serializable;

public class Person implements Serializable {

    private final static long serialVersionUID = -7018243104721749168L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
