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
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;
        ListNode nextPtr = null, ptr = head, ptr1 = null;
        while (ptr != null) {
            nextPtr = ptr.next;
            ptr.next = ptr1;
            ptr1 = ptr;
            ptr = nextPtr;
        }
        return ptr1;
    }
}