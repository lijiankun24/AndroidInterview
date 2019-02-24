package tree.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values.
 * (ie, from left to right, level by level from leaf to root).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its bottom-up level order traversal as:
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 *
 * Created by lijiankun on 2019-02-24.
 */
public class Easy_No107_BinaryTreeLevelOrderTraversalII {

    public static void main(String[] args) {
        System.out.println(levelOrderBottom(TreeNode.generateTree()));
    }

    private static List<List<Integer>> levelOrderBottom(TreeNode root) {
        return solution1(root);
    }

    private static List<List<Integer>> solution1(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new LinkedList<>();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.pop();
                list.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            res.add(0, list);
        }
        return res;
    }
}
