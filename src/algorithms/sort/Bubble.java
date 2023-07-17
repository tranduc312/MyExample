package algorithms.sort;

public class Bubble {


    public static void sort(int[] array) {
        int n = array.length;;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    public static void sortEffective(int[] array) {
        int n = array.length;
        boolean sorted = Boolean.FALSE;
        for (int i = 0; i < n - 1 && sorted == Boolean.FALSE; i++) {
            sorted = Boolean.TRUE;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sorted = Boolean.FALSE;
                }
            }
        }
    }
}
