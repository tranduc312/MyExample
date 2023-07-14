package multithreading.concurrency.managingconcurrentprocesses.forkjoin;

import java.util.Random;
import java.util.concurrent.RecursiveTask;

public class WeightAnimalTask extends RecursiveTask<Double> {

    private int start;
    private int end;
    private Double[] weights;

    public WeightAnimalTask(int start, int end, Double[] weights) {
        this.start = start;
        this.end = end;
        this.weights = weights;
    }

    @Override
    protected Double compute() {
        if (end - start <= 3) {
            double sum = 0;
            for (int i = start; i < end; i++) {
                weights[i] = (double) new Random().nextInt(100);
                sum += weights[i];
            }
            return sum;
        } else {
            int mid = start + (end - start) / 2;
            RecursiveTask<Double> otherTask = new WeightAnimalTask(start, mid, weights);
            otherTask.fork();
            return new WeightAnimalTask(mid, end, weights).compute() + otherTask.join();
        }
    }
}
