package leetcode.grind;

import leetcode.grind.treenode.TreeNode;
import leetcode.grind.treenode.build.BinaryTreeBuilder;
import leetcode.grind.treenode.order.InOrderIterator;
import leetcode.grind.treenode.order.PreOrderIterator;

import java.util.LinkedList;

public class LowestCommonAncestorOfABinarySearchTree10 {

    public static void main(String[] args) {
        InOrderIterator inOrderIterator;
        PreOrderIterator preOrderIterator;
        /*Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
        Output: 6*/
        TreeNode node = BinaryTreeBuilder.buildBinaryTree(new Integer[]{6,2,8,0,4,7,9,null,null,3,5});
        /*System.out.println(lowestCommonAncestor(node, new TreeNode(2), new TreeNode(8)));
        System.out.println(lowestCommonAncestor(node, new TreeNode(2), new TreeNode(4)));
        System.out.println(lowestCommonAncestor(BinaryTreeBuilder.buildBinaryTree(new Integer[]{2, 1}), new TreeNode(2), new TreeNode(1)));*/

        System.out.println(lowestCommonAncestorBetter(node, new TreeNode(2), new TreeNode(8)));
        System.out.println(lowestCommonAncestorBetter(node, new TreeNode(2), new TreeNode(4)));
        System.out.println(lowestCommonAncestorBetter(BinaryTreeBuilder.buildBinaryTree(new Integer[]{2, 1}), new TreeNode(2), new TreeNode(1)));
    }

    public static TreeNode lowestCommonAncestorBetter(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestorBetter(root.left, p, q);
        } else if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestorBetter(root.left, p, q);
        } else {
            return root;
        }
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        LinkedList<TreeNode> first = getAncestor(root, p, new LinkedList<>());
        LinkedList<TreeNode> second = getAncestor(root, q, new LinkedList<>());

        second.retainAll(first);
        return second.getLast();
    }

    private static LinkedList<TreeNode> getAncestor(TreeNode root, TreeNode target, LinkedList<TreeNode> set) {
        if (root == null) {
            return set;
        }
        set.add(root);
        if (root.val == target.val) {
            return set;
        } else if (root.val > target.val) {
            getAncestor(root.left, target, set);
        } else {
            getAncestor(root.right, target, set);
        }
        return set;
    }
}
