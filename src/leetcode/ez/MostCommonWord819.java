package leetcode.ez;

import java.util.*;
import java.util.stream.Collectors;

public class MostCommonWord819 {

    public static void main(String[] args) {

//        Arrays.stream("Bob hit a ball, the hit BALL flew far after it was hit.".split(" ")).forEach(System.out::println);
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));

//        System.out.println("Bob hit a ball, the hit BALL flew far after it was hit.");
//        Arrays.stream("Bob hit a ball, the hit BALL flew far after it was hit.".replaceAll("[^a-zA-Z0-9]+", " ").split(" "))
//                .forEach(s -> System.out.print(s + "|"));

    }
    static String mostCommonWord1(String paragraph, String[] banned) {

        Set<String> bannedSet = Arrays.stream(banned)
                .collect(Collectors.toSet());

        Map<String,Integer> count = new HashMap<>();

        Arrays.stream(paragraph.replaceAll("[^a-zA-Z0-9]+"," ").split(" "))
                .map(String::toLowerCase)
                // .peek(System.out::println)
                .filter(word -> !bannedSet.contains(word))
                .forEach(word -> count.put(word, count.getOrDefault(word,0)+1) );

        return count.entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse("");
    }

    static String mostCommonWord(String paragraph, String[] banned) {

        // add banned to Set
        Set<String> set = Arrays.stream(banned).collect(Collectors.toSet());
        // map
        Map<String, Integer> map = new HashMap<>();

        Arrays.stream(paragraph.replaceAll("[^a-zA-Z0-9]+"," ").split(" "))
                .map(String::toLowerCase)
                .filter(p -> !set.contains(p))
                .forEach(p -> map.put(p, map.getOrDefault(p, 0) + 1));

        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
//        return map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).orElse("");
    }
}
