package tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Medium_No513_FindBottomLeftTreeValue.java
 * <p>
 * Created by lijiankun on 2019-04-03.
 */
public class Medium_No513_FindBottomLeftTreeValue {

    public static void main(String[] args) {

    }

    public static int findBottomLeftValue(TreeNode root) {
        return solution1(root);
    }

    private static int solution1(TreeNode root) {
        if(root.left == null && root.right == null) return root.val;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode leftMost = null;
        if(root.left != null) queue.add(root.left);
        if(root.right != null) queue.add(root.right);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode node = ((LinkedList<TreeNode>) queue).pop();
                if(i == 0) leftMost = node;
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        }
        return leftMost.val;
    }
}
