package algorithms.utlis;

import java.util.concurrent.ThreadLocalRandom;

public final class SortUtility {

    public static int[] genArray(int n) {
        int[] rs = new int[n];
        for (int i = 0; i < n; i++) {
            rs[i] = ThreadLocalRandom.current().nextInt(1, n + 1);
        }
        return rs;
    }

    public static boolean isSorted(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
