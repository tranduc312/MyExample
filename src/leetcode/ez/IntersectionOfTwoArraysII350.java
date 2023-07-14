package leetcode.ez;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArraysII350 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = intersect(nums1, nums2);
        for (int i : result)
            System.out.println(i);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : nums2) {
            if (map.getOrDefault(i, 0) != 0) {
                al.add(i);
                map.put(i, map.getOrDefault(i, 1) -1);
            }
        }

        int[] result = new int[al.size()];
        int count = 0;
        for (int i : al) result[count++] = i;

        return result;
    }
}
