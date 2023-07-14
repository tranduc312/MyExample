package leetcode.medium.trie;

import java.util.ArrayList;
import java.util.List;

public class Trie {

    private List<String> trie;

    public Trie() {
        if (trie == null) {
            trie = new ArrayList<>();
        }
    }

    public void insert(String word) {
        trie.add(word);
    }

    public boolean search(String word) {
        return trie.contains(word);
    }

    public boolean startsWith(String prefix) {
        for (String s : trie) {
            if (s.startsWith(prefix)) {
                return true;
            }
        }
        return false;
    }
}
