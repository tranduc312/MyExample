package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class FindAllKDistantIndicesinanArray2200 {

    public static void main(String[] args) {
        System.out.println(findKDistantIndices(new int[]{3,4,9,1,3,9,5},9,1));
        System.out.println(findKDistantIndices(new int[]{2,2,2,2,2},2,2));
    }

    static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> rs = new ArrayList<>();
        List<Integer> ids = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key)
                ids.add(i);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int id : ids) {
                if (Math.abs(i - id) <= k) {
                    rs.add(i);
                    break;
                }
            }
        }
        return rs;
    }
}
