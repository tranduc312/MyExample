package leetcode.ez.treenode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NaryTreePostorderTraversal590 {

    public static void main(String[] args) {
        System.out.println(postorder(new Node(1,
                Arrays.asList(null,
                        new Node(3, Arrays.asList(null, new Node(5), new Node(6))),
                        new Node(2),
                        new Node(4)
                    )
                )
            )
        );
    }

    static List<Integer> postorder(Node root) {
        List<Integer> rs = new ArrayList<>();
        if (root == null) return rs;
        postorder(root, rs);

        return rs;
    }

    private static void postorder(Node node, List<Integer> rs) {
        for (Node child : node.children)
            postorder(child, rs);
        rs.add(node.val);
    }
}

