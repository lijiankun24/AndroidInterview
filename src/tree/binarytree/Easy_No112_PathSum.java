package tree.binarytree;

/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given the below binary tree and sum = 22,
 *
 *       5
 *      / \
 *     4   8
 *    /   / \
 *   11  13  4
 *  /  \      \
 * 7    2      1
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 *
 * Created by lijiankun on 2019-02-28.
 */
public class Easy_No112_PathSum {

    public static void main(String[] args) {
        System.out.println(solution1(TreeNode.generateBST(), 21));
    }

    private static boolean solution1(TreeNode root, int curSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == curSum;
        }
        return solution1(root.left, curSum - root.val)
                || solution1(root.right, curSum - root.val);
    }
}
