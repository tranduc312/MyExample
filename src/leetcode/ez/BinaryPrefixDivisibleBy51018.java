package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleBy51018 {

    public static void main(String[] args) {
//        Input: nums = [0,1,1]
//        Output: [true,false,false]
        System.out.println(prefixesDivBy5(new int[]{0,1,1}));
        System.out.println(prefixesDivBy5(new int[]{1,1,1}));
//        String array = Arrays.toString(Arrays.copyOfRange(new int[]{1,0,1}, 0, 3)).replaceAll("\\[|\\]|,|\\s", "");
//        System.out.println(Integer.parseInt(array, 2));
    }

    static List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> rs = new ArrayList<>();
        int n = 0;
        for(int bit : nums) {
            n = (n * 2 + bit) % 10;
            rs.add(n == 5 || n == 0);
        }
        return rs;
    }
}
