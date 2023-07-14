package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class SortArrayByParity905 {

    public static void main(String[] args) {
//        [3,1,2,4]
        sortArrayByParity(new int[]{3,1,2,4});
    }

    static int[] sortArrayByParity(int[] nums) {
        List<Integer> rs = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                rs.add(0, nums[i]);
            } else {
                rs.add(nums[i]);
            }
        }

        return rs.stream().mapToInt(Integer::intValue).toArray();
    }
}
