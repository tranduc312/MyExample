package leetcode.ez;

public class JewelsandStones771 {

    public static void main(String[] args) {
//        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
//        System.out.println(numJewelsInStones1("aA", "aAAbbbb"));
    }

    static int numJewelsInStones1(String jewels, String stones) {
        int num = 0;
        for (int i = 0; i < stones.length(); ++i) {
            if(jewels.indexOf(stones.charAt(i)) != -1) {
                ++num;
            }
        }
        return num;
    }

    static int numJewelsInStones(String jewels, String stones) {
        String[] jArray = jewels.split("");
        String[] sArray = stones.split("");
        int rs = 0;
        for (int i = 0; i < jArray.length; ++i) {
            for (int j = 0; j < sArray.length; ++j) {
                if (jArray[i].equals(sArray[j])) {
                    rs++;
                }
            }
        }
        return rs;
    }
}
