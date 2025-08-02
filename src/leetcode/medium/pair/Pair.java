package leetcode.medium.pair;

public class Pair<T, U> {
    int key;
    int value;

    public Pair(int row, int col) {
        this.key = row;
        this.value = col;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
