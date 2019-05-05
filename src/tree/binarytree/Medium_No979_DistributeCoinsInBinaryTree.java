package tree.binarytree;

/**
 * Medium_No979_DistributeCoinsInBinaryTree.java
 * <p>
 * Created by lijiankun on 2019-04-05.
 */
public class Medium_No979_DistributeCoinsInBinaryTree {

    public static void main(String[] args) {
        System.out.println(distributeCoins(TreeNode.generateBST1()));
    }

    public static int distributeCoins(TreeNode root) {
        solution1(root);
        return step;
    }

    private static int step = 0;

    private static int solution1(TreeNode root) {
        if (root == null) return 0;
        int left = solution1(root.left);
        int right = solution1(root.right);
        int result = root.val + left + right;
        step += Math.abs(left) + Math.abs(right);
        return result - 1;
    }
}
