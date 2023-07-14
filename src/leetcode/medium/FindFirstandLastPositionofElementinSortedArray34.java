package leetcode.medium;

import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray34 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 8)));
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 6)));
        System.out.println(Arrays.toString(searchRange(new int[]{}, 0)));
        System.out.println(Arrays.toString(searchRange(new int[]{1}, 1)));
        System.out.println(Arrays.toString(searchRange(new int[]{2,2}, 2)));
        System.out.println(Arrays.toString(searchRange(new int[]{1,3}, 1)));
        System.out.println(Arrays.toString(searchRange(new int[]{1,4}, 4)));
        System.out.println(Arrays.toString(searchRange(new int[]{3,3,3}, 3)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] rs = new int[2];
        rs[0] = findFirst(nums, target);
        rs[1] = findLast(nums, target);
        return rs;
    }

    static int findFirst(int[] array, int target) {
        int idx = -1;
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            if (array[mid] == target) idx = mid;
        }
        return idx;
    }

    static int findLast(int[] array, int target) {
        int idx = -1;
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (array[mid] == target) idx = mid;
        }
        return idx;
    }
}
