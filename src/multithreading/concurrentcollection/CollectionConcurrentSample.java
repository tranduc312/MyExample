package multithreading.concurrentcollection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

public class CollectionConcurrentSample {

    private Map<String, String> foodData = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        List list = new ArrayList();
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();


        synchronizedListSample();
    }

    private static void synchronizedListSample() {
        List<Integer> list = Collections.synchronizedList(
                new ArrayList<>(Arrays.asList(4,3,52)));
        synchronized(list) {
            for(int data: list)
                System.out.print(data+" ");
        }
    }

    private static void concurrentHashMapSample() {
        Map<String, Object> foodData = new ConcurrentHashMap<>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for(String key: foodData.keySet())
            foodData.remove(key);
    }

    private static void copyOnWriteArrayListSample() {
        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4,3,52));
        for(Integer item: list) {
            System.out.print(item+" ");
            list.add(9);
        }
        System.out.println();
        System.out.println("Size: "+list.size());
    }

    public void put(String key, String value) {
        foodData.put(key, value);
    }
    public Object get(String key) {
        return foodData.get(key);
    }
}
