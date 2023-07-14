package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame682 {

    public static void main(String[] args) {
//        System.out.println(calPoints(new String[] {"5","2","C","D","+"}));
//        System.out.println(calPoints(new String[] {"5","-2","4","C","D","9","+","+"}));
//        System.out.println(calPoints(new String[] {"1","C"}));
        System.out.println(calPoints(new String[] {"-60","D","-36","30","13","C","C","-33","53","79"}));
    }

    static int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < operations.length; ++i) {
            switch (operations[i]) {
                case "+":
                    list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
                    break;
                case "D":
                    list.add(list.get(list.size() - 1) * 2);
                    break;
                case "C":
                    list.remove(list.size() - 1);
                    break;
                default:
                    list.add(Integer.valueOf(operations[i]));
            }

        }
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}
