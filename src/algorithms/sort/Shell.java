package algorithms.sort;

public class Shell {

    public static void sort(int[] array) {
        int n = array.length;
        for (int gap = n / 2; gap >= 1; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int current = array[i];
                int j = 0;
                for (j = i; j >= gap && current < array[j - gap]; j-= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = current;
            }
        }
    }
}
