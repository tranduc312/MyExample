package leetcode.ez;

import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class NumberofArithmeticTriplets2367 {

    public static void main(String[] args) {
        System.out.println(arithmeticTriplets(new int[]{0,1,4,6,7,10}, 3));
        System.out.println(arithmeticTriplets(new int[]{4,5,6,7,8,9}, 2));
//        (1, 2, 4)
//        (2, 4, 5)
//        Paths.get();
//                Path.
        Paths.get("/zoo/../home").getParent().normalize().toAbsolutePath();
    }

    static int arithmeticTriplets(int[] nums, int diff) {
        int rs = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i - diff) && set.contains(i - diff * 2))
                rs++;
            set.add(i);
        }
        return rs;
    }
}
