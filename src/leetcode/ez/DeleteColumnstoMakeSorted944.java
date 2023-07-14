package leetcode.ez;

public class DeleteColumnstoMakeSorted944 {
    public static void main(String[] args) {
        System.out.println(minDeletionSize(new String[]{"cba","daf","ghi"}));
        System.out.println(minDeletionSize(new String[]{"a","b"}));
//        ["zyx","wvu","tsr"]
        System.out.println(minDeletionSize(new String[]{"zyx","wvu","tsr"}));
    }

    static int minDeletionSize(String[] strs) {
        int rs = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                   rs++;
                   break;
                }
            }
        }
        return rs;
    }
}
