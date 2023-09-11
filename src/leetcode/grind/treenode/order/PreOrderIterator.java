package leetcode.grind.treenode.order;

import leetcode.grind.treenode.TreeNode;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * In PreOrder TraverSal, visit the current node first, then the left subtree, and finally the right subtree.
 */
public class PreOrderIterator implements Iterator<TreeNode> {
    // stack;
    private Stack<TreeNode> stack;

    public PreOrderIterator(TreeNode root) {
        stack = new Stack<>();
        if (root != null) {
            stack.push(root);
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public TreeNode next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        TreeNode node = stack.pop();
        if (node.right != null) {
            stack.push(node.right);
        }
        if (node.left != null) {
            stack.push((node.left));
        }
        return node;
    }
}
