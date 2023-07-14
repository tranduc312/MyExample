package leetcode.ez;

import java.util.*;

public class RelativeRanks506 {

    public static void main(String[] args) {
        findRelativeRanks(new int[]{5,4,3,2,1});
        Set<List<Integer>> rs = new HashSet<>();

        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
    }

    static String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < score.length; ++i) {
            map.put(score[i], i);
        }
        int count = 1;
        String[] rs = new String[score.length];
        String[] array = {"Gold Medal", "Silver Medal", "Bronze Medal"};

        for (Map.Entry<Integer, Integer> temp: map.entrySet()) {
            rs[temp.getValue()] = count > 3 ? String.valueOf(count) : array[count - 1];
            ++count;
        }
        for (String s : rs)
            System.out.println(s);
        return rs;
    }
}
