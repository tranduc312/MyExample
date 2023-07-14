package leetcode.ez;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortArraybyIncreasingFrequency1636 {

    public static void main(String[] args) {
        Arrays.stream(frequencySort(new int[]{1, 1, 2, 2, 2, 3})).forEach(s -> System.out.print(s));
        System.out.println();
        Arrays.stream(frequencySort(new int[]{2,3,1,3,2})).forEach(s -> System.out.print(s));
        System.out.println();
        Arrays.stream(frequencySort(new int[]{-1,1,-6,4,5,-6,1,4,1})).forEach(s -> System.out.print(s));
    }

    static int[] frequencySort(int[] nums) {
        int[] rs = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return Arrays.stream(nums)
                .boxed()
                .sorted((a,b) -> map.get(a) == map.get(b) ? b - a : map.get(a) - map.get(b))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
