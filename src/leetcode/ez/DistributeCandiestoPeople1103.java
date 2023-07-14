package leetcode.ez;

public class DistributeCandiestoPeople1103 {

    public static void main(String[] args) {
        /*Input: candies = 10, num_people = 3
        Output: [5,2,3]*/
        /**
         * 123
         * 523
         */
        System.out.println(distributeCandies(10,3));
    }

    static int[] distributeCandies(int candies, int num_people) {
        int[] rs = new int[num_people];
        int index = 1;
        while (candies > 0) {
            for (int i = 0; i < rs.length; i++) {
                if (candies == 0) break;
                index = candies > index ? index : candies;
                rs[i] += index;
                candies -= index++;
            }
        }

        return rs;
    }
}
