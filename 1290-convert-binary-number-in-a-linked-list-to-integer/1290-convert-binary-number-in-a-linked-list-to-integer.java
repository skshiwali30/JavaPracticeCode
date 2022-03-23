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
    public int getDecimalValue(ListNode head) {
        ListNode ptr = head;
        int index = 0, result = 0;
        while(ptr.next != null) {
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
    }
}