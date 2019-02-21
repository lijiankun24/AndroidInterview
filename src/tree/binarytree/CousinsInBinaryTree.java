package tree.binarytree;

import java.util.LinkedList;

/**
 * CousinsInBinaryTree.java
 * <p>
 * Created by lijiankun on 2019-02-18.
 */
public class CousinsInBinaryTree {

    public static void main(String[] args) {

    }

    public static boolean isCousins(TreeNode root, int x, int y) {
        return solution1(root, x, y);
    }

    private static boolean solution1(TreeNode root, int x, int y) {
        if (root == null) {
            return false;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int xDepth = 0, yDepth = 0, depth = 0;
        while (!queue.isEmpty()) {
            depth++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.pop();
                if (node.val == x) {
                    xDepth = depth;
                }
                if (node.val == y) {
                    yDepth = depth;
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                if (node.left != null && node.right != null) {
                    if (node.left.val == x && node.right.val == y) {
                        return false;
                    }
                    if (node.left.val == y && node.right.val == x) {
                        return false;
                    }
                }
            }
        }
        return xDepth == yDepth;
    }
}
