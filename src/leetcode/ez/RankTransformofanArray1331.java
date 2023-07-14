package leetcode.ez;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformofanArray1331 {

    public static void main(String[] args) {
        /*Input: arr = [40,10,20,30]
        Output: [4,1,2,3]*/
        System.out.println(arrayRankTransform(new int[]{40,10,20,30}));
        System.out.println(arrayRankTransform(new int[]{37,12,28,9,100,56,80,5,12}));
    }

    static int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(temp);
        int index = 1;
        for (int i = 0; i < temp.length; i++) {
            if (map.containsKey(temp[i])) {
                map.put(temp[i], map.get(temp[i]));
            } else {
                map.put(temp[i], index++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
