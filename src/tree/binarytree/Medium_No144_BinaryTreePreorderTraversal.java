package tree.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Medium_No144_BinaryTreePreorderTraversal.java
 * <p>
 * Created by lijiankun on 2019-04-07.
 */
public class Medium_No144_BinaryTreePreorderTraversal {

    public static void main(String[] args) {

    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        return solution1(root);
    }

    private static List<Integer> solution1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
        return result;
    }
}
