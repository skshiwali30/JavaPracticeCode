/*You are given two linked lists: list1 and list2 of sizes n and m respectively.

Remove list1's nodes from the ath node to the bth node, and put list2 in their place.
*/
package com.sk.medium;

import com.sk.ListNode;

public class MergeInBetweenLL {
	public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode ptr1 = list1;
        
        for (int i = 1; i < a; i++) {
            ptr1 = ptr1.next;
        }
        ListNode ptr2 = ptr1.next;
        for(int i = a; i <= b; i++) {
            ptr2 = ptr2.next;
        }
        
        ptr1.next = list2;
        while(list2.next != null) {
            list2 = list2.next;
        }
        
        list2.next = ptr2;
        return list1;
    }
}
