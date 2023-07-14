package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayintheGivenOrder1389 {

    public static void main(String[] args) {
        /*Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
        Output: [0,4,1,3,2]*/
        System.out.println(createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1}));
        System.out.println(createTargetArray(new int[]{1, 2, 3, 4, 0}, new int[]{0, 1, 2, 3, 0}));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> rs = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            rs.add(index[i], nums[i]);
        }
        return rs.stream().mapToInt(Integer::intValue).toArray();
    }
}
