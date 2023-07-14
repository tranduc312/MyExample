package leetcode.ez;

public class ReplaceAllDigitswithCharacters1844 {

    public static void main(String[] args) {
        /*Input: s = "a1b2c3d4e"
        Output: "abbdcfdhe"
        Explanation: The digits are replaced as follows:
        - s[1] -> shift('a',1) = 'b'
                - s[3] -> shift('b',2) = 'd'
                - s[5] -> shift('c',3) = 'f'
                - s[7] -> shift('d',4) = 'h'*/
        System.out.println(Character.toString('a' + 1));
        System.out.println(replaceDigits("a1b2c3d4e"));
    }

    static String replaceDigits(String s) {
        StringBuilder rs = new StringBuilder();
        rs.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                rs.append(Character.toString(s.charAt(i - 1) + c - '0'));
            } else {
                rs.append(Character.toString(c + 0));
            }
        }
        return rs.toString();
    }
}
