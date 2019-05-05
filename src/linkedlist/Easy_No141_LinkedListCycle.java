package linkedlist;

/**
 * Easy_No141_LinkedListCycle.java
 * <p>
 * Created by lijiankun on 2019-04-29.
 */
public class Easy_No141_LinkedListCycle {

    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
