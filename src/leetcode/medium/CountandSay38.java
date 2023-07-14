package leetcode.medium;

public class CountandSay38 {

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
        /**
         * 1211
         * say 1211
         * 111221
         * 111221
         */
        System.out.println(countAndSay(5));
//        Map<Character, Integer> map = new LinkedHashMap<>();
//        map.put('1', 1);
//        map.put('2', 1);
//        map.put('0', 1);
//        System.out.println(map);
    }

    static String countAndSay(int n) {
        if (n == 1) return "1";
        String rs = "1";
        for (int i = 1; i < n; i++) {
            rs = say(rs);
        }
        return rs;
    }

    static String say(String n) {
        StringBuilder sb = new StringBuilder();
        char c = n.charAt(0);
        int count = 1;
        for (int i = 1; i < n.length(); i++) {
            if (n.charAt(i) == c) {
                count++;
            } else {
                sb.append(count);
                sb.append(c);
                c = n.charAt(i);
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
}
