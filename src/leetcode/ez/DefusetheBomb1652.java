package leetcode.ez;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DefusetheBomb1652 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(decrypt(new int[]{5,7,1,4}, 3)));
        System.out.println(Arrays.toString(decrypt(new int[]{1,2,3,4}, 0)));
        System.out.println(Arrays.toString(decrypt(new int[]{2,4,9,3}, -2)));
    }

    static int[] decrypt(int[] code, int k) {
        List<Integer> list = new ArrayList<>(Arrays.stream(code).boxed().collect(Collectors.toList()));
        Arrays.stream(code).boxed().forEach(s -> {
            list.add(s);
        });
        for (int i = 0; i < code.length; i++) {
            int temp = 0;
            if (k == 0) {
                temp = 0;
            } else if (k < 0) {
                for (int j = code.length + k; j < code.length; j++) {
                    temp += list.get(i + j);
                }
            } else {
                for (int j = 1; j <= k; j++) {
                    temp += list.get(i + j);
                }
            }
            code[i] = temp;
        }

        return code;
    }
}
