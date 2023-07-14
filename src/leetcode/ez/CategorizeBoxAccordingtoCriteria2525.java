package leetcode.ez;

public class CategorizeBoxAccordingtoCriteria2525 {

    public static void main(String[] args) {
        System.out.println(categorizeBox(1000, 35, 700, 300));
        System.out.println(categorizeBox(200, 50, 800, 50));
        System.out.println(categorizeBox(2593, 6432, 46, 412));
    }

    static String categorizeBox(int length, int width, int height, int mass) {
        boolean isBulky = false;
        boolean isHeavy = false;

        int volume = length * width * height;
        int dimension = dimensions(length, width, height);
        if (dimension >= 10000 || volume >= 1000000000) {
            isBulky = true;
        }
        if (mass >= 100) isHeavy = true;
        if (isBulky && isHeavy) return "Both";
        else if (!isBulky && !isHeavy) return "Neither";
        else if (isBulky && !isHeavy) return "Bulky";
        else if (!isBulky && isHeavy) return "Heavy";

        return "";
    }

    static int dimensions(int length, int width, int height) {
        int girth = 2 * width + 2 * height;
        return length + girth;
    }
}
