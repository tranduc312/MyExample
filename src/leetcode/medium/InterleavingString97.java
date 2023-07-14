package leetcode.medium;

public class InterleavingString97 {

    public static void main(String[] args) {
        /*Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
        Output: true*/
//        System.out.println(isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        System.out.println(isInterleave("aabcc", "dbbca", "aadbbbaccc"));
//        System.out.println(isInterleave("", "", ""));
    }

    static boolean isInterleave(String s1, String s2, String s3) {
        if (s3.contains(s1) || s3. contains(s2)) return false;
        if (s1.isEmpty() && s2.isEmpty() && s3.isEmpty()) return true;
        int[] array = new int[26];
        for (char c : s1.toCharArray()) {
            array[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            array[c - 'a']++;
        }
        for (char c : s3.toCharArray()) {
            array[c - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (array[i] != 0) return false;
        }
        return true;
    }
}
