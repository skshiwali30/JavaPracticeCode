/*Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.*/

package com.sk;

public class DeleteDuplicates {
	public ListNode deleteDuplicates(ListNode head) {
        ListNode ptr = head;
        while (ptr != null && ptr.next != null) {
            if(ptr.val == ptr.next.val)
                ptr.next = ptr.next.next;
            else
                ptr = ptr.next;
        }
        return head;
    }
}
