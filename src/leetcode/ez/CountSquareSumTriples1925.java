package leetcode.ez;

public class CountSquareSumTriples1925 {

    public static void main(String[] args) {
        System.out.println(countTriples(5));
        System.out.println(countTriples(10));
    }

    static int countTriples(int n) {
        int rs = 0;
        for (int i = n; i >= 1; i--) {
            int third = i;
            for (int j = 1; j < i; j++) {
                for (int k = 1; k < i; k++) {
                    if (third * third == j * j + k * k) {
                        rs++;
                    }
                }
            }
        }
        return rs;
    }
}
