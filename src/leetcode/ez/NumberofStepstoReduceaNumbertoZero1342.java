package leetcode.ez;

public class NumberofStepstoReduceaNumbertoZero1342 {

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(8));
    }

    static int numberOfSteps(int num) {
        int rs = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            rs++;
        }
        return rs;
    }
}
