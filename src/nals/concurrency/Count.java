package nals.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class Count {

    private AtomicLong sheepCount = new AtomicLong(0);

    private void incrementAndReport() {
        synchronized (this) {
            System.out.print(sheepCount.incrementAndGet() + " ");
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(10);
            Count count = new Count();
            for (int i = 0; i < 100; i++) {
                executorService.submit(count::incrementAndReport);
            }
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }
}
