package leetcode.ez;

import java.util.HashSet;
import java.util.Set;

public class NRepeatedElementinSize2NArray961 {

    public static void main(String[] args) {
        System.out.println(repeatedNTimes(new int[]{1,2,3,3}));
        System.out.println(repeatedNTimes(new int[]{2,1,2,5,3,2}));
        System.out.println(repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }

    static int repeatedNTimes(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) return i;
            set.add(i);
        }
        return 0;
    }
}
