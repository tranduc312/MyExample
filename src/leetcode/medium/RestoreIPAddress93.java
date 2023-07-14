package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddress93 {
    static List<String> rs = new ArrayList<>();
    static String str;

    public static void main(String[] args) {
        System.out.println(restoreIpAddresses("25525511135"));
        System.out.println(restoreIpAddresses("0000"));
        System.out.println(restoreIpAddresses("101023"));
    }

    static List<String> restoreIpAddresses(String s) {
        str = s;
        magical("", 0, 0);
        return rs;
    }

    private static void magical(String path, int index, int dots) {
        if (dots > 4) return;
        if (dots == 4 && index >= str.length()) {
            rs.add(path.substring(0, path.length() - 1));
            return;
        }

        for (int length = 1; length <= 3 && index + length <= str.length(); length++) {
            String num = str.substring(index, index + length);
            if (num.charAt(0) == '0' && length != 1) break;
            else if (Integer.parseInt(num) <= 255) {
                magical(path + str.substring(index, index + length) + ".", index + length, dots + 1);
            }
        }
    }
}
