/*Given a non-empty, singly linked list with head node head, return a middle node of linked list.
If there are two middle nodes, return the second middle node.*/

package com.sk;

public class MiddleOfList {
	public ListNode middleNode(ListNode head) {
		ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
		
//        int index = 0;
//        ListNode ptr = head;
//        while (ptr != null) {
//            index++;
//            ptr = ptr.next;
//        }
//        index = index / 2;
//        ptr = head;
//        for (int i = 0; i < index; i++) {
//            ptr = ptr.next;
//        }
//        return ptr;
    }
}
