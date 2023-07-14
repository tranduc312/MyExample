package leetcode.ez;

public class NumberofGoodPairs1512 {

    public static void main(String[] args) {
        /*Input: nums = [1,2,3,1,1,3]
        Output: 4*/
        System.out.println(numIdenticalPairsBetter(new int[]{1, 2, 3, 1, 1, 3}));
//        System.out.println(numIdenticalPairs(new int[]{1,1,1,1}));
//        System.out.println(numIdenticalPairs(new int[]{1, 2, 3}));
    }

    static int numIdenticalPairsBetter(int[] nums) {

        int ans = 0;
        int[] count = new int[101];

        for(int n: nums)
            count[n]++;

        for(int n: count)
            ans += (n * (n - 1))/2;

        return ans;
    }

    static int numIdenticalPairs(int[] nums) {
        int rs = 0;
        for (int i = 0; i < nums.length; i++) {
            rs += countGoodPair(nums, i);
        }
        return rs;
    }

    static int countGoodPair(int[] array, int index) {
        int rs = 0;
        for (int i = index + 1; i < array.length; i++) {
            if (array[i] == array[index]) {
                rs++;
            }
        }
        return rs;
    }
}
