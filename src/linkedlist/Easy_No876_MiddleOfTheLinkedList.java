package linkedlist;

/**
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 * <p>
 * If there are two middle nodes, return the second middle node.
 * <p>
 * Created by lijiankun on 2019-04-22.
 */
public class Easy_No876_MiddleOfTheLinkedList {

    public static void main(String[] args) {

    }

    public ListNode middleNode(ListNode head) {
        return solution1(head);
    }

    private ListNode solution1(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next == null) {
            return slow;
        } else {
            return slow.next;
        }
    }

    private ListNode betterSolution(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
