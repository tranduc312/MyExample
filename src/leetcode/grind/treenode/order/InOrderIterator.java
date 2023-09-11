package leetcode.grind.treenode.order;

import leetcode.grind.treenode.TreeNode;

import java.util.Iterator;
import java.util.Stack;

/**
 * In InOrder traversal, visit the left subtree, then the current node, and finally the right subtree.
 */
public class InOrderIterator implements Iterator<TreeNode> {
    private TreeNode current;
    private Stack<TreeNode> stack;
    // current
    // stack

    // constructor for current & stack

    public InOrderIterator(TreeNode root) {
        this.current = root;
        this.stack = new Stack<>();
    }

    // ===========
    // IMPLEMENT
    // ===========
    // hasNext()
    @Override
    public boolean hasNext() {
        return !stack.isEmpty() || current != null;
    }

    //
    // next()
    @Override
    public TreeNode next() {
        while (current != null) {
            stack.push(current);
            current = current.left;
        }
        TreeNode node = stack.pop();
        current = node.right;
        return node;
    }
}
