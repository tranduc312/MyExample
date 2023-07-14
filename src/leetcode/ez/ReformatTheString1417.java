package leetcode.ez;

public class ReformatTheString1417 {

    public static void main(String[] args) {
        /*Input: s = "a0b1c2"
        Output: "0a1b2c"*/
        System.out.println(reformat("a0b1c2"));
        System.out.println(reformat("leetcode"));
        System.out.println(reformat("1229857369"));
        System.out.println(reformat("covid2019"));
    }

    static String reformat(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder alph = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        for (String temp : s.split("")) {
            if (isStringInt(temp)) {
                digits.append(temp);
            } else {
                alph.append(temp);
            }
        }
        if (Math.abs(digits.length() - alph.length()) > 1) return "";

        if (digits.length() >= alph.length()) {
            for (int i = 0; i < digits.length(); i++) {
                sb.append(digits.charAt(i));
                if (i < alph.length())
                    sb.append(alph.charAt(i));
            }
        }else{
            for (int i = 0; i < alph.length(); i++) {
                sb.append(alph.charAt(i));
                if (i < digits.length())
                    sb.append(digits.charAt(i));
            }
        }
        return sb.toString();
    }

    static boolean isStringInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
