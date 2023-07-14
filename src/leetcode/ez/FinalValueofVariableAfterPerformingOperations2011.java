package leetcode.ez;

public class FinalValueofVariableAfterPerformingOperations2011 {

    public static void main(String[] args) {
        /*Input: operations = ["--X","X++","X++"]
        Output: 1*/
        System.out.println(finalValueAfterOperations(new String[]{"--X","X++","X++"}));
        System.out.println(finalValueAfterOperations(new String[]{"++X","++X","X++"}));
        System.out.println(finalValueAfterOperations(new String[]{"X++","++X","--X","X--"}));
    }

    static int finalValueAfterOperationsBetter(String[] operations) {
        StringBuilder rs = new StringBuilder(String.valueOf(operations));
        return 0;
    }

    static int finalValueAfterOperations(String[] operations) {
        int rs = 0;
        for (String s : operations) {
            if (s.charAt(1) == '+')
                rs++;
            else rs--;
        }
        return rs;
    }
}
