//Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.

package com.sk;

public class MergedTwoSortedLL {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode ptr1 = new ListNode(0);
		ListNode ptr2 = ptr1;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				ptr1.next = l1;
				l1 = l1.next;
			}
			else {
				ptr1.next = l2;
				l2 = l2.next;
			}
			ptr1 = ptr1.next;
		}
		if (l1 != null)
			ptr1.next = l1;
		if (l2 != null)
			ptr1.next = l2;
		return ptr2.next;
	}
}
