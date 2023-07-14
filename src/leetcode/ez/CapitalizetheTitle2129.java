package leetcode.ez;

public class CapitalizetheTitle2129 {

    public static void main(String[] args) {
        /*Input: title = "i lOve leetcode"
        Output: "i Love Leetcode"*/
        System.out.println(capitalizeTitle("capiTalIze tHe titLe"));
        System.out.println(capitalizeTitle("First leTTeR of EACH Word"));
        System.out.println(capitalizeTitle("i lOve leetcode"));
    }

    static String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        String[] array = title.split(" ");
        for (String s : array) {
            if (s.length() <= 2) {
                sb.append(s.toLowerCase());
            } else {
                sb.append(Character.toUpperCase(s.charAt(0)));
                sb.append(s.substring(1).toLowerCase());
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
