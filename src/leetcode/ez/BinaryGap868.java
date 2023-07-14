package leetcode.ez;

public class BinaryGap868 {

    public static void main(String[] args) {
        System.out.println(binaryGap(22));
//        System.out.println(binaryGap(8));
//        System.out.println(binaryGap(5));
    }

    static int binaryGap(int n) {
        String[] binray = Integer.toBinaryString(n).split("");
        int rs = 0;
        int index = 0;
        for (int i = 0; i < binray.length; i++) {
            if ("1".equals(binray[i])) {
                rs = (i - index) > rs ? (i - index) : rs;
                index = i;
            }
        }
        return rs;
    }
}
