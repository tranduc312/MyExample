package leetcode.ez;

import java.util.HashMap;
import java.util.Map;

public class FindLuckyIntegerinanArray1394 {

    public static void main(String[] args) {
        /*Input: arr = [2,2,3,4]
        Output: 2*/
        System.out.println(findLuckyBetter(new int[]{2, 2, 3, 4}));
        /*Input: arr = [1,2,2,3,3,3]
        Output: 3*/
        System.out.println(findLuckyBetter(new int[]{1, 2, 2, 3, 3, 3}));
        System.out.println(findLuckyBetter(new int[]{2, 2, 2, 3, 3}));
    }

    static int findLuckyBetter(int[] arr) {
        int[] nums = new int[501];
        for (int i : arr) nums[i]++;
        for (int i = 500; i > 0; i--) {
            if (nums[i] == i) return i;
        }

        return -1;
    }

    static int findLucky(int[] arr) {
        int rs = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() == entry.getValue())
                rs = entry.getKey();
        }
        return rs;
    }
}
