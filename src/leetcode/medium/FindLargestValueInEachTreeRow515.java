package leetcode.medium;

import leetcode.treenode.TreeNode;

import java.util.*;

public class FindLargestValueInEachTreeRow515 {


    public static void main(String[] args) {
        System.out.println(largestValues2(new TreeNode(1, new TreeNode(3, new TreeNode(5), new TreeNode(3))
                , new TreeNode(2, null, new TreeNode(9)))));
    }
    static List<Integer> ans;
    static List<Integer> largestValues2(TreeNode root) {
        ans = new ArrayList<>();
        dfs(root, 0);
        return ans;
    }

    static void dfs(TreeNode node, int l) {
        if(node != null) {
            int v = node.val;
            if(l == ans.size()) {
                ans.add(v);
            } else {
                ans.set(l, Math.max(ans.get(l), v));
            }
            dfs(node.left, l + 1);
            dfs(node.right, l + 1);
        }
    }

    static List<Integer> largestValues(TreeNode root) {
        List<Integer> rs = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                max = Math.max(max, node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            rs.add(max);
        }
        return rs;
    }
}
