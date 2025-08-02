package generic;

import leetcode.treenode.TreeNode;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Main {

    /**
     *
     * @param root
     * @return
     */
    public int minimumOperations(TreeNode root) {
        int SHIFT = 20, MASK = 0xFFFFF;
        return bfsT(root, 0,
                a -> msBitsEncoded((Long[]) a),
                (c, b) -> c + b,
                (v, i) -> (((long) v) << SHIFT) + i);
    }

    static int msBitsEncoded(Long[] arr) {
        int rs = 0, qLen = arr.length, MASK = 0xFFFFF;
        Arrays.sort(arr);
        for (int i = 0; i < qLen; i++) {
            int oPos = (int) (arr[i] & MASK);
            if (oPos != i) {
                rs++;
                long t = arr[i];
                arr[i--] = arr[oPos];
                arr[oPos] = t;
            }
        }
        return rs;
    }

    static <T, V> T bfsT(TreeNode r, T in, Function<V[], T> f, BiFunction<T, T, T> c,
                         BiFunction<Integer, Integer, V>... v) {
        T rs = in;
        if (r == null) return in;
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(r);
        while (!q.isEmpty()) {
            int qLen = q.size();
            V cItems[] = (V[]) new Long[qLen];
            for (int i = 0; i < qLen; i++) {
                TreeNode tn = q.poll();
                cItems[i] = (v != null && v.length > 0) ? v[0].apply(tn.val, i) : (V) Long.valueOf(tn.val);
                if (tn.left != null) q.offer(tn.left);
                if (tn.right != null) q.offer(tn.right);
            }
            rs = c.apply(rs, f.apply(cItems));
        }
        return rs;
    }

    /**
     *
     * @param root
     * @return
     */
    public List<Integer> largestValues(TreeNode root) {
        return bfsF(root, new ArrayList<>(), a -> mx(a), (r, l) -> { r.addAll(l); return r; });
    }

    static List<Integer> mx(int[] arr) { return Collections.singletonList(Arrays.stream(arr).max().getAsInt()); }

    static <T> T bfsF(TreeNode root, T in, Function<int[], T> f, BinaryOperator<T> c) {
        T rs = in; if (root == null) return in;
        Deque<TreeNode> q = new ArrayDeque<>(); q.offer(root);
        while (!q.isEmpty()) {
            int qLen = q.size(), cItems[] = new int[qLen];
            for (int i = 0; i < qLen; i++) {
                TreeNode tn = q.poll(); cItems[i] = tn.val;
                if (tn.left != null) q.offer(tn.left); if (tn.right != null) q.offer(tn.right);
            }
            rs = c.apply(rs, f.apply(cItems));
        }
        return rs;
    }
}
