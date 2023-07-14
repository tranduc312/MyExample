package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class DesignanOrderedStream1656 {


    private String[] array;
    private int n;


    public DesignanOrderedStream1656(int n) {
        array = new String[n];
        n = 0;
    }

    public List<String> insert(int idKey, String value) {
        array[idKey - 1] = value;

        List<String> list = new ArrayList<>();
        while (n < array.length && array[n] != null) {
            list.add(array[n++]);
        }

        return list;
    }
}
