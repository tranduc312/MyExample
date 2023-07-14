package leetcode.ez;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoOutofThree2032 {

    public static void main(String[] args) {
        /*Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
        Output: [3,2]*/
        System.out.println(twoOutOfThree(new int[]{1, 1, 3, 2}, new int[]{2, 3}, new int[]{3}));
        System.out.println(twoOutOfThree(new int[]{3,1}, new int[]{2, 3}, new int[]{1,2}));
        System.out.println(twoOutOfThree(new int[]{1,2,2}, new int[]{4,3,3}, new int[]{5}));
    }

    static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> rs = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            if (set1.contains(i)) rs.add(i);
            else set2.add(i);
        }

        for (int i : nums3) {
            if (set1.contains(i) || set2.contains(i))
                rs.add(i);
        }

        return new ArrayList<>(rs);
    }
}
