package algorithms;

import algorithms.sort.Bubble;
import algorithms.sort.Insertion;
import algorithms.sort.Selection;
import algorithms.sort.Shell;
import algorithms.utlis.SortUtility;
import org.apache.commons.lang3.time.StopWatch;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*bubbleSort(SortUtility.genArray(10000));
        bubbleSortEffective(SortUtility.genArray(10000));*/
//        insertionSort(SortUtility.genArray(10));
        shellSort(SortUtility.genArray(10));
    }

    static void shellSort(int[] shellArray) {
        try {
            System.out.println("before sort" + Arrays.toString(shellArray));
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            Shell.sort(shellArray);
            stopWatch.stop();;
            System.out.println("after sort" + Arrays.toString(shellArray));
            System.out.println("is sort: " + SortUtility.isSorted(shellArray));
            System.out.println(String.format("Execution time: %s ms", stopWatch.getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void insertionSort(int[] insertionArray) {
        try {
            System.out.println("before sort" + Arrays.toString(insertionArray));
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            Insertion.sort(insertionArray);
            stopWatch.stop();;
            System.out.println("after sort" + Arrays.toString(insertionArray));
            System.out.println("is sort: " + SortUtility.isSorted(insertionArray));
            System.out.println(String.format("Execution time: %s ms", stopWatch.getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void selectionSort(int[] selectionArray) {
        try {
            System.out.println("before sort" + Arrays.toString(selectionArray));
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            Selection.sort(selectionArray);
            stopWatch.stop();;
            System.out.println("after sort" + Arrays.toString(selectionArray));
            System.out.println("is sort: " + SortUtility.isSorted(selectionArray));
            System.out.println(String.format("Execution time: %s ms", stopWatch.getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
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
