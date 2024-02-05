package efective.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        setList();
    }

    static void print() {
        new Thread(System.out::println).start();
        ExecutorService exec = Executors.newCachedThreadPool();
//        exec.submit(System.out::println);
    }

    static void setList() {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }
        for (int i = 0; i < 3; i++) {
            set.remove(i);
            Integer integer = Integer.valueOf(i);
            list.remove(integer);
        }
        System.out.println(set + " " + list);
    }
}
