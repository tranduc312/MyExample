package leetcode.ez;

public class ShuffleString1528 {

    public static void main(String[] args) {
        /*Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
        Output: "leetcode"*/
        System.out.println(restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
        System.out.println(restoreString("abc", new int[]{0,1,2}));
    }

    static String restoreString(String s, int[] indices) {
        StringBuilder rs = new StringBuilder();
        int len = indices.length;
        String[] array = new String[len];
        for (int i = 0; i < len; i++) {
            array[indices[i]] = String.valueOf(s.charAt(i));
        }
        for (String t : array) {
            rs.append(t);
        }
        return rs.toString();
    }
}
