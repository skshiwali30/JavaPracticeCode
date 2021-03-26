/*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, 
and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.*/

package com.sk.medium;

import com.sk.ListNode;

public class SumOfNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode l3 = new ListNode(0);
        ListNode ptr = l3;
        while(l1 != null || l2 != null || carry != 0) {
            if(l1 != null) {
                carry = carry + l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                carry = carry + l2.val;
                l2 = l2.next;
            } 
            ptr.next = new ListNode(carry % 10);
            carry = carry / 10;
            ptr = ptr.next;
        }
        return l3.next;
    }
}
