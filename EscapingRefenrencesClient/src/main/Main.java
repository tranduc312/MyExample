//package main;
//
//import udemy.performance.customer.CustomerRecords;
//import udemy.performance.customer.ReadOnlyCustomer;
//
//public class Main {
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
//
//    public static void main(String[] args) {
//        CustomerRecords records = new CustomerRecords();
//        records.addCustomer("A");
//        records.addCustomer("B");
//
//        for (ReadOnlyCustomer record : records) {
//            System.out.println(record);
//        }
//    }
//}
