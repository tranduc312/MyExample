package algorithms.sort;

public class Selection {

    public static void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[indexOfMin]) {
                    indexOfMin = j;
                }
            }
            if (indexOfMin != i) {
                int temp = array[indexOfMin];
                array[indexOfMin] = array[i];
                array[i] = temp;
            }
        }
    }
}
