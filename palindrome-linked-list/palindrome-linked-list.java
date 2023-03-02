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
    public boolean isPalindrome(ListNode head) {
        ListNode ptr = head;
        List<Integer> list = new ArrayList<>();
        while(ptr != null) {
            list.add(ptr.val);
            ptr = ptr.next;
        }
        int start = 0;
        int end = list.size() - 1;
        while(start < end) {
            if(!list.get(start).equals(list.get(end)))
                return false;
            start++;
            end--;
        }
        return true;
    }
}