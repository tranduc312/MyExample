package leetcode.ez;

public class ReplaceAllstoAvoidConsecutiveRepeatingCharacters1576 {

    public static void main(String[] args) {
        System.out.println(modifyString("?zs"));
        System.out.println(modifyString("ubv?w"));
//        System.out.println("ubv?w".replace("?", "a"));
    }

    static String modifyString(String s) {
        return s.replace("?", findSValid(s));
    }

    static String findSValid(String c) {
        int index = c.indexOf("?");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (ch != c.charAt(index + 1)) {
                return String.valueOf(ch);
            }
        }

        return "z";
    }
}
