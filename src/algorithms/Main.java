package algorithms;

import org.apache.commons.lang3.time.StopWatch;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(genArray(10)));
        bubbleSort(genArray(100000));
    }

    static int[] genArray(int n) {
        int[] rs = new int[n];
        for (int i = 0; i < n; i++) {
            rs[i] = ThreadLocalRandom.current().nextInt(1, n + 1);
        }
        return rs;
    }

    static void bubbleSort(int[] bubbleArray) {
        try {
            System.out.println("before bubble sort" + Arrays.toString(bubbleArray));
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            Bubble.sort(bubbleArray);
            stopWatch.stop();
            System.out.println("after bubble sort" + Arrays.toString(bubbleArray));
            System.out.println(String.format("Execution time: %s ms", stopWatch.getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
