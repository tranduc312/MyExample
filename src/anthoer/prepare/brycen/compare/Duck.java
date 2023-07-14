package anthoer.prepare.brycen.compare;

public class Duck implements Comparable<Duck> {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Duck(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Duck duck) {
        return -this.age.compareTo(duck.age);
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
