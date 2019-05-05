package tree.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Medium_No515_FindLargestValueInEachTreeRow.java
 * <p>
 * Created by lijiankun on 2019-04-05.
 */
public class Medium_No515_FindLargestValueInEachTreeRow {

    public static void main(String[] args) {

    }

    public static List<Integer> largestValues(TreeNode root) {
        return solution1(root);
    }

    // 采用 BFS，层序遍历
    private static List<Integer> solution1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = ((LinkedList<TreeNode>) queue).pop();
                if (node.val > max) max = node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            res.add(max);
        }
        return res;
    }

    private static void solution2(TreeNode root, int level, List<Integer> res) {
        if (root == null) return;

        if (level == res.size()) {
            res.add(root.val);
        } else {
            int lastIndex = res.size() - 1;
            int max = Math.max(res.get(lastIndex), root.val);
            res.add(lastIndex, max);
        }
        solution2(root.left, level + 1, res);
        solution2(root.right, level + 1, res);
    }
}
