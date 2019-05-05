package linkedlist;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 * <p>
 * Created by lijiankun on 2019-04-28.
 */
public class Easy_No21_MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode newHead = mergeTwoLists(ListNode.generateLinkedList(), ListNode.generateLinkedList1());
        System.out.println(newHead);
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return l1 == null ? l2 : l1;
        ListNode head, cur;
        head = l1.val < l2.val ? l1 : l2;
        cur = head;
        if (l1.val < l2.val) {
            l1 = l1.next;
        } else {
            l2 = l2.next;
        }
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 == null ? l2 : l1;
        return head;
    }
}
