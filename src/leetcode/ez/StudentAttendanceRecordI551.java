package leetcode.ez;

public class StudentAttendanceRecordI551 {

    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
        System.out.println(checkRecord("PPALLL"));
        System.out.println(checkRecord("PPALA"));
    }

    static boolean checkRecord(String s) {

        String treeL = "LLL";

        if (s.contains(treeL)) return false;

        return checkDobuleA(s);
    }

    static int countA = 0;
    static boolean checkDobuleA(String s) {

        String A = "A";
        if (s.contains(A)) {
            countA++;
            s = s.replaceFirst(A, "");
            checkDobuleA(s);
            if (countA > 1) return false;

        }
        return true;
    }
}
