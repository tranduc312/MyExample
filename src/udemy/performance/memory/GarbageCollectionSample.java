package udemy.performance.memory;

import udemy.performance.customer.impl.Customer;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollectionSample {

    public static void main(String[] args) {
        try {
            testGc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void testGc() throws InterruptedException {
        Runtime runtime = Runtime.getRuntime();

        long availableBytes = runtime.freeMemory();
        System.out.println("1: " + availableBytes / 1024 + "k");
        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            customers.add(new Customer("A" + i));
        }

        availableBytes = runtime.freeMemory();
        System.out.println("2: " + availableBytes / 1024 + "k");

        customers = new ArrayList<>();
        availableBytes = runtime.freeMemory();
        System.out.println("3: " + availableBytes / 1024 + "k");

        Thread.sleep(1000);
        availableBytes = runtime.freeMemory();
        System.out.println("4: " + availableBytes / 1024 + "k");

        System.gc();
        availableBytes = runtime.freeMemory();
        System.out.println("5: " + availableBytes / 1024 + "k");
    }
}
