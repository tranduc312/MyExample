package leetcode.ez;

public class BinaryNumberwithAlternatingBits693 {

    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(5));
        System.out.println(hasAlternatingBits(7));
        System.out.println(hasAlternatingBits(11));
    }

    static boolean hasAlternatingBits(int n) {
        String[] array = Integer.toBinaryString(n).split("");
        for (int i = 0; i < array.length - 1;) {
            if (array[i++].equals(array[i])) {
                return false;
            }
        }
        return true;
    }
}
