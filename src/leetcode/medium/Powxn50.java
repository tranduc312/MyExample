package leetcode.medium;

public class Powxn50 {

    public static void main(String[] args) {
        /*System.out.println(Math.pow(2, 10));
        System.out.println(Math.pow(2.10000, 3));
        System.out.println(Math.pow(22.00000, 2));*/

        System.out.println(pow(2, 10));
        System.out.println(pow(2.10000, 3));
        System.out.println(pow(22.00000, 2));
    }

    static  double myPow(double x, int n) {
        return 0.0;
    }

    static double pow(double x, int n) {
        if(n == 0)
            return 1;
        if(n<0){
            n = -n;
            x = 1/x;
        }
        return (n%2 == 0) ? pow(x*x, n/2) : x*pow(x*x, n/2);
    }
}
