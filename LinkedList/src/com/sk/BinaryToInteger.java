/*Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. 
The linked list holds the binary representation of a number.*/

package com.sk;

public class BinaryToInteger {
	
	public int getDecimalValue(ListNode head) {
        int index = 0;
        int result = 0;
        ListNode ptr = head; 
        while (ptr.next != null) {
            ptr = ptr.next;
            index++;
        }
        ptr = head;
        for(int i = index; (i >= 0 && ptr != null); i--) {
            if(ptr.val == 1) {
                result = result + (int)(Math.pow(2, i));
            }          
            ptr = ptr.next;
        }
        return result;
        
//        int num = head.val;
//        while (head.next != null) {
//            num = num * 2 + head.next.val;
//            head = head.next;    
//        }
//        return num;
        
    }
}
