package leetcode.ez;

import java.util.Arrays;
import java.util.List;

public class CheckContains586 {

    final static List<Integer> REQUIRED_LIST = Arrays.asList(5, 6, 8);

    public static void main(String[] args) {
        System.out.println(checkContains586(Arrays.asList(5, 6, 8)));
        System.out.println(checkContains586(Arrays.asList(5, 6, 8, 4)));
        System.out.println(checkContains586(Arrays.asList(5, 6, 3)));
        System.out.println(checkContains586(Arrays.asList(5, 6)));
    }

    /**
     * list required 5, 8, 6
     * > 3 return 0
     * contains 2/3 return 1
     * contains # required return 0
     * @param list
     * @return
     */
    static int checkContains586(List<Integer> list) {
        int result = 1;
        for (int i : list) {
            if (!REQUIRED_LIST.contains(i)) {
                result = 0;
                break;
            }
        }
        return result;
    }
}
