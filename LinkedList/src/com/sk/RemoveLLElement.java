//Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

package com.sk;

public class RemoveLLElement {
	public ListNode removeElements(ListNode head, int val) {
		ListNode ptr =head;
		if (head == null)
			return null;
		while (ptr.next != null) {
			if(ptr.next.val == val) 
				ptr.next = ptr.next.next;
			else
				ptr = ptr.next;
		}
		return head.val == val ? head.next : head;
	}
}
