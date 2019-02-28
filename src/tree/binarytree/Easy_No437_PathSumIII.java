package tree.binarytree;

/**
 * Easy_No437_PathSumIII.java
 * <p>
 * Created by lijiankun on 2019-02-28.
 */
public class Easy_No437_PathSumIII {

    public static void main(String[] args) {
        TreeNode root = generateBST();
        solution1(root, 8);
        System.out.println(pathCount);
    }

    private static int pathCount = 0;

    private static void solution1(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        pathSum(root, sum);
        solution1(root.left, sum);
        solution1(root.right, sum);
    }

    private static void pathSum(TreeNode root, int curSum) {
        if (root == null) return;
        if (root.val == curSum) {
            pathCount++;
        }
        pathSum(root.left, curSum - root.val);
        pathSum(root.right, curSum - root.val);
    }

    /**
     *       10
     *      /  \
     *     5   -3
     *    / \    \
     *   3   2   11
     *  / \   \
     * 3  -2   1
     */
    private static TreeNode generateBST() {
        TreeNode root = new TreeNode(10);

        TreeNode left1 = new TreeNode(5);
        TreeNode right1 = new TreeNode(-3);

        TreeNode left2 = new TreeNode(3);
        TreeNode left3 = new TreeNode(2);
        TreeNode right3 = new TreeNode(11);

        TreeNode left4 = new TreeNode(3);
        TreeNode right4 = new TreeNode(-2);
        TreeNode right5 = new TreeNode(1);

        root.left = left1;
        root.right = right1;
        left1.left = left2;
        left1.right = left3;
        right1.right = right3;
        left2.left = left4;
        left2.right = right4;
        left3.right = right5;
        return root;
    }
}
