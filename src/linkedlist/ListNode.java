package linkedlist;

/**
 * ListNode.java
 * <p>
 * Created by lijiankun on 2019-04-22.
 */
class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    static ListNode generateLinkedList() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(4);
        one.next = two;
        two.next = three;
        return one;
    }

    static ListNode generateLinkedList1() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(3);
        ListNode three = new ListNode(4);
        one.next = two;
        two.next = three;
        return one;
    }
}
