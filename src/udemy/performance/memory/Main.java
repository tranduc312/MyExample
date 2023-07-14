package udemy.performance.memory;

import udemy.performance.customer.impl.Customer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {

        /*System.gc();
        Integer i = 76;
        String one = i.toString();
//        System.out.println("i.toString(); " + i.toString().intern());
        String two = "76";
//        System.out.println(one.equals(two));
//        System.out.println(one == two);
        System.out.println(two = "77");

        Object o = new Object();
        o.equals("");
        o.hashCode();
        o.toString();*/
//        testGc1();
//        testGc2();
        int i = 1;
        Integer integer = i;
    }

    static void testGc2() {
        Runtime runtime = Runtime.getRuntime();
        long available = runtime.freeMemory();
        System.out.println("available: " + available);
        List<Double> doubles = new ArrayList<>();
        for (int i = 0; i < 1800000; i++) {
            doubles.add((double) i);
        }

        available = runtime.freeMemory();
        System.out.println("available: " + available);
        changeValue(doubles);
        available = runtime.freeMemory();
        System.out.println("available: " + available);
    }

    static void changeValue(List<Double> d) {
        d.remove(0);
    }
    static void testGc1() {
        Runtime runtime = Runtime.getRuntime();
        long available = runtime.freeMemory();
        System.out.println("available: " + available);
        Customer customer = new Customer("A");

        available = runtime.freeMemory();
        System.out.println("available: " + available);
        changeName(customer);

        available = runtime.freeMemory();
        System.out.println("available: " + available);
    }

    static void changeName(Customer customer) {
        customer.setName("B");
    }
}
