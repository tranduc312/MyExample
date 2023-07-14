package multithreading.concurrency.managingconcurrentprocesses.forkjoin;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Main {

    public static void main(String[] args) {
        recursiveAction();
        recursiveTask();
    }

    private static void recursiveTask() {
        Double[] weights = new Double[10];
        ForkJoinTask<Double> task = new WeightAnimalTask(0, weights.length, weights);
        ForkJoinPool pool = new ForkJoinPool();
        Double sum = pool.invoke(task);
        System.out.println("\nsum: " + sum);
    }

    private static void recursiveAction() {
        Double[] weight = new Double[10];

        ForkJoinTask<?> task = new WeightAnimalAction(0, weight.length, weight);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);

        System.out.println("Weight: ");
        Arrays.stream(weight).forEach(s -> System.out.print(s + " "));
    }
}
