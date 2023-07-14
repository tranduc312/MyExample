package leetcode.ez;

public class RingsandRods2103 {

    public static void main(String[] args) {
        /*Input: rings = "B0B6G0R6R0R6G9"
        Output: 1*/
        System.out.println(countPoints("B0B6G0R6R0R6G9"));
        System.out.println(countPoints("B0R0G0R9R0B0G0"));
        System.out.println(countPoints("G4"));
    }

    static int countPoints(String rings) {
        if (rings.length() < 6) return 0;
        int rs = 0;
        int[] red = new int[10];
        int[] blue = new int[10];
        int[] green = new int[10];
        for (int i = 0; i < rings.length() - 1; i += 2) {
            int value = rings.charAt(i + 1) - '0';
            char color = rings.charAt(i);
            switch (color) {
                case 'R':
                    red[value]++;
                    break;
                case 'B':
                    blue[value]++;
                    break;
                case 'G':
                    green[value]++;
                    break;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (red[i] > 0 && blue[i] > 0 && green[i] > 0) {
                rs++;
            }
        }
        return rs;
    }
}
