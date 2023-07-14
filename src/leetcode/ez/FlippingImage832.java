package leetcode.ez;

public class FlippingImage832 {

    public static void main(String[] args) {
//        [[1,1,0],[1,0,1],[0,0,0]]
//        int[][] data = new int[][]{{1,1,0}, {1,0,1}, {0,0,0}};
                int[][] data = new int[][] {{1}};
        flipAndInvertImage(data);
    }

    static int[][] flipAndInvertImage(int[][] image) {
//        if (image == null || image.length == 0 || image[0].length == 0 || image[1].length == 0) {
//            return image;
//        }
        int[][] rs = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; ++i) {
            // reverse
//            Arrays.stream(ints).forEach(s -> System.out.print(s));
//            System.out.println();
            rs[i] = reverseRow(image[i]);
            // invert
            rs[i] = invertRow(image[i]);

        }
        return rs;
    }

    private static int[] reverseRow(int[] array) {
        for(int i = 0; i < array.length / 2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    private static int[] invertRow(int[] array) {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = array[i] == 1 ? 0 : 1;
        }
        return array;
    }
}
