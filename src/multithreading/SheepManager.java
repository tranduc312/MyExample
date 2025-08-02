package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {

    private AtomicInteger sheepCount = new AtomicInteger(0);

    private static List<Integer> list = new ArrayList<>();

    private void incrementAndReport() {
//        synchronized (this) {
            System.out.print(sheepCount.incrementAndGet() + " ");;
//        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(20);
            SheepManager sheepManager = new SheepManager();
            for (int i = 0; i < 100; i++) {
                executorService.submit(sheepManager::incrementAndReport);
            }
        } finally {
            if (executorService != null) {
                executorService.shutdown();
//                Set<Integer> set = new HashSet<>();
//                System.out.println(list.stream().filter(n -> !set.add(n)).count());
            }
        }
    }
}
