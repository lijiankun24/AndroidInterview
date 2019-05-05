package linkedlist;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * <p>
 * Example 1:
 *      Input: 1->1->2
 *      Output: 1->2
 * Example 2:
 *      Input: 1->1->2->3->3
 *      Output: 1->2->3
 *
 * Created by lijiankun on 2019-04-29.
 */
public class Easy_No83_RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode lastDiff = head, cur = head.next;
        while (cur != null) {
            if (lastDiff.val != cur.val) {
                lastDiff.next = cur;
                lastDiff = lastDiff.next;
            }
            cur = cur.next;
        }
        lastDiff.next = null;
        return head;
    }
}
