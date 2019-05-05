package tree.binarytree;

/**
 * We are given the head node root of a binary tree, where additionally every node's value is either a 0 or a 1.
 *
 * Return the same tree where every subtree (of the given tree) not containing a 1 has been removed.
 *
 * (Recall that the subtree of a node X is X, plus every node that is a descendant of X.)
 *
 * Example 1:
 * Input: [1,null,0,0,1]
 * Output: [1,null,0,null,1]
 *
 * Explanation:
 * Only the red nodes satisfy the property "every subtree not containing a 1".
 * The diagram on the right represents the answer.
 *
 *
 * Example 2:
 * Input: [1,0,1,0,0,0,1]
 * Output: [1,null,1,null,1]
 *
 * Created by lijiankun on 2019-04-02.
 */
public class Medium_No814_BinaryTreePruning {

    public static void main(String[] args) {

    }

    public static TreeNode pruneTree(TreeNode root) {
        return solution1(root);
    }

    private static TreeNode solution1(TreeNode root) {
        if(root == null) return null;
        root.left = solution1(root.left);
        root.right = solution1(root.right);
        if(root.left == null && root.right == null && root.val == 0)
            return null;
        return root;
    }
}
