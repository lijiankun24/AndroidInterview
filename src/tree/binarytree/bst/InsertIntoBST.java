package tree.binarytree.bst;

import tree.binarytree.TreeNode;

public class InsertIntoBST {

    public static void main(String[] args) {
        TreeNode node = insertIntoBST(TreeNode.generateBST(), 9);
        System.out.println(node);
    }

    private static TreeNode insertIntoBST(TreeNode root, int val) {
        return solution2(root, val);
    }

    private static TreeNode solution2(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val < val) {
            root.right = solution2(root.right, val);
        } else {
            root.left = solution2(root.left, val);
        }
        return root;
    }

    private static void solution1(TreeNode root, int val) {
        if (root == null) {
            return;
        }
        if (val < root.val && (root.left == null || val > root.left.val)) {
            TreeNode temp = root.left;
            root.left = new TreeNode(val);
            root.left.left = temp;
            return;
        }
        if (root.val < val && (root.right == null || val < root.right.val)) {
            TreeNode temp = root.right;
            root.right = new TreeNode(val);
            root.right.right = temp;
            return;
        }
        if (val < root.val) {
            solution1(root.left, val);
        } else {
            solution1(root.right, val);
        }
    }
}
