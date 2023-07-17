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
}
