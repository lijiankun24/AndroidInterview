package tree.binarytree;

/**
 * You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.
 *
 * The null node needs to be represented by empty parenthesis pair "()".
 * And you need to omit all the empty parenthesis pairs that don't affect
 * the one-to-one mapping relationship between the string and the original binary tree.
 *
 * Example 1:
 * Input: Binary tree: [1,2,3,4]
 *        1
 *      /   \
 *     2     3
 *    /
 *   4
 *
 * Output: "1(2(4))(3)"
 *
 * Explanation: Originallay it needs to be "1(2(4)())(3()())",
 *              but you need to omit all the unnecessary empty parenthesis pairs.
 *              And it will be "1(2(4))(3)".
 *
 *
 * Example 2:
 * Input: Binary tree: [1,2,3,null,4]
 *        1
 *      /   \
 *     2     3
 *      \
 *       4
 *
 * Output: "1(2()(4))(3)"
 *
 * Explanation: Almost the same as the first example,
 *              except we can't omit the first parenthesis pair to break the
 *              one-to-one mapping relationship between the input and the output.
 *
 * Created by lijiankun on 2019-03-25.
 */
public class Easy_No606_ConstructStringFromBinaryTree {

    public static void main(String[] args) {
        System.out.println(tree2str(TreeNode.generateBST1()));
    }

    private static String tree2str(TreeNode t) {
        String res = "";
        if (t == null) return res;
        res = String.valueOf(t.val);
        if (t.right != null) {
            res = res + solution1(t.left) + solution1(t.right);
        } else if (t.left != null) {
            res = res + solution1(t.left);
        }
        return res;
    }

    private static String solution1(TreeNode node) {
        String res = "(";
        if (node == null) return res + ")";
        res = res + node.val;
        if (node.right != null) {
            res = res + solution1(node.left) + solution1(node.right);
        } else if (node.left != null) {
            res = res + solution1(node.left);
        }

        return res + ")";
    }
}
