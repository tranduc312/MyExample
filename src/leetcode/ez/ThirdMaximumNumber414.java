package leetcode.ez;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber414 {

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1,2}));
        System.out.println(thirdMax(new int[]{2,2,3,1}));
        System.out.println(thirdMax(new int[]{1,2,2}));
    }

    static int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums)
            set.add(i);
        if (set.size() >= 3) {
            set.remove(Collections.max(set));
            set.remove(Collections.max(set));
        }
        return Collections.max(set);
    }
}
