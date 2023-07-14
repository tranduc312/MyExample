package leetcode.ez;

public class ReformatPhoneNumber1694 {

    public static void main(String[] args) {
        /*Input: number = "123 4-567"
        Output: "123-45-67"*/
        System.out.println(reformatNumber("1-23-45 6"));
        System.out.println(reformatNumber("123 4-567"));
        System.out.println(reformatNumber("123 4-5678"));
    }

    static String reformatNumber(String number) {
        StringBuilder num = new StringBuilder();
        for (char c : number.toCharArray()) {
            if (Character.isDigit(c)) {
                num.append(c);
            }
        }
        int lenTemp = num.length();
        if (lenTemp < 4) {
            return num.toString();
        } else if (lenTemp == 4) {
            return num.insert(2, "-").toString();
        } else {
            return num.substring(0, 3) + "-" + reformatNumber(num.substring(3));
        }
    }
}
