package leetcode.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class ConstructStringWithRepeatLimit2182 {

    public static void main(String[] args) {
        System.out.println(repeatLimitedString4("cczazcc", 3));
//        System.out.println(repeatLimitedString4("aababab", 2));
    }

    static String repeatLimitedString4(String s, int repeatLimit) {
        StringBuilder rs = new StringBuilder();
        int[] array = new int[26];
        for (char c : s.toCharArray()) {
            array[c - 'a']++;
        }
        for (int i = 25; i >= 0; i--) {
            int count = 0;
            int curr = 0;
            while (array[i] > 0) {
                if (count == repeatLimit && array[i] > 0) {
                    curr = i;
                    break;
                }
                rs.append((char) ('a' + i));
                array[i]--;
                count++;
            }
        }
        return rs.toString();
    }

    static String repeatLimitedString3(String s, int repeatLimit) {
        StringBuilder rs = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        Queue<Character> queue = new PriorityQueue<>((a, b) -> b - a);
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Character character : map.keySet()) {
            queue.add(character);
        }

        while (!queue.isEmpty()) {
            char c = queue.poll();
            int count = map.get(c);
            for (int i = 1; i <= Math.min(repeatLimit, count); i++) {
                rs.append(c);
                map.put(c, count - i);
            }
            if (map.get(c) > 0 && !queue.isEmpty()) {
                char nextC = queue.poll();
                rs.append(nextC);
                map.put(nextC, map.get(nextC) - 1);
                if (map.get(nextC) > 0) {
                    queue.add(nextC);
                }
                queue.add(c);
            }
        }
        return rs.toString();
    }

    static String repeatLimitedString2(String s, int repeatLimit) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> freq = new HashMap<>();
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> b - a);
        for (char c : s.toCharArray()) freq.put(c, freq.getOrDefault(c, 0) + 1);
        for (char c : freq.keySet()) pq.offer(c);
        while (!pq.isEmpty()) {
            char c = pq.poll();
            int count = freq.get(c);
            for (int i = 1; i <= Math.min(count, repeatLimit); i++) {
                sb.append(c);
                freq.put(c, count - i);
            }
            if (freq.get(c) > 0 && !pq.isEmpty()) {
                char nextC = pq.poll();
                sb.append(nextC);
                freq.put(nextC, freq.get(nextC) - 1);
                if (freq.get(nextC) > 0) pq.offer(nextC);
                pq.offer(c);
            }
        }
        return sb.toString();
    }

    static String repeatLimitedString(String s, int repeatLimit) {
        StringBuilder rs = new StringBuilder();
        StringBuilder rsRedundant = new StringBuilder();
        Queue<String> queue = new PriorityQueue<>((a, b) -> b.compareTo(a));
        for (int i = 0; i < s.length(); i++) {
            queue.add(String.valueOf(s.charAt(i)));
        }
        int count = 0;
        String value = "";
        while (!queue.isEmpty()) {
            if (!queue.peek().equals(value)) {
                count = 0;
            }
            count++;
            if (count > repeatLimit) {
                rsRedundant.append(queue.poll());
                continue;
            }
            value = queue.poll();
            rs.append(value);
        }
        for (int i = 0; i < rsRedundant.length(); i++) {
            rs.append(rsRedundant.charAt(i));
        }
        return rs.toString();
    }
}
