package tree.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Easy_No101_SymmetricTree.java
 * <p>
 * Created by lijiankun on 2019-02-27.
 */
public class Easy_No101_SymmetricTree {

    public static void main(String[] args) {
        System.out.println(solution1(TreeNode.generateNonSymmetricTree()));
    }

    private static boolean solution1(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) {
            return true;
        }
        if(root.left == null || root.right == null) return false;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.pop();
                list.add(node.left == null ? -1 : node.left.val);
                list.add(node.right == null ? -1 : node.right.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            if(!isSymmetric(list)) return false;
        }
        return true;
    }

    private static boolean isSymmetric(List<Integer> list) {
        int start = 0;
        int end = list.size() - 1;
        while(start < end) {
            if(list.get(start) != list.get(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
