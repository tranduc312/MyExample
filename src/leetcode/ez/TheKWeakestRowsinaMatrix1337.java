package leetcode.ez;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class TheKWeakestRowsinaMatrix1337 {

    public static void main(String[] args) {
        kWeakestRows(new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}}, 3);
    }

    static int[] kWeakestRows(int[][] mat, int k) {
        // count each row
        int len = mat.length;
        int[] array = new int[k];
        int index = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] i : mat) {
            int count = 0;
            for (int j : i) {
                if (j == 1) count++;
            }
            map.put(index++, count);
        }
        // sort and add to array temp
        AtomicInteger t = new AtomicInteger();
        map.entrySet().stream().sorted((s1, s2) -> s1.getValue().compareTo(s2.getValue())).forEach(s -> {
            if (t.get() > k - 1) return;
            array[t.getAndIncrement()] = s.getKey();
        });
        // return
        return array;
    }
}
