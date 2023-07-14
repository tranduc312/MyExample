package leetcode.medium;

public class SearchInRotatedSortedArray33 {

    public static void main(String[] args) {
        /*Input: nums = [4,5,6,7,0,1,2], target = 0
        Output: 4*/

        System.out.println(search(new int[]{4,5,6,7,0,0,1,2}, 0));
        System.out.println(search(new int[]{4,5,6,7,0,1,2}, 3));
        System.out.println(search(new int[]{1}, 0));
    }

    static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (target == nums[mid]) return mid;
            if (nums[mid] >= nums[left]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return target == nums[left] ? left : -1;
    }
}
