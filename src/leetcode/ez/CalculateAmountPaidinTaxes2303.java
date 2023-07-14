package leetcode.ez;

public class CalculateAmountPaidinTaxes2303 {

    public static void main(String[] args) {
//        System.out.println(calculateTax(new int[][]{{3,50},{7,10},{12,25}}, 10));
        System.out.println(calculateTax(new int[][]{{1,0},{4,25},{5,50}}, 2));
//        System.out.println(calculateTax(new int[][]{{2,50}}, 0));
    }

    static double calculateTax(int[][] brackets, int income) {
        if (income == 0) return 0.0;
        double rs = 0.0;
        int[][] array = new int[income > brackets.length ? brackets.length : income][2];
        for (int i = 0; i < array.length; i++) {
            array[i][0] = brackets[i][0];
            array[i][1] = brackets[i][1];
        }
        for (int i = array.length - 1; i >= 0; i--) {
            int value = i > 0 ? array[i][0] - array[i - 1][0] : array[i][0];
            rs += value * (double) array[i][1]/100;
        }
        return rs;
    }
}
