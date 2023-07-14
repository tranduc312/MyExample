package leetcode.ez;

public class TruncateSentence1816 {

    public static void main(String[] args) {
        /*Input: s = "Hello how are you Contestant", k = 4
        Output: "Hello how are you"*/
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
        System.out.println(truncateSentence("What is the solution to this problem", 4));
        System.out.println(truncateSentence("chopper is not a tanuki", 5));
        System.out.println(truncateSentence("eET YZfz Y VHpNQunwl HQU F gD LOqW snNPzZA Ts av Wbbm h p Sbv BnOSq", 2));
    }

    static String truncateSentence(String s, int k) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (++count == k) {
                    return s.substring(0, i);
                }
            }
        }
        return s;
    }
}
