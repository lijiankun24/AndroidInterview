package tree.binarytree;

/**
 * Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.
 *
 * Example 1:
 * Given tree s:
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 * Given tree t:
 *    4
 *   / \
 *  1   2
 * Return true, because t has the same structure and node values with a subtree of s.
 * Example 2:
 * Given tree s:
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 *     /
 *    0
 * Given tree t:
 *    4
 *   / \
 *  1   2
 * Return false.
 *
 * Created by lijiankun on 2019-03-01.
 */
public class Easy_No572_SubtreeOfAnotherTree {

    public static void main(String[] args) {

    }

    private static boolean solution1(TreeNode root, TreeNode subTree) {
        if (root == null && subTree == null) return true;
        if (root == null || subTree == null) return false;
        return isSame(root, subTree)
                || solution1(root.left, subTree)
                || solution1(root.right, subTree);
    }

    private static boolean isSame(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;
        return node1.val == node2.val
                && isSame(node1.left, node2.left)
                && isSame(node1.right, node2.right);
    }

}
