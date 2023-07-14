package leetcode.ez.treenode;

public class MaximumDepthNaryTree559 {

    public static void main(String[] args) {
    }

    static int maxDepth(Node root) {
        if (root == null) return 0;
        int max = 0;
        for (Node n : root.children)
            max = Math.max(max, maxDepth(n));
        return max + 1;
    }
}
