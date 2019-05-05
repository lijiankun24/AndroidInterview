package tree.binarytree;

import java.util.Map;

/**
 * Medium_No315_SmallestSubtreeWithAllTheDeepestNodes.java
 * <p>
 * Created by lijiankun on 2019-04-07.
 */
public class Medium_No315_SmallestSubtreeWithAllTheDeepestNodes {

    public static void main(String[] args) {

    }

    public static TreeNode subtreeWithAllDeepest(TreeNode root) {
        return solution1(root);
    }

    private static TreeNode solution1(TreeNode root) {
        if (root == null) return null;
        int left = depth(root.left);
        int right = depth(root.right);
        if (left > right) {
            return solution1(root.left);
        } else if (left < right) {
            return solution1(root.right);
        } else {
            return root;
        }
    }

    private static int depth(TreeNode root) {
        if (root == null) return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        return Math.max(left, right) + 1;
    }

    private static TreeNode solution2(TreeNode root, Map<TreeNode, Integer> map) {
        if (root == null) return null;
        int left = depth2(root.left, map);
        int right = depth2(root.right, map);
        if (left == right) return root;
        if (left > right) return solution2(root.left, map);
        return solution2(root.right, map);
    }

    private static int depth2(TreeNode root, Map<TreeNode, Integer> map) {
        if (root == null) return 0;
        if (map.containsKey(root)) return map.get(root);
        int left = depth2(root.left, map);
        int right = depth2(root.right, map);
        int depth = Math.max(left, right) + 1;
        map.put(root, depth);
        return depth;
    }
}
