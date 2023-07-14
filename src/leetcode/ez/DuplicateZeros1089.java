package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class DuplicateZeros1089 {

    public static void main(String[] args) {
        /*Input: arr = [1,0,2,3,0,4,5,0]
        Output: [1,0,0,2,3,0,0,4]*/
        duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
    }

    static void duplicateZeros2(int[] arr) {

    }

    static void duplicateZeros(int[] arr) {
        List<Integer> rs = new ArrayList<>();
        for (int i  = 0; i < arr.length; i++) {
            if (rs.size() < arr.length) {
                rs.add(arr[i]);
                if (arr[i] == 0) {
                    rs.add(0);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rs.get(i);
        }
        System.out.println();
    }
}
