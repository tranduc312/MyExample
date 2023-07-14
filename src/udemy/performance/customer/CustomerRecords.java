package udemy.performance.customer;

import udemy.performance.customer.impl.Customer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> {

    private Map<String, Customer> records;

    public CustomerRecords() {
        this.records = new HashMap<>();
    }


    public Map<String, Customer> getCustomers() {
        return Map.copyOf(this.records); // use in >= java 10
//        return Collections.unmodifiableMap(this.records); // use in <= java 8
//        return this.records;
    }

    public void addCustomer(final String name) {
        this.records.put(name, new Customer(name));
    }

    public Customer find(final String name) {
        return new Customer(this.records.get(name));
    }

    @Override
    public Iterator<Customer> iterator() {
        return this.records.values().iterator();
    }
}
