package leetcode.ez;

import java.util.*;
import java.util.stream.Collectors;

public class FindAllNumbersDisappearedArray448 {

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(findDisappearedNumbers(new int[]{1,1}));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> rs = new ArrayList<>();

        Set<Integer> setTemp = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        for (int i = 1; i <= nums.length; ++i) {
            if (!setTemp.contains(i))
                rs.add(i);
        }

        return rs;
    }
}
