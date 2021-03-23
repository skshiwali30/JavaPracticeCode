/*You are given the head of a linked list, and an integer k.

Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).*/

package com.sk.medium;

import com.sk.ListNode;

public class SwappingNodes {
	public ListNode swapNodes(ListNode head, int k) {
        int lengthLL = 0;
        ListNode ptr = head;
        ListNode ptr1 = head;
        while (ptr != null) {
            lengthLL++;
            ptr = ptr.next;
        }
        int j = lengthLL - k;
        ptr = head;
        for (int first = 1, second = 0; (first < k) || (second < j);) {
            if(first < k) {
                ptr = ptr.next;
                first++;
            }               
            if(second < j) {
                ptr1 = ptr1.next;
                second++;
            }
        }
        int temp = ptr.val;
        ptr.val = ptr1.val;
        ptr1.val = temp;
        return head;
    }
	
	/*
	 * public ListNode swapNodes(ListNode head, int k) { ListNode fast = head;
	 * ListNode slow = head; ListNode first = head, second = head;
	 * 
	 * // Put fast (k-1) nodes after slow for(int i = 0; i < k - 1; ++i) fast =
	 * fast.next;
	 * 
	 * // Save the node for swapping first = fast;
	 * 
	 * // Move until the end of the list while(fast.next != null) { slow =
	 * slow.next; fast = fast.next; }
	 * 
	 * // Save the second node for swapping // Note that the pointer second isn't
	 * necessary: we could use slow for swapping as well // However, having second
	 * improves readability second = slow;
	 * 
	 * // Swap values int temp = first.val; first.val = second.val; second.val =
	 * temp;
	 * 
	 * return head; }
	 */
}
