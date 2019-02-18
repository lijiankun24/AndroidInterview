package tree.binarytree;

import java.util.List;

/**
 * Node.java
 * <p>
 * Created by lijiankun on 2019-02-17.
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
