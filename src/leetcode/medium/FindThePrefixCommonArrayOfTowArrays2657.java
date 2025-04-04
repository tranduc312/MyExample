package leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindThePrefixCommonArrayOfTowArrays2657 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findThePrefixCommonArray2(new int[]{1, 3, 2, 4}, new int[]{3, 1, 2, 4})));
//        System.out.println(Arrays.toString(findThePrefixCommonArray(new int[]{2,3,1}, new int[]{3,1,2})));
    }

    static int[] findThePrefixCommonArray2(int[] A, int[] B) {
        int n = A.length;
        int[] ans = new int[n];
        int[] arr = new int[n + 1];
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (++arr[A[i]] == 2) max++;
            if (++arr[B[i]] == 2) max++;
            ans[i] = max;
        }
        return ans;
    }



    static int[] findThePrefixCommonArray(int[] A, int[] B) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = A.length;
        int[] ans = new int[len];
        int cur = 0;
        for (int i = 0; i < len; i++) {
            if (A[i] == B[i]) {
                cur++;
            } else {
                if (map.get(A[i]) != null) {
                    cur++;
                }
                if (map.get(B[i]) != null) {
                    cur++;
                }
            }
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            map.put(B[i], map.getOrDefault(B[i], 0) + 1);
            ans[i] = cur;
        }
        return ans;
    }
}
