/*You are given two non-empty linked lists representing two non-negative integers. 
The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.*/

package com.sk.medium;

import java.util.Stack;

import com.sk.ListNode;

public class SumOfNumbers2 {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long num1 = 0, num2 = 0;
        long sum;
        ListNode l3 = null;
        while(l1 != null) {
            num1 = num1 * 10 + l1.val;
            l1 = l1.next;
        }
        while(l2 != null) {
            num2 = num2 * 10 + l2.val;
            l2 = l2.next;
        }
        sum = num1 + num2;
        if(sum == 0) {
            ListNode ptr = new ListNode(0);
            l3 = ptr;
            return l3;
        }
        while (sum > 0) {
            ListNode ptr = new ListNode((int)(sum % 10));
            ptr.next = l3;
            l3 = ptr;
            sum = sum / 10;
        }        
        return l3; 
    }
	
//	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        Stack<Integer> s1 = new Stack<Integer>();
//        Stack<Integer> s2 = new Stack<Integer>();
//        
//        while(l1 != null) {
//            s1.push(l1.val);
//            l1 = l1.next;
//        }
//        while(l2 != null) {
//            s2.push(l2.val);
//            l2 = l2.next;
//        }
//        int sum = 0;
//        ListNode l3 = new ListNode(0);
//        while (!s1.empty() || !s2.empty()) {
//            if(!s1.empty())
//                sum = sum + s1.pop();
//            if(!s2.empty())
//                sum = sum + s2.pop();
//            l3.val = sum % 10;
//            ListNode ptr = new ListNode(sum / 10);
//            ptr.next = l3;
//            l3 = ptr;
//            sum = sum / 10;
//        }       
//        return l3.val == 0 ? l3.next : l3; 
//    }
}
