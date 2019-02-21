package tree.binarytree.traversal;

import tree.binarytree.TreeNode;

import java.util.Stack;

/**
 * PostOrder.java
 * <p>
 * Created by lijiankun on 2019-02-20.
 */
public class PostOrder {

    public static void main(String[] args) {
        postOrder(TreeNode.generateBST());
    }

    private static void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (node != null) {
            stack.push(node.left);
            node = node.left;
        }
        while (!stack.isEmpty()) {

        }
    }
}
