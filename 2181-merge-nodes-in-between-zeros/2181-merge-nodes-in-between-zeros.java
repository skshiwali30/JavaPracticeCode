/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        int result = 0;
        ListNode ptr = head, ptr1 = ptr.next, temp = null;
        while (ptr1 != null) {
            if(ptr.val == 0) {
                if (ptr1.val != 0) {
                    result = result + ptr1.val;
                    ptr1 = ptr1.next;
                } else {
                    ptr.val = result;
                    ptr.next = ptr1;
                    temp = ptr;
                    ptr = ptr1;
                    ptr1 = ptr1.next;
                    result = 0; 
                } 
            }
        }
        temp.next = null;
        return head;
    }
}