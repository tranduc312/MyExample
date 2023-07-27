package algorithms.sort;

public class Insertion {

    public static void sort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int current = array[i];
            int j = 0;
            for (j = i - 1; j >= 0 && current < array[j]; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = current;
        }
    }
}
