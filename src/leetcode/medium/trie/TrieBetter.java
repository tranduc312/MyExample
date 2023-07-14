package leetcode.medium.trie;

public class TrieBetter {
    Node root;

    public TrieBetter() {
        root = new Node();
    }

    public void insert(String word) {
        root.insert(word, 0);
    }

    public boolean search(String word) {
        return root.search(word, 0);
    }

    public boolean startsWith(String prefix) {
        return root.startsWith(prefix, 0);
    }

    class Node {
        Node[] nodes;
        boolean isEnd;

        Node() {
            nodes = new Node[26];
        }

        public void insert(String word, int id) {
            if (id >= word.length()) return;
            int i = word.charAt(id) - 'a';
            if (nodes[i] == null) {
                nodes[i] = new Node();
            }
            if (id == word.length() - 1)
                nodes[i].isEnd = true;
                nodes[i].insert(word, id + 1);
        }

        public boolean search(String word, int i) {
            if (i >= word.length()) return false;
            Node node = nodes[word.charAt(i) - 'a'];
            if (node == null) return false;
            if (i == word.length() - 1 && node.isEnd) return true;
            return node.search(word, i + 1);
        }

        public boolean startsWith(String prefix, int i) {
            if (i >= prefix.length()) return false;
            Node node = nodes[i];
            if (node == null) return false;
            if (i == prefix.length() - 1) return true;
            return node.startsWith(prefix, i + 1);
        }
    }
}
