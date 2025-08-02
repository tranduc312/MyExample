package multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            throw new RuntimeException("RuntimeException");
        });
        thread.setUncaughtExceptionHandler((t, e) -> System.out.println("A critical error happened in thread: " + t.getName() + " the error is " + e.getMessage()));
        thread.start();
    }

    void parallel() {
        List<Integer> list = new ArrayList<>();
        list.parallelStream();
        Stream<Integer> integerStream = Arrays.asList(1,2,3).stream();
        integerStream.parallel();
        integerStream.isParallel();
    }

    void run() {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
    }
}
