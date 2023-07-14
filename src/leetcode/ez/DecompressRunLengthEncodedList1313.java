package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class DecompressRunLengthEncodedList1313 {

    public static void main(String[] args) {
        /*Input: nums = [1,2,3,4]
        Output: [2,4,4,4]*/
        System.out.println(decompressRLElist(new int[]{1,2,3,4}));
    }

    static int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i + 1]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
