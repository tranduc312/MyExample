package udemy.performance.customer;

import udemy.performance.customer.impl.Customer;

public class Main {

    public static void main(String[] args) {
//        Map.copyOf()
        CustomerRecords records = new CustomerRecords();

        records.addCustomer("A");
        records.addCustomer("B");

//        records.getCustomers().clear();
        ReadOnlyCustomer c = records.find("A");
        Customer customer = (Customer) c;
        customer.setName("C");
        System.out.println(customer.getName());
        for (Customer next : records.getCustomers().values()) {
            System.out.println(next);
        }
        System.out.println(records.find("A"));
//
//        for (Customer next : records) {
//            System.out.println(next);
//        }
//
//        Iterator<Customer> it = records.iterator();
//        it.next();
//        it.remove();
//
//        for (Customer next : records) {
//            System.out.println(next);
//        }
    }
}
