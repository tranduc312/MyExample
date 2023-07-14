package leetcode.ez;

public class SpecialArrayWithXElementsGreaterThanorEqualX1608 {

    public static void main(String[] args) {
        /*Input: nums = [0,4,3,0,4]
        Output: 3*/
        System.out.println(specialArray(new int[]{3,5}));
        System.out.println(specialArray(new int[]{0,0}));
        System.out.println(specialArray(new int[]{0,4,3,0,4}));
        System.out.println(specialArray(new int[]{3,6,7,7,0}));
    }

    static int specialArray(int[] nums) {
        int rs = 0;
        int min = Integer.MAX_VALUE;
        int len = nums.length;
        int sum = 0;
        for (int i : nums) {
            if (i != 0 && min > i) min = i;
            sum += i;
        }
        if (sum == 0) return -1;
        if (len < min) rs = len;
        else if (len == min) rs = min;
        else rs = -1;
        return rs;
    }
}
