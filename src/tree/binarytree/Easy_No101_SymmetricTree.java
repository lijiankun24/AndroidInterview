package tree.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *  Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *
 *  For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *
 *      1
 *     / \
 *    2   2
 *   / \ / \
 *  3  4 4  3
 *  But the following [1,2,2,null,3,null,3] is not:
 *      1
 *     / \
 *    2   2
 *     \   \
 *     3    3
 *  Note:
 *  Bonus points if you could solve it both recursively and iteratively.
 *
 * Created by lijiankun on 2019-02-27.
 */
public class Easy_No101_SymmetricTree {

    public static void main(String[] args) {
        System.out.println(solution2(TreeNode.generateNonSymmetricTree()));
    }

    private static boolean solution2(TreeNode root) {
        if (root == null) return true;
        return recursive(root.left, root.right);
    }

    private static boolean recursive(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return (left.val == right.val &&
                recursive(left.left, right.right) &&
                recursive(left.right, right.left));
    }

    private static boolean solution1(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }
        if (root.left == null || root.right == null) return false;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.pop();
                list.add(node.left == null ? -1 : node.left.val);
                list.add(node.right == null ? -1 : node.right.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            if (!isSymmetric(list)) return false;
        }
        return true;
    }

    private static boolean isSymmetric(List<Integer> list) {
        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            if (list.get(start) != list.get(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
