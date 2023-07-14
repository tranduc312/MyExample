package leetcode.ez;

import java.util.Arrays;

public class DesignHashMap706 {

    private int[] array = new int[1000001];

    public DesignHashMap706() {
        Arrays.fill(array, -1);
    }

    public void put(int key, int value) {
        array[key] = value;
    }

    public int get(int key) {
        return array[key];
    }

    public void remove(int key) {
        array[key] = -1;
    }
}
