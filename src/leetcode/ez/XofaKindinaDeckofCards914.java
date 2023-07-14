package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class XofaKindinaDeckofCards914 {

    public static void main(String[] args) {
        System.out.println(hasGroupsSizeX(new int[]{1,2,3,4,4,3,2,1}));
        System.out.println(hasGroupsSizeX(new int[]{1,1,1,2,2,2,3,3}));
        System.out.println(hasGroupsSizeX(new int[]{1,1,2,2,2,2}));
    }

    static boolean hasGroupsSizeX(int[] deck) {
        int N = deck.length;
        int[] count = new int[10000];
        for (int c: deck)
            count[c]++;

        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < 10000; ++i)
            if (count[i] > 0)
                values.add(count[i]);

        a: for (int X = 2; X <= N; ++X)
            if (N % X == 0) {
                for (int v: values)
                    if (v % X != 0)
                        continue a;
                return true;
            }

        return false;
    }
}
