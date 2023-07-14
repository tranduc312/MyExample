package leetcode.ez;

public class DIStringMatch942 {

    public static void main(String[] args) {
//        Input: s = "IDID"
//        Output: [0,4,1,3,2]
        diStringMatch("IDID");
//        Input: s = "III"
//        Output: [0,1,2,3]

//        Input: s = "DDI"
//        Output: [3,2,0,1]

    }

    static int[] diStringMatch(String s) {
        int[] rs = new int[s.length() + 1];
        int end = s.length();
        int start = 0;
        int index = 0;
        while (index < s.length()) {
            switch (s.charAt(index)) {
                case 'I':
                    rs[index] = start++;
                    break;
                case 'D':
                    rs[index] = end--;
            }
            ++index;
        }
        rs[rs.length - 1] = start;
        return rs;
    }
}
