package leetcode.ez;

public class ThreeDivisors1952 {

    public static void main(String[] args) {
        System.out.println(isThree(2));
        System.out.println(isThree(4));
    }

    static boolean isThree(int n) {
        int root = (int) Math.sqrt(n);
        if (root * root < n) return false;
        int len = (int) Math.sqrt(root);
        for (int i = 2; i <= len; i++) {
            if (root % i == 0) return false;
        }
        return true;
    }
}
