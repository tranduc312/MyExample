package leetcode.ez;

public class DeleteCharacterstoMakeFancyString1957 {

    public static void main(String[] args) {
        System.out.println(makeFancyString("leeetcode"));
        System.out.println(makeFancyString("aaabaaaa"));
        System.out.println(makeFancyString("aab"));
        System.out.println(makeFancyString("abbcccddddeeeee"));
    }

    static String makeFancyString(String s) {
        StringBuilder rs = new StringBuilder();
        for (int i = 0; i < s.length() - 2; i++) {
            if (!(s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2))) {
                rs.append(s.charAt(i));
            }
        }
        rs.append(s.charAt(s.length() - 2));
        rs.append(s.charAt(s.length() - 1));

        return rs.toString();
    }
}
