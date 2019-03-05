package tree.binarytree;

/**
 * Given a binary tree, find the length of the longest path where each node in the path has the same value. This path may or may not pass through the root.
 *
 * Note: The length of path between two nodes is represented by the number of edges between them.
 *
 * Example 1:
 *
 * Input:
 *
 *               5
 *              / \
 *             4   5
 *            / \   \
 *           1   1   5
 * Output:
 *
 * 2
 * Example 2:
 *
 * Input:
 *
 *               1
 *              / \
 *             4   5
 *            / \   \
 *           4   4   5
 * Output:
 *
 * 2
 *
 * Created by lijiankun on 2019-02-28.
 */
public class Easy_No687_LongestUnivaluePath {

    public static void main(String[] args) {
        System.out.println(longestUnivaluePath(TreeNode.generateBinaryTree()));
    }

    private static int longestUnivaluePath(TreeNode root) {
        return 0;
    }
}
