package leetcode.ez;

public class ThousandSeparator1556 {

    public static void main(String[] args) {
        System.out.println(thousandSeparator(987));
        System.out.println(thousandSeparator(1234));
        System.out.println(thousandSeparator(51040));
        System.out.println(thousandSeparator(123456789));
    }

    static String thousandSeparator(int n) {
        StringBuilder rs = new StringBuilder();
        String s = String.valueOf(n);
        int count = 0;
        if (s.length() < 4) return String.valueOf(n);
        for (int i = s.length() - 1; i >= 0; i--) {
            rs.insert(0, s.charAt(i));
            if (++count % 3 == 0) {
                rs.insert(0, ".");
            }
        }
        if (rs.toString().charAt(0) == '.') rs.deleteCharAt(0);
        return rs.toString();
    }
}
