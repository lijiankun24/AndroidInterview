package tree.binarytree.bst;

import tree.binarytree.TreeNode;

/**
 * DeleteFromBST.java
 * <p>
 * Created by lijiankun on 2019-02-16.
 */
public class DeleteFromBST {

    public static void main(String[] args) {
        TreeNode node = deleteNode(TreeNode.generateBST(), 8);
        System.out.println(node);
    }

    static TreeNode deleteNode(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            TreeNode node = getSmallest(root.right);
            root.val = node.val;
            root.right = deleteNode(root.right, node.val);
        } else if (root.val > val) {
            root.left = deleteNode(root.left, val);
        } else {
            root.right = deleteNode(root.right, val);
        }
        return root;
    }

    private static TreeNode getSmallest(TreeNode root) {
        if (root == null) {
            return null;
        } else {
            while (root.left != null) {
                root = root.left;
            }
            return root;
        }
    }
}
