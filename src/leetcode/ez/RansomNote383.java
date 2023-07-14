package leetcode.ez;

public class RansomNote383 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }

    static boolean canConstruct(String ransomNote, String magazine) {
        char[] ch = ransomNote.toCharArray();
        for (char c : ch) {
            int i = magazine.indexOf(c);
            if (i == -1) return false;
            magazine = magazine.substring(0, i) + magazine.substring(i + 1);
        }
        return true;
    }
}
