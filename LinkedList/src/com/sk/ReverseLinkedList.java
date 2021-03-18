//Given the head of a singly linked list, reverse the list, and return the reversed list.

package com.sk;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
        ListNode ptr1 = null;
        ListNode ptr = head;
        while(ptr != null) {
            ListNode nextTemp = ptr.next;
            ptr.next = ptr1;           
            ptr1 = ptr;
            ptr = nextTemp;
        }
        return ptr1;
    }
}
