package leetcode.grind.treenode;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return treeToString(this);
    }

    private String treeToString(TreeNode node) {
        if (node == null) return "null";
        String leftStr = treeToString(node.left);
        String rightStr = treeToString(node.right);

        return "(" + node.val + "," + leftStr + "," + rightStr + ")";
    }
}
