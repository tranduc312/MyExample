package leetcode.ez;

public class NumberofStudentsDoingHomeworkataGivenTime1450 {

    public static void main(String[] args) {
        /*Input: startTime = [1,2,3], endTime = [3,2,7], queryTime = 4
        Output: 1*/
        System.out.println(busyStudent(new int[]{1, 2, 3}, new int[]{3, 2, 7}, 4));
        System.out.println(busyStudent(new int[]{4}, new int[]{4}, 4));
    }

    static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int rs = 0;
        for (int i = 0; i < endTime.length; i++) {
            if (queryTime >= startTime[i] && queryTime <= endTime[i])
                rs++;
        }
        return rs;
    }
}
