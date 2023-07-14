package leetcode.ez;

public class FindtheMiddleIndexinArray1991 {

    public static void main(String[] args) {
        /*Input: nums = [2,3,-1,8,4]
        Output: 3*/
        System.out.println(findMiddleIndex(new int[]{2,3,-1,8,4}));
        System.out.println(findMiddleIndex(new int[]{1,-1,4}));
        System.out.println(findMiddleIndex(new int[]{2,5}));
    }

    static int findMiddleIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (sumLeft(nums, i) == sumRight(nums, i))
                return i;
        }
        return -1;
    }

    static int sumLeft(int[] array, int index) {
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += array[i];
        }
        return sum;
    }

    static int sumRight(int[] array, int index) {
        int sum = 0;
        for (int i = index + 1; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
