package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * NaryTreeLevelOrderTraversal.java
 * <p>
 * Created by lijiankun on 2019-02-17.
 */
public class NaryTreeLevelOrderTraversal {

    public static void main(String[] args) {
        System.out.println("levelOrder");
    }

    public static List<List<Integer>> levelOrder(Node root) {
        return solution1(root);
    }

    private static List<List<Integer>> solution1(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node node = ((LinkedList<Node>) queue).pop();
                temp.add(node.val);
                for (int j = 0; j < node.children.size(); j++) {
                    queue.add(node.children.get(j));
                }
            }
            list.add(temp);
        }
        return list;
    }
}
