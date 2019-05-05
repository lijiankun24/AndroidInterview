package tree.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Medium_No113_PathSumII.java
 * <p>
 * Created by lijiankun on 2019-04-09.
 */
public class Medium_No113_PathSumII {

    public static void main(String[] args) {

    }

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> curPath = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        pathSum(root, sum, res, curPath);
        return res;
    }

    private static void pathSum(TreeNode root, int curVal, List<List<Integer>> res, List<Integer> curPath) {
        if (root.val == curVal && root.left == null && root.right == null) {
            curPath.add(root.val);
            List<Integer> temp = new ArrayList<>(curPath);
            res.add(temp);
            return;
        }

        curPath.add(root.val);
        int size = curPath.size() - 1;
        if (root.left != null) pathSum(root.left, curVal - root.val, res, curPath);
        if (root.right != null) pathSum(root.right, curVal - root.val, res, curPath);
        curPath.remove(size);
    }
}
