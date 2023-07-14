package leetcode.medium;

public class DecodeWays91 {

    public static void main(String[] args) {
//        System.out.println(numDecodings("12"));
//        System.out.println(numDecodings("226"));
//        System.out.println(numDecodings("06"));

//        double priceList = 22740;
        double priceList = 0.0;
        System.out.println(priceList == 0 ? priceList : priceList / 100);
    }

    static int numDecodings(String s) {
        return s.length() == 0 ? 0 : numDecodings(0, s);
    }

    private static int numDecodings(int p, String s) {
        int n = s.length();
        if (p == n) return 1;
        char cur = s.charAt(p);
        if (cur == '0') return 0;
        int rs = numDecodings(p + 1, s);
        if (p < n - 1 && (cur == '1' || cur == '2' && s.charAt(p + 1) < '7'))
            rs += numDecodings(p + 2, s);
        return rs;
    }
}
