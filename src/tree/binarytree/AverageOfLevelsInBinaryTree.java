package tree.binarytree;

import java.util.*;

/**
 * AverageOfLevelsInBinaryTree.java
 * <p>
 * Created by lijiankun on 2019-02-17.
 */
public class AverageOfLevelsInBinaryTree {

    public static void main(String[] args) {
        System.out.println("");
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = ((LinkedList<TreeNode>) queue).pop();
                sum += node.val;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            list.add(sum / size);
        }
        return list;
    }
}
