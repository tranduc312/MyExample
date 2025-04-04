package leetcode.medium;

public class FindUniqueBinaryString1980 {

    public static void main(String[] args) {
//        System.out.println(findDifferentBinaryString(new String[]{"01","10"}));
//        System.out.println(findDifferentBinaryString(new String[]{"00","01"}));
//        System.out.println(findDifferentBinaryString(new String[]{"111","011","001"}));
//        System.out.println(findDifferentBinaryString(new String[]{"1"}));
        System.out.println(findDifferentBinaryString(new String[]{"10","11"}));
    }

    static String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; ++i) {
            Character curr = nums[i].charAt(i);
            sb.append(curr == '0' ? '1' : '0');
        }
        return sb.toString();
    }
}
