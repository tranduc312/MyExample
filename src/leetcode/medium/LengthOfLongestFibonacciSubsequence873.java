package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestFibonacciSubsequence873 {

    public static void main(String[] args) {
//        System.out.println(lenLongestFibSubseq(new int[]{1,2,3,4,5,6,7,8}));
        System.out.println(lenLongestFibSubseq(new int[]{1,3,7,11,12,14,18}));
    }

    static int lenLongestFibSubseq(int[] arr) {
        int ans = 0;
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int x = arr[i];
                int y = arr[j];
                int len = 2;

                while (set.contains(x + y)) {
                    int temp = y;
                    y = x + y;
                    x = temp;
                    ++len;
                }
                ans = Math.max(ans, len);
            }
        }

        return ans >= 3 ? ans : 0;
    }
}
