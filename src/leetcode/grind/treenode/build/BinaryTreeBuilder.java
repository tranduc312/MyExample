package leetcode.grind.treenode.build;

import leetcode.grind.treenode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public final class BinaryTreeBuilder {

    private BinaryTreeBuilder() {};

    public static TreeNode buildBinaryTree(Integer[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("values should be not null");
        }
        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode currentNode = queue.poll();

            // create the left child
            if (values[i] != null) {
                currentNode.left = new TreeNode(values[i]);
                queue.offer(currentNode.left);
                i++;
            }

            // create the right child
            if (i < values.length && values[i] != null) {
                currentNode.right = new TreeNode(values[i]);
                queue.offer(currentNode.right);
            }
            i++;
        }
        return root;
    }
}
