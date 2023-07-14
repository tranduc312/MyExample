package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies1431 {

    public static void main(String[] args) {
        /*Input: candies = [2,3,5,1,3], extraCandies = 3
        Output: [true,true,true,false,true]*/
        System.out.println(kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
        System.out.println(kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1));
        System.out.println(kidsWithCandies(new int[]{12, 1, 12}, 10));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> rs = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            if (max < candy) max = candy;
        }
        for (int candy : candies) {
            if (candy + extraCandies >= max) rs.add(true);
            else rs.add(false);
        }
        return rs;
    }

}
