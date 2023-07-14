package leetcode.ez;

public class NumberofStudentsUnabletoEatLunch1700 {

    public static void main(String[] args) {
        System.out.println(countStudents(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0, 1}));
        System.out.println(countStudents(new int[]{1, 1, 1, 0, 0, 1}, new int[]{1, 0, 0, 0, 1, 1}));
    }

    static int countStudents(int[] students, int[] sandwiches) {
        StringBuilder student = new StringBuilder();
        StringBuilder sw = new StringBuilder();
        for (int s : students) {
            student.append(s);
        }
        for (int sandwich : sandwiches) {
            sw.append(sandwich);
        }
        int count = 0;
        while (count != student.length()){
            if (student.length() == sw.length() && student.charAt(0) == sw.charAt(0)) {
                student.deleteCharAt(0);
                sw.deleteCharAt(0);
                count = 0;
            } else {
                String studentFirst = String.valueOf(student.charAt(0));
                student.deleteCharAt(0);
                student.insert(student.length(),studentFirst);
                count++;
            }
        }
        return count;
    }
}
