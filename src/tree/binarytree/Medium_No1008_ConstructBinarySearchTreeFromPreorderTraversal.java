package tree.binarytree;

/**
 * Return the root node of a binary search tree that matches the given preorder traversal.
 *
 * (Recall that a binary search tree is a binary tree where for every node,
 * any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val.
 * Also recall that a preorder traversal displays the value of the node first,
 * then traverses node.left, then traverses node.right.)
 *
 * Created by lijiankun on 2019-03-25.
 */
public class Medium_No1008_ConstructBinarySearchTreeFromPreorderTraversal {

    public static void main(String[] args) {

    }

    public static TreeNode bstFromPreorder(int[] preorder) {
        if (preorder == null) return null;
        int start = 0, end = preorder.length - 1;
        return solution1(preorder, start, end);
    }

    private static TreeNode solution1(int[] preorder, int start, int end) {
        if (start > end) return null;
        if (start == end) return new TreeNode(preorder[start]);
        int index = start + 1;
        for (; index <= end; index++) {
            if (preorder[index] > preorder[start]) {
                break;
            }
        }
        TreeNode root = new TreeNode(preorder[start]);
        root.left = solution1(preorder, start + 1, index - 1);
        root.right = solution1(preorder, index, end);
        return root;
    }
}
