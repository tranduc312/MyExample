package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class CountLargestGroup1399 {

    public static void main(String[] args) {
        /*Input: n = 13
        Output: 4
        Explanation: There are 9 groups in total, they are grouped according sum of its digits of numbers from 1 to 13:
        [1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9].
        There are 4 groups with largest size.*/
        System.out.println(countLargestGroup(13));
        System.out.println(countLargestGroup(2));
        System.out.println(countLargestGroup(15));
    }

    static int countLargestGroup(int n) {
        int rs = 0;
        if (n < 3) return n;
        List<List<Integer>> list = new ArrayList<>();
        int length = n;
        for (int i = 1; i < length;) {
            List<Integer> listTemp = new ArrayList<>();
            if (length >= 10) {
                listTemp.add(i++);
                listTemp.add(length--);
            } else {
                listTemp.add(i++);
            }
            list.add(listTemp);
        }
        rs = (int) list.stream().filter(l -> l.size() == 2).count();
        return rs;
    }
}
