package leetcode.ez;

public class MaximumNumberofBalloons1189 {


    public static void main(String[] args) {
        /*Input: text = "nlaebolko"
        Output: 1*/
        System.out.println(maxNumberOfBalloons("nlaebolko"));
        /*Input: text = "loonbalxballpoon"
        Output: 2*/
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
    }

    static int maxNumberOfBalloons(String text) {
        int a = 0;
        int b = 0;
        int l = 0;
        int o = 0;
        int n = 0;

        for (char c : text.toCharArray()) {
            switch (c) {
                case 'a':
                    a++;
                    break;
                case 'b':
                    b++;
                    break;
                case 'l':
                    l++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'n':
                    n++;
                    break;
            }
        }

        return Math.min(Math.min(o/2, l/2), Math.min(Math.min(b, a), n));
    }

}
