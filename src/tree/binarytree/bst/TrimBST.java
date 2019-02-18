package tree.binarytree.bst;

import tree.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * TrimBST.java
 * <p>
 * Created by lijiankun on 2019-02-16.
 */
public class TrimBST {

    public static void main(String[] args) {
        TreeNode node = trimBST(TreeNode.generateBST1(), 1, 3);
        System.out.println(node);
    }

    private static TreeNode trimBST(TreeNode root, int L, int R) {
        return solution1(root, L, R);
    }

    private static TreeNode solution1(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }
        List<Integer> list = inOrderRecursion(root);
        if (R < list.get(0) || L > list.get(list.size() - 1)) {
            return null;
        }
        if (L < list.get(0) && R > list.get(list.size() - 1)) {
            return root;
        }
        int start = list.indexOf(L);
        int end = list.indexOf(R) + 1;
        if (list.contains(L) && !list.contains(R)) {
            end = list.size();
        }
        if (!list.contains(L) && list.contains(R)) {
            start = 0;
        }
        for (int i = 0; i < start; i++) {
            DeleteFromBST.deleteNode(root, list.get(i));
        }
        for (int i = end; i < list.size(); i++) {
            DeleteFromBST.deleteNode(root, list.get(i));
        }
        return root;
    }

    private static List<Integer> inOrderRecursion(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }
}
