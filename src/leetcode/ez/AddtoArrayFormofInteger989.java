package leetcode.ez;

import java.util.LinkedList;
import java.util.List;

public class AddtoArrayFormofInteger989 {

    public static void main(String[] args) {
//        num = [1,2,0,0], k = 34
        System.out.println(addToArrayForm(new int[]{1,2,0,0}, 34));
//        System.out.println(addToArrayForm(new int[]{9,9,9,9,9,9,9,9,9,9}, 1));
//        int i = 9999999999;
    }

    static List<Integer> addToArrayForm(int[] num, int k) {

        final LinkedList<Integer> result = new LinkedList<>();
        int len = num.length - 1;

        while(len >= 0 || k != 0){

            if(len >= 0){
                k += num[len--];
            }

            result.addFirst(k % 10);
            k /= 10;
        }

        return result;

    }
}
