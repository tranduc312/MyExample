package multithreading.concurrency.managingconcurrentprocesses.forkjoin;

import java.util.Random;
import java.util.concurrent.RecursiveAction;

public class WeightAnimalAction extends RecursiveAction {

    private int start;
    private int end;
    private Double[] weight;

    public WeightAnimalAction(int start, int end, Double[] weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    @Override
    protected void compute() {
        if (end - start <= 3) {
            for (int i = start; i < end; i++) {
                weight[i] = (double) new Random().nextInt(100);
            }
        } else {
            int mid = start + (end - start) / 2;
            System.out.println("WeighAnimalAction{" +
                    "start=" + start +
                    ", end=" + end +
                    '}');
            invokeAll(new WeightAnimalAction(start, mid, weight),
                      new WeightAnimalAction(mid, end, weight));
        }
    }
}
