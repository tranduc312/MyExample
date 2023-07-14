package leetcode.medium.trie;

public class Main {

    public static void main(String[] args) {
        /*Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));   // return True
        System.out.println(trie.search("app"));     // return False
        System.out.println(trie.startsWith("app")); // return True

        trie.insert("app");
        System.out.println(trie.search("app"));     // return True*/

        TrieBetter trieBetter = new TrieBetter();
        trieBetter.insert("apple");
        System.out.println(trieBetter.search("apple"));   // return True
        System.out.println(trieBetter.search("app"));     // return False
        System.out.println(trieBetter.startsWith("app")); // return True

        trieBetter.insert("app");
        System.out.println(trieBetter.search("app"));     // return True
    }
}
