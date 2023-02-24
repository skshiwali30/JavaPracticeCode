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
    public ListNode insertionSortList(ListNode head) {
        if(head.next == null || head == null)
            return head;
        ListNode newList = new ListNode();
        ListNode ptr = head;
        while(ptr != null) {
            ListNode ptrNewList = newList;
            
            while(ptrNewList.next != null && ptr.val >= ptrNewList.next.val) {
                ptrNewList = ptrNewList.next;
            }
            ListNode ptr1 = ptr.next;
            ptr.next = ptrNewList.next;
            ptrNewList.next = ptr;
            ptr = ptr1;
        }
        return newList.next;
    }
}