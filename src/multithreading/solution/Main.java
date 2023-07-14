package multithreading.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;

public class Main {
    static Random r = new Random();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        final int objectsCount = 800;
        final int threads = 4;
        final int objectsPerThread = objectsCount / threads;

        List<String> yourObjects = new ArrayList<>(800);//your 800 objects stored here
        // prepare data
        for (int i = 0; i < 800; ++i) {
            yourObjects.add(String.valueOf(i));
        }


        final CompletionService<Void> completionService =
                new ExecutorCompletionService<>(
                        Executors.newFixedThreadPool(threads));

        for (int from = 0; from < objectsCount; from += objectsPerThread) {
            completionService.submit(new DoItInParallel(yourObjects.subList(from, from += 200)));
        }

        for (int i = 0; i < threads; i++) {
            completionService.take().get();
        }

    }
}
