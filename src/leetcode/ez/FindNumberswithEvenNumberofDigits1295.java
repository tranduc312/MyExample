package leetcode.ez;

public class FindNumberswithEvenNumberofDigits1295 {

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12,345,2,6,7896}));
    }

    static int findNumbers(int[] nums) {
        int rs = 0;
        for (int i : nums) {
            int length = (int) (Math.log10(i) + 1);
            if (length % 2 == 0)
                rs++;
        }
        return rs;
    }
}
