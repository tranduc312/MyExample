package leetcode.medium;

public class RemoveAllOccurrencesOfASubstring1910 {

    public static void main(String[] args) {
        System.out.println(removeOccurrences("daabcbaabcbc", "abc"));
        System.out.println(removeOccurrences("axxxxyyyyb", "xy"));
    }

    static String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        int idx;
        int partLength = part.length();
        while ((idx = sb.indexOf(part)) != -1) {
            sb.delete(idx, idx + partLength);
        }
        return sb.toString();
    }
}
