package linkedlist;

/**
 * Reverse a singly linked list.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 * <p>
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 * <p>
 * Created by lijiankun on 2019-04-23.
 */
public class Easy_No206_ReverseLinkedList {

    public static void main(String[] args) {
        ListNode node = reverseList(ListNode.generateLinkedList());
        System.out.println(node);
    }

    static ListNode reverseList(ListNode head) {
//        return solution1(head);
        if (head == null || head.next == null) return head;
        ListNode temp = new ListNode(2);
        solution2(head, temp);
        return temp.next;
    }

    private static ListNode solution1(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode last, cur;
        last = head;
        cur = head.next;
        head.next = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = last;
            last = cur;
            cur = next;
        }

        return last;
    }

    private static ListNode solution2(ListNode head, ListNode newHead) {
        if (head.next == null) {
            newHead.next = head;
            return head;
        }
        ListNode tail = solution2(head.next, newHead);
        tail.next = head;
        head.next = null;
        return head;
    }
}
