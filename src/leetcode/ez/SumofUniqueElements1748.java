package leetcode.ez;

public class SumofUniqueElements1748 {

    public static void main(String[] args) {
        System.out.println(sumOfUnique(new int[]{1,2,3,2}));
        System.out.println(sumOfUnique(new int[]{1,1,1,1,1}));
        System.out.println(sumOfUnique(new int[]{1,2,3,4,5}));
    }

    static int sumOfUnique(int[] nums) {
        int rs = 0;
        int[] array = new int[101];
        for (int i : nums) {
            array[i]++;
        }
        for (int i : nums) {
            if (array[i] == 1) rs += i;
        }

        return rs;
    }
}
