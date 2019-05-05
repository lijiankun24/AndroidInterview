package tree.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Medium_No199_BinaryTreeRightSideView.java
 * <p>
 * Created by lijiankun on 2019-04-07.
 */
public class Medium_No199_BinaryTreeRightSideView {

    public static void main(String[] args) {

    }

    public List<Integer> rightSideView(TreeNode root) {
//        return solution1(root);

        List<Integer> list = new ArrayList<>();
        solution2(root, list, 1);
        return list;
    }

    private void solution2(TreeNode root, List<Integer> result, int depth) {
        if (root == null) return;
        if (result.size() < depth) {
            result.add(root.val);
        } else {
            result.set(depth, root.val);
        }
        solution2(root.left, result, depth + 1);
        solution2(root.right, result, depth + 1);
    }

    private List<Integer> solution1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            for (int i = 0, size = queue.size(); i < size; i++) {
                TreeNode node = ((LinkedList<TreeNode>) queue).pop();
                if (i == size - 1) result.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return result;
    }
}
