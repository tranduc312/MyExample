package leetcode.ez;

public class CheckIfStringIsaPrefixofArray1961 {

    public static void main(String[] args) {
        System.out.println(isPrefixString("iloveleetcode", new String[]{"i","love","leetcode","apples"}));
        System.out.println(isPrefixString("iloveleetcode", new String[]{"apples","i","love","leetcode"}));
        System.out.println(isPrefixString("z", new String[]{"z"}));
    }

    static boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (s.equals(sb.toString())) return true;
        }

        return false;
    }
}
