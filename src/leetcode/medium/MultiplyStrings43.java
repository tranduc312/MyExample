package leetcode.medium;

public class MultiplyStrings43 {

    public static void main(String[] args) {
        /*Input: num1 = "2", num2 = "3"
        Output: "6"*/
//        System.out.println(multiply("2", "3"));
        /*Input: num1 = "123", num2 = "456"

        Output: "56088"*/
        System.out.println(multiply("123", "456"));
    }

    static String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] array = new int[n + m];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = mul + array[p2];

                array[p1] += sum / 10;
                array[p2] = sum % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : array) {
//            if (!(sb.length() == 0 && i == 0))
                sb.append(i);
        }
        return sb.toString();
    }
}
