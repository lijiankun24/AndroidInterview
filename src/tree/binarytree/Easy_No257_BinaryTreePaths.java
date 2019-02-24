package tree.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return all root-to-leaf paths.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Input:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * Output: ["1->2->5", "1->3"]
 *
 * Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 *
 * Created by lijiankun on 2019-02-25.
 */
public class Easy_No257_BinaryTreePaths {

    public static void main(String[] args) {
        List<String> res = binaryTreePaths(TreeNode.generateTree());
        for (String temp : res) {
            System.out.println(temp);
        }
    }

    private static List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root != null) solution1(root, res, "");
        return res;
    }

    private static void solution1(TreeNode root, List<String> res, String curPath) {
        if (root.left == null && root.right == null) res.add(curPath + root.val);
        if (root.left != null) solution1(root.left, res, curPath + root.val + "->");
        if (root.right != null) solution1(root.right, res, curPath + root.val + "->");
    }
}
