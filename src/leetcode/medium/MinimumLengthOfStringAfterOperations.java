package leetcode.medium;

import java.util.Hashtable;
import java.util.Map;

public class MinimumLengthOfStringAfterOperations {

    public static void main(String[] args) {
        System.out.println(minimumLength2("abaacbcbb"));
//        System.out.println(minimumLength("lyqkwhyy"));
        System.out.println(minimumLength2("ucvbutgkohgbcobqeyqwppbxqoynxeuuzouyvmydfhrprdbuzwqebwuiejoxsxdhbmuaiscalnteocghnlisxxawxgcjloevrdcj"));
    }

    static int minimumLength2(String s) {
        int len = s.length();
        if (len < 3) return len;
        int[] array = new int[26];
        for (char c : s.toCharArray()) {
            array[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (array[i] >= 3) {
                if (array[i] % 2 != 0) {
                    len -= array[i] - 1;
                } else {
                    len -= array[i] - 2;
                }
            }
        }
        return len;
    }

    static int minimumLength(String s) {
        int len = s.length();
        if (len < 3) return len;
        Map<Character, Integer> map = new Hashtable<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value >= 3) {
                int minus = 0;
                if (value % 2 != 0) {
                    minus = value - 1;
                    len -= minus;
                } else {
                    minus = value - 2;
                    len -= minus;
                }
            }
        }
        return len;
    }
}
