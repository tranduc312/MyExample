package udemy.performance.customer.impl;

import udemy.performance.customer.ReadOnlyCustomer;

public class Customer implements ReadOnlyCustomer {

    private String name;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(Customer customer) {
        this.name = customer.getName();
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected void finalize() {
        System.out.println("this object is being" + name);
    }
}
