package leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class InsertInterval57 {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(insert(new int[][]{{1,3},{6,9}}, new int[]{2,5})));
        System.out.println(Arrays.deepToString(insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4,8})));
    }

    static int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] array = Arrays.copyOf(intervals, intervals.length + 1);
        array[intervals.length] = newInterval;
        Arrays.sort(array, Comparator.comparingInt(a -> a[0]));
        LinkedList<int[]> linkedList = new LinkedList<>();
        for (int[] ints : array) {
            if (linkedList.isEmpty() || linkedList.getLast()[1] < ints[0]) {
                linkedList.add(ints);
            } else {
                linkedList.getLast()[1] = Math.max(linkedList.getLast()[1], ints[1]);
            }
        }

        return linkedList.toArray(new int[0][]);
    }
}
