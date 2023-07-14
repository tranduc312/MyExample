package udemy.performance.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put(null, 1);
        map.put("2", null);
        System.out.println(map.size());
        Map<String, Integer> hashtable = new Hashtable<>();
//        hashtable.put(null, 1);
        hashtable.put("2", null);
        System.out.println(hashtable.size());
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        /*System.out.println();
        System.out.println(124 % 16);
        System.out.println("Little Women".hashCode() % 16);
        System.out.println("Little Women".hashCode() >>> 16);*/
    }
}
