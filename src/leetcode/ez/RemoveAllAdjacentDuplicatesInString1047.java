package leetcode.ez;

public class RemoveAllAdjacentDuplicatesInString1047 {

    public static void main(String[] args) {
//        Input: s = "abbaca"
//        Output: "ca"
//        System.out.println(removeDuplicates("abbaca"));
        System.out.println(removeDuplicates("aababaab"));
    }

    static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c)
                sb.deleteCharAt(sb.length() - 1);
            else
                sb.append(c);
        }

        return sb.toString();
    }
}
