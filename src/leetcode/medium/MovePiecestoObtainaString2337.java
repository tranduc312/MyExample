package leetcode.medium;

public class MovePiecestoObtainaString2337 {

    public static void main(String[] args) {
        System.out.println(canChange2("_L__R__R_", "L______RR")); // true
        System.out.println(canChange2("R_L_", "__LR")); // false
        System.out.println(canChange2("_R", "R_")); // false
        System.out.println(canChange2("_LL__R__R_", "L___L___RR")); // false
    }

    /**
     * Example 1:
     *
     * Input: start = "_L__R__R_", target = "L______RR"
     * Output: true
     * Explanation: We can obtain the string target from start by doing the following moves:
     * - Move the first piece one step to the left, start becomes equal to "L___R__R_".
     * - Move the last piece one step to the right, start becomes equal to "L___R___R".
     * - Move the second piece three steps to the right, start becomes equal to "L______RR".
     * Since it is possible to get the string target from start, we return true.
     * Example 2:
     *
     * Input: start = "R_L_", target = "__LR"
     * Output: false
     * Explanation: The 'R' piece in the string start can move one step to the right to obtain "_RL_".
     * After that, no pieces can move anymore, so it is impossible to obtain the string target from start.
     * Example 3:
     *
     * Input: start = "_R", target = "R_"
     * Output: false
     * Explanation: The piece in the string start can move only to the right, so it is impossible to obtain the string target from start.
     *
     * start =
     * "_LL__R__R_"
     * target =
     * "L___L___RR"
     *
     * Use Testcase
     * Output
     * true
     * Expected
     * false
     * @param start
     * @param target
     * @return
     */
    static boolean canChange(String start, String target) {
        String right = "R";
        String left = "L";
        String underScore = "_";
        int n = start.length();
        int lastL = start.lastIndexOf(left);
        int firstR = start.indexOf(right);
        // check some case invalid
        // only _
        if (start.indexOf(left) == -1 && start.indexOf(right) == -1) return true;
        int leftMaxIndex = -1;
        int rightMinIndex = n;
        int spaceForLeft = 0;
        int spaceForRight = 0;
        for (int i = 0; i < n; i++) {
            String value = String.valueOf(start.charAt(i));
            if (value.equals(underScore)) {
                if (lastL != -1 && lastL > i) {
                    spaceForLeft++;
                } else if (firstR != -1 && firstR < i) {
                    spaceForRight++;
                }
            }
            if (left.equals(value)) {
                spaceForLeft--;
                if (i > leftMaxIndex) {
                    leftMaxIndex = i;
                }
            }
            if (right.equals(value)) {
                spaceForRight--;
                if (i < rightMinIndex) {
                    rightMinIndex = i;
                }
            }
        }
        // only L
        if (leftMaxIndex == -1 && rightMinIndex == n -1) return false;
        // only R
        if (leftMaxIndex == 0 && rightMinIndex == n) return false;
        if (spaceForLeft < 0 || spaceForRight < 0) return false;
        return leftMaxIndex < rightMinIndex;
    }

    static boolean canChange2(String start, String target) {
        if (start.equals(target)) {
            return true;
        }
        int waitL = 0;
        int waitR = 0;

        for (int i = 0; i < start.length(); i++) {
            char curr = start.charAt(i);
            char goal = target.charAt(i);

            if (curr == 'R') {
                if (waitL > 0) {
                    return false;
                }
                waitR++;
            }
            if (goal == 'L') {
                if (waitR > 0) {
                    return false;
                }
                waitL++;
            }
            if (goal == 'R') {
                if (waitR == 0) {
                    return false;
                }
                waitR--;
            }
            if (curr == 'L') {
                if (waitL == 0) {
                    return false;
                }
                waitL--;
            }
        }

        return waitL == 0 && waitR == 0;
    }
}
