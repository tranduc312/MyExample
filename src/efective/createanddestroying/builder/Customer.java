package efective.createanddestroying.builder;

public class Customer {
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary + " USD" +
                '}';
    }

    public Customer(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.salary = builder.salary;
    }

    private Customer() {}

    public static Builder builder() {
        return new Builder();
    }

    private String name;

    private Integer age;

    private Integer salary;

    public static class Builder {

        private String name;

        private Integer age;

        private Integer salary;

        private Builder() {}

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder salary(Integer salary) {
            this.salary = salary;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
