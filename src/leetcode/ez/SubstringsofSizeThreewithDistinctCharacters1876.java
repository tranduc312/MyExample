package leetcode.ez;

public class SubstringsofSizeThreewithDistinctCharacters1876 {

    public static void main(String[] args) {
        /*Input: s = "xyzzaz"
        Output: 1
        Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz".
                The only good substring of length 3 is "xyz".*/
//        System.out.println(countGoodSubstrings("xyzzaz"));
        System.out.println(countGoodSubstrings("aababcabc"));
    }

    static int countGoodSubstrings(String s) {
        int rs = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) != s.charAt(i + 1) &&
                    s.charAt(i + 1) != s.charAt(i + 2) &&
                    s.charAt(i) != s.charAt(i + 2)) {
                rs++;
            }
        }

        return rs;
    }
}
