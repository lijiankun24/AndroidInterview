package tree.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Medium_No102_BinaryTreeLevelOrderTraversal.java
 * <p>
 * Created by lijiankun on 2019-04-09.
 */
public class Medium_No102_BinaryTreeLevelOrderTraversal {

    public static void main(String[] args) {

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        return solution1(root);
    }

    private static List<List<Integer>> solution1(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0, size = queue.size(); i < size; i++) {
                TreeNode node = ((LinkedList<TreeNode>) queue).pop();
                list.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(list);
        }
        return result;
    }
}
