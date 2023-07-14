package leetcode.ez;

public class AverageSalaryExcludingtheMinimumandMaximumSalary1491 {

    public static void main(String[] args) {
        /*Input: salary = [4000,3000,1000,2000]
        Output: 2500.00000*/
        System.out.println(average(new int[]{4000, 3000, 1000, 2000}));
        System.out.println(average(new int[]{1000, 2000, 3000}));
    }

    static double average(int[] salary) {
        double sum = 0;
        int len = salary.length;
        if (len < 2) return 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            if (min > salary[i]) min = salary[i];
            if (max < salary[i]) max = salary[i];
        }
        for (int i = 0; i < len; i++) {
            if (salary[i] == max || salary[i] == min) continue;
            sum += salary[i];
        }
        return sum/(len - 2);
    }
}
