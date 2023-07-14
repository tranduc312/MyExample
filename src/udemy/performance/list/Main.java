package udemy.performance.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        testPerformanceAdd();
    }

    static void testPerformanceAdd() {
        long n = 100000;
        List<Phone> phoneArrayList = new ArrayList<>((int) n);

        long startTime = System.currentTimeMillis();
        LinkedList<Phone> phoneLinkedList = new LinkedList<>();
        for (long i = 0; i < n; i++) {
            phoneLinkedList.add(Phone.builder().id(i).name("name" + i).build());
        }
//        System.out.println("total time for add 10 million phone by LinkedList: " + (System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        for (long i = 0; i < n; i++) {
            phoneArrayList.add(Phone.builder().id(i).name("name" + i).build());
        }
//        System.out.println("total time for add 10 million phone by ArrayList: " + (System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        for (long i = 0; i < n/100; i++) {
            int v = ThreadLocalRandom.current().nextInt(0, (int) (n + 1));
            phoneArrayList.remove(v);
        }
        System.out.println("total time for delete 10 million phone by ArrayList: " + (System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        for (long i = 0; i < n; i++) {
            int v = ThreadLocalRandom.current().nextInt(0, (int) (n + 1));
            phoneLinkedList.remove(v);
        }
        System.out.println("total time for delete 10 million phone by LinkedList: " + (System.currentTimeMillis() - startTime));
    }
}
