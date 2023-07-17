package algorithms;

import org.apache.commons.lang3.time.StopWatch;

public class Main {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(genArray(10)));
        bubbleSort(SortUtility.genArray(10000));
        bubbleSortEffective(SortUtility.genArray(10000));
    }

    static void bubbleSort(int[] bubbleArray) {
        try {
//            System.out.println("before bubble sort" + Arrays.toString(bubbleArray));
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            Bubble.sort(bubbleArray);
            stopWatch.stop();
//            System.out.println("after bubble sort" + Arrays.toString(bubbleArray));
            System.out.println(String.format("Execution time: %s ms", stopWatch.getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void bubbleSortEffective(int[] bubbleArray) {
        try {
//            System.out.println("before bubble sort effective" + Arrays.toString(bubbleArray));
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            Bubble.sortEffective(bubbleArray);
            stopWatch.stop();
//            System.out.println("after bubble sort effective" + Arrays.toString(bubbleArray));
            System.out.println(String.format("Execution time: %s ms", stopWatch.getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
