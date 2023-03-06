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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0)
            return head;
        int length = 0;
        ListNode ptr = head;
        while(ptr.next != null) {
            length++;
            ptr = ptr.next;
        }
        length++;
        ptr.next = head;
        
        k = length - k % length;
        ptr = head;
        while(k-- > 1) {
            ptr = ptr.next;
        }
        head = ptr.next;
        ptr.next = null;
        
        return head;
    }
}