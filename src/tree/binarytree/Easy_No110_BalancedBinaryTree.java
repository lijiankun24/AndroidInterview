package tree.binarytree;

/**
 * Given a binary tree, determine if it is height-balanced.
 *
 * For this problem, a height-balanced binary tree is defined as:
 *
 * a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Example 1:
 *
 * Given the following tree [3,9,20,null,null,15,7]:
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * Return true.
 *
 * Example 2:
 *
 * Given the following tree [1,2,2,3,3,null,null,4,4]:
 *
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * Return false.
 *
 * Created by lijiankun on 2019-03-04.
 */
public class Easy_No110_BalancedBinaryTree {
    public static void main(String[] args) {
        System.out.println(isBalanced(TreeNode.generateTree()));
    }

    private static boolean isBalanced(TreeNode root) {
        // solution2(root);
        // return isBalanced;
        return solution1(root);
    }

    private boolean isBalanced = true;
    private void solution2(TreeNode root){
        if(root == null) return;
        maxDepth2(root);
        solution2(root.left);
        solution2(root.right);
    }

    private int maxDepth2(TreeNode root){
        if(root == null) return 0;
        int left = maxDepth2(root.left);
        int right = maxDepth2(root.right);
        if(Math.abs(left - right) > 1) isBalanced = false;
        return Math.max(left, right) + 1;
    }

    private static boolean solution1(TreeNode root){
        if(root == null) return true;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return (Math.abs(left - right) <= 1) &&
                isBalanced(root.left) &&
                isBalanced(root.right);
    }

    private static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
