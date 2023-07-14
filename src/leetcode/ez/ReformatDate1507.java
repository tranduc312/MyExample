package leetcode.ez;

import java.util.HashMap;
import java.util.Map;

public class ReformatDate1507 {

    private static Map<String, String> map = new HashMap<>();
    static String[] month1 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    static String[] month2 = new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
    static {
        for (int i = 0; i < month1.length; i++) {
            map.put(month1[i], month2[i]);
        }
    }


    public static void main(String[] args) {
        /*Input: date = "20th Oct 2052"
        Output: "2052-10-20"*/
        System.out.println(reformatDate("20th Oct 2052"));
        System.out.println(reformatDate("6th Jun 1933"));
        System.out.println(reformatDate("26th May 1960"));
    }

    static String reformatDate(String date) {
        String[] array = date.split(" ");
        StringBuilder rs = new StringBuilder();
        rs.append(array[2]).append("-");
        rs.append(map.get(array[1])).append("-");
        rs.append(array[0].length() == 3 ? ("0" + array[0].substring(0, 1)) : (array[0].substring(0, 2)));
        return rs.toString();
    }
}
