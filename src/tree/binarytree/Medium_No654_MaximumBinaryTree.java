package tree.binarytree;

/**
 * Medium_No654_MaximumBinaryTree.java
 * <p>
 * Created by lijiankun on 2019-03-07.
 */
public class Medium_No654_MaximumBinaryTree {

    public static void main(String[] args) {

    }

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return solution1(nums, 0, nums.length - 1);
    }

    private static TreeNode solution1(int[] nums, int start, int end) {
        if (start > end) return null;
        if (start == end) return new TreeNode(nums[start]);
        int index = start;
        int max = nums[start];
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = solution1(nums, start, index - 1);
        root.right = solution1(nums, index + 1, end);
        return root;
    }
}
