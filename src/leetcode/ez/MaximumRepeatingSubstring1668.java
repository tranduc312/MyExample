package leetcode.ez;

public class MaximumRepeatingSubstring1668 {

    public static void main(String[] args) {
        /*Input: sequence = "ababc", word = "ab"
        Output: 2*/
//        String s = "zzababc";
//        String t = "ab";
//        int index = s.indexOf(t);
//        System.out.println(s.substring(0, index) + s.substring(index + t.length()));
//        System.out.println(maxRepeating("ababc","ab"));
//        System.out.println(maxRepeating("ababc","ba"));
//        System.out.println(maxRepeating("ababc","ac"));
        System.out.println(maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba","aaaba"));
    }

    static int maxRepeating(String sequence, String word) {
        int rs = 0;
        String temp = word;
        while (sequence.contains(temp)) {
            rs++;
            temp += word;
        }

        return rs;
    }
}
