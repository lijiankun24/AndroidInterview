package tree.binarytree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.
 *
 * Assume a BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than or equal to the node's key.
 * The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
 * Both the left and right subtrees must also be binary search trees.
 *
 *
 * For example:
 * Given BST [1,null,2,2],
 *
 *    1
 *     \
 *      2
 *     /
 *    2
 *
 *
 * return [2].
 *
 * Note: If a tree has more than one mode, you can return them in any order.
 *
 * Created by lijiankun on 2019-03-06.
 */
public class Easy_No654_MaximumBinaryTree {

    public static void main(String[] args) {

    }

    private static Map<Integer, Integer> map = new HashMap<>();
    private static int maxCount = 0;

    private static int[] solution1(TreeNode root) {
        inOrder1(root);
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) list.add(entry.getKey());
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    private static void inOrder1(TreeNode root) {
        if (root == null) return;
        solution1(root.left);
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        maxCount = Math.max(maxCount, map.get(root.val));
        solution1(root.right);
    }
}
