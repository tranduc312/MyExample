package leetcode.ez;

public class ComplementofBase10Integer1009 {

    public static void main(String[] args) {
        System.out.println(bitwiseComplement(5));
        System.out.println(bitwiseComplement(7));
        System.out.println(bitwiseComplement(10));
    }

    static int bitwiseComplement(int n) {
        String s = Integer.toBinaryString(n);
        String temp = "";
        for (String t : s.split("")) {
            temp += "0".equals(t) ? "1" : "0";
        }

        return Integer.parseInt(temp, 2);
    }
}
