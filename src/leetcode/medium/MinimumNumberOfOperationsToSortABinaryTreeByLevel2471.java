package leetcode.medium;

import leetcode.treenode.TreeNode;

import java.util.*;

public class MinimumNumberOfOperationsToSortABinaryTreeByLevel2471 {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1, new TreeNode(4, new TreeNode(7), new TreeNode(6)), new TreeNode(3, new TreeNode(8, new TreeNode(9), null), new TreeNode(5, new TreeNode(10), null)));
        System.out.println(minimumOperations(treeNode1));
    }

    static int minimumOperations(TreeNode root) {
        int rs = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int[] levelValues = new int[levelSize];

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                levelValues[i] = node.val;

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            rs += getMinSwaps(levelValues);
        }
        return rs;
    }

    static int getMinSwaps(int[] original) {
        int swaps = 0;
        int[] target = original.clone();
        Arrays.sort(target);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < original.length; i++) {
            map.put(original[i], i);
        }

        for (int i = 0; i < original.length; i++) {
            if (original[i] != target[i]) {
                swaps++;

                int cur = map.get(target[i]);
                map.put(original[i], cur);
                original[cur] = original[i];
            }
        }
        return swaps;
    }
}
