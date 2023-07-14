package leetcode.ez;

public class SubtracttheProductandSumofDigitsofanInteger1281 {

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
        System.out.println(subtractProductAndSum(4421));
    }

    static int subtractProductAndSum(int n) {
        int sod = 0;
        int pod = 1;
        while (n > 0) {
            pod *= n % 10;
            sod += n % 10;
            n /= 10;
        }

        return pod - sod;
    }
}
