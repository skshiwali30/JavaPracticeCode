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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ptr = head, ptr1 = null;
        int temp = -101;
        if(head == null || head.next == null)
            return head;
        while(ptr.next != null){
            if (temp == ptr.val) {
                if(ptr == head) {
                    ptr = ptr.next;
                    head = ptr;
                } else {
                    ptr = ptr.next;
                    ptr1.next = ptr;
                }
            }
            else if(ptr.val == ptr.next.val) {
                temp = ptr.val;
                if(ptr == head) {
                    ptr = ptr.next;
                    head = ptr;
                } else {
                    ptr = ptr.next;
                    ptr1.next = ptr;
                }
            } else {
                ptr1 = ptr;
                ptr = ptr.next;
            }
        }
        if (ptr.next == null && temp == ptr.val) {
            if(ptr == head)
                head = null;
            else
                ptr1.next = null;
        }
            
        return head;
    }
}