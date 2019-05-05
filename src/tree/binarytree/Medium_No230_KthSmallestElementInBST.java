package tree.binarytree;

/**
 * Medium_No230_KthSmallestElementInBST.java
 * <p>
 * Created by lijiankun on 2019-04-07.
 */
public class Medium_No230_KthSmallestElementInBST {

    public static void main(String[] args) {
        System.out.println(kthSmallest(TreeNode.generateBST1(), 1));
    }

    public static int kthSmallest(TreeNode root, int k) {
        solution1(root, k);
        return res;
    }

    private static int res = 0;
    private static int curIndex = 0;

    private static void solution1(TreeNode root, int k) {
        if (root == null) return;
        solution1(root.left, k);
        curIndex++;
        if (curIndex == k) {
            res = root.val;
        }
        solution1(root.right, k);
    }
}
