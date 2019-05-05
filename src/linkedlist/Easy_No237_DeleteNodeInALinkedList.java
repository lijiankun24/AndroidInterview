package linkedlist;

/**
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 * <p>
 * Given linked list -- head = [4,5,1,9], which looks like following:
 * <p>
 * Created by lijiankun on 2019-04-28.
 */
public class Easy_No237_DeleteNodeInALinkedList {

    public static void main(String[] args) {

    }

    public void deleteNode(ListNode node) {
        solution1(node);
    }

    private void solution1(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
