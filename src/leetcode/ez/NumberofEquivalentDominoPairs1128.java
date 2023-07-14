package leetcode.ez;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberofEquivalentDominoPairs1128 {

    public static void main(String[] args) {
        /*Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
        Output: 1*/
        System.out.println(numEquivDominoPairs(new int[][]{{1, 2}, {2, 1}, {3, 4}, {5, 6}}));
    }

    static int numEquivDominoPairs(int[][] dominoes) {
        AtomicInteger rs = new AtomicInteger(-1);
        List<List<Integer>> list = new ArrayList<>();
        for (int[] array : dominoes) {
            list.add(IntStream.of(array).boxed().sorted().collect(Collectors.toList()));
        }
        Map<List<Integer>, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
        }
        return 0;
    }
}
