import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {

        final Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        for (int i = 0; i < 10; ++i) {
            queue.offer(i);
        }

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        executorService.execute(() -> queue.forEach(System.out::println));

        executorService.shutdown();

        System.out.println(Math.round(25555/5000));
//        Supplier
    }
}
