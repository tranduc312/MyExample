package leetcode.ez;

public class GenerateaStringWithCharactersThatHaveOddCounts1374 {

    public static void main(String[] args) {
        /*Input: n = 4
        Output: "pppz"*/
        System.out.println(generateTheString(4));
        System.out.println(generateTheString(2));
        System.out.println(generateTheString(7));
    }

    static String generateTheString(int n) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            if (n % 2 == 0 && i != n - 1) {
                sb.append("a");
            } else {
                sb.append("b");
            }
        }
        return sb.toString();
    }
}
