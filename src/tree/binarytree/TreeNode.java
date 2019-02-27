package tree.binarytree;

/**
 * TreeNode
 * <p>
 * Created by lijiankun on 2019/1/21
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    /**
     *      3
     *     / \
     *    0   4
     *     \
     *     2
     *    /
     *   1
     */
    public static TreeNode generateBST1() {
        TreeNode root = new TreeNode(3);
        TreeNode left1 = new TreeNode(0);
        TreeNode right1 = new TreeNode(4);
        TreeNode left2 = new TreeNode(2);
        TreeNode left3 = new TreeNode(1);
        root.left = left1;
        root.right = right1;
        left1.right = left2;
        left2.left = left3;
        return root;
    }

    /**
     *      6
     *     / \
     *    4   8
     *   /   / \
     *  3   7  10
     */
    public static TreeNode generateBST() {
        TreeNode root = new TreeNode(6);
        TreeNode left1 = new TreeNode(4);
        TreeNode right1 = new TreeNode(8);
        TreeNode left2 = new TreeNode(3);
        TreeNode left3 = new TreeNode(7);
        TreeNode right3 = new TreeNode(10);

        root.left = left1;
        root.right = right1;
        left1.left = left2;
        right1.left = left3;
        right1.right = right3;
        return root;
    }

    public static TreeNode generateTree() {
        TreeNode root = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);
        TreeNode left2 = new TreeNode(4);
        TreeNode right2 = new TreeNode(5);
        TreeNode left3 = new TreeNode(6);
        TreeNode right3 = new TreeNode(7);
        TreeNode left4 = new TreeNode(8);
        TreeNode right4 = new TreeNode(9);

        root.left = left1;
        root.right = right1;
        left1.left = left2;
        left1.right = right2;
        left2.left = left3;
        left2.right = right3;
        left3.left = left4;
        left3.right = right4;
        return root;
    }

    public static TreeNode generateTree1() {
        TreeNode left1 = new TreeNode(2);
        TreeNode left2 = new TreeNode(4);
        TreeNode right2 = new TreeNode(5);
        TreeNode left3 = new TreeNode(6);
        TreeNode right3 = new TreeNode(7);
        TreeNode left4 = new TreeNode(8);
        TreeNode right4 = new TreeNode(9);

        left1.left = left2;
        left1.right = right2;
        left2.left = left3;
        left2.right = right3;
        left3.left = left4;
        left3.right = right4;
        return left1;
    }

    public static TreeNode generateNonSymmetricTree() {
        TreeNode left1 = new TreeNode(1);
        TreeNode left2 = new TreeNode(2);
        TreeNode right2 = new TreeNode(2);

        TreeNode left3 = new TreeNode(3);
        TreeNode right3 = new TreeNode(3);

        left1.left = left2;
        left1.right = right2;

        left2.right = left3;
        right2.right = right3;
        return left1;
    }
}
