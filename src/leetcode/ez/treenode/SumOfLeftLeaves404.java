package leetcode.ez.treenode;

import leetcode.treenode.TreeNode;

public class SumOfLeftLeaves404 {

    public static void main(String[] args) {
//        TreeNode  root = {3,9,20,null,null,15,7};
        TreeNode root = new TreeNode(3, new TreeNode(9, null, null),
                new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));

        System.out.println(sumOfLeftLeaves(root));
    }

    static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        if (root.left != null && root.left.left == null && root.left.right == null)
            return sumOfLeftLeaves(root.right) + root.left.val;

        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
