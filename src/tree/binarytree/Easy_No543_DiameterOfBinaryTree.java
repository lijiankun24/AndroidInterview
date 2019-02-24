package tree.binarytree;

/**
 * Given a binary tree, you need to compute the length of the diameter of the tree.
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
 * This path may or may not pass through the root.
 *
 * Example:
 * Given a binary tree
 *           1
 *          / \
 *         2   3
 *        / \
 *       4   5
 * Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
 *
 * Note: The length of path between two nodes is represented by the number of edges between them.
 *
 * Created by lijiankun on 2019-02-21.
 */
public class Easy_No543_DiameterOfBinaryTree {

    public static void main(String[] args) {
        System.out.println(diameterOfBinaryTree(TreeNode.generateTree()));
    }

    private static int diameter = 0;
    private static int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return diameter > 0 ? diameter - 1 : 0;
    }

    private static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        diameter = Math.max(diameter, leftDepth + rightDepth + 1);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
