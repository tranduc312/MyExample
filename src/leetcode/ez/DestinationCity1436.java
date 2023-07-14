package leetcode.ez;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity1436 {

    public static void main(String[] args) {
        List<List<String>> list1 = Arrays.asList(Arrays.asList("London","New York"),
                Arrays.asList("New York","Lima"),
                Arrays.asList("Lima","Sao Paulo"));
        System.out.println(destCity(list1));
        List<List<String>> list2 = Arrays.asList(Arrays.asList("B","C"),
                Arrays.asList("D","B"),
                Arrays.asList("C","A"));
        System.out.println(destCity(list2));
        List<List<String>> list3 = Arrays.asList(Arrays.asList("A","Z"));
        System.out.println(destCity(list3));
    }

    static String destCity(List<List<String>> paths) {
        String rs = "";
        Map<String, Integer> map = new HashMap<>();
        for (List<String> path : paths) {
            for (int i = 0; i < 2; i++) {
                if (i == 1) {
                    map.put(path.get(i), map.getOrDefault(path.get(i), 0));
                } else {
                    map.put(path.get(i), map.getOrDefault(path.get(i), 0) + 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                rs = entry.getKey();
            }
        }
        return rs;
    }
}
