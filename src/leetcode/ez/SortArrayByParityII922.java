package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class SortArrayByParityII922 {

    public static void main(String[] args) {
//        [4,2,5,7]
        sortArrayByParityII(new int[]{4,2,5,7});
        sortArrayByParityII(new int[]{2,3});
    }

    static int[] sortArrayByParityII(int[] nums) {
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        int[] rs = new int[nums.length];
        for (int i : nums) {
            if (i % 2 ==0) evens.add(i);
            else odds.add(i);
        }
        int countO = 0;
        int countE = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) rs[i] = evens.get(countE++);
            else rs[i] = odds.get(countO++);
        }
        return rs;
    }
}
