package leetcode.ez;

public class SumofDigitsofStringAfterConvert1945 {

    public static void main(String[] args) {

        System.out.println(getLucky("iiii", 1));
        System.out.println(getLucky("leetcode", 2));
        System.out.println(getLucky("zbax", 2));
    }

    static int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c - 'a' + 1);
        }
        for (int i = 0; i < k; i++) {
            int value = 0;
            for (int j = 0; j < sb.length(); j++) {
                value += sb.charAt(j) - '0';
            }
            sb = new StringBuilder(String.valueOf(value));
        }
        return Integer.parseInt(sb.toString());
    }
}
