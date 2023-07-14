package leetcode.ez;

public class LatestTimebyReplacingHiddenDigits1736 {

    public static void main(String[] args) {
        /*Input: time = "2?:?0"
        Output: "23:50"*/
//        System.out.println(maximumTime("2?:?0"));
        System.out.println(maximumTime("0?:3?"));
        System.out.println(maximumTime("??:3?"));

//        System.out.println(maximumTime("1?:22"));
//        String s = "?3:22";
//        System.out.println(s.charAt(1) < '4');
//        System.out.println(s.substring(0, s.indexOf("?")) + "2" + s.substring(s.indexOf("?") + 1) );
    }

    static String maximumTime(String time) {
        char[] times = time.toCharArray();
        if (times[0] == '?')
            times[0] = (times[1] < '4' || times[1] == '?') ? '2' : '1';
        if (times[1] == '?')
            times[1] = times[0] == '2' ? '9' : '3';
        if (times[3] == '?')
            times[3] = '5';
        if (times[4] == '?')
            times[4] = '9';
        StringBuilder rs = new StringBuilder();
        for (char c : times) {
            rs.append(c);
        }
        return rs.toString();
    }
}
