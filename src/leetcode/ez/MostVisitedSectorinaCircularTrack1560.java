package leetcode.ez;

import java.util.*;

public class MostVisitedSectorinaCircularTrack1560 {
    public static void main(String[] args) {
        System.out.println(mostVisited(4, new int[]{1,3,1,2}));
        System.out.println(mostVisited(2, new int[]{2,1,2,1,2,1,2,1,2}));
        System.out.println(mostVisited(7, new int[]{1,3,5,7}));
    }

    static List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> rs = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < rounds.length - 1; i++) {
            if (rounds[i] < rounds[i + 1]) {
                for (int j = rounds[i]; j <= rounds[i + 1]; j++) {
                    map.put(j, map.getOrDefault(j, 0) + 1);
                }
            } else {
                for (int k = 1; k <= rounds[i + 1]; k++) {
                    map.put(k, map.getOrDefault(k, 0) + 1);
                }
                for (int l = rounds[i]; l <= n; l++) {
                    map.put(l, map.getOrDefault(l, 0) + 1);
                }
            }
        }
        int max = Collections.max(map.values());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max)
                rs.add(entry.getKey());
        }
        return rs;
    }
}
