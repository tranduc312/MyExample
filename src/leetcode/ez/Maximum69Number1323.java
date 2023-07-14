package leetcode.ez;

public class Maximum69Number1323 {

    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
    }

    static int maximum69Number (int num) {
        int rs = 0;
        int index = 0;
        String numString = Integer.toString(num);
        boolean hasFirst = false;
        while (index < numString.length()) {
            int firstDigit = Integer.parseInt(numString.substring(index++, index));
            if (firstDigit == 6 && !hasFirst) {
                hasFirst = true;
                rs = rs * 10 + 9;
            } else {
                rs = rs * 10 + firstDigit;
            }
        }
        return rs;
    }
}
