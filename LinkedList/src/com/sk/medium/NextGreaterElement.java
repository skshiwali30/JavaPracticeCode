/*We are given a linked list with head as the first node.  Let's number the nodes in the list: node_1, node_2, node_3, ... etc.
Each node may have a next larger value: for node_i, next_larger(node_i) is the node_j.val such that j > i, node_j.val > node_i.val, and j is the smallest possible 
choice.  If such a j does not exist, the next larger value is 0.
Return an array of integers answer, where answer[i] = next_larger(node_{i+1})*/

package com.sk.medium;

import java.util.ArrayList;

import com.sk.ListNode;

public class NextGreaterElement {
	public int[] nextLargerNodes(ListNode head) {
        ListNode curr_ptr = head;
        ListNode next_ptr = head.next;
        ArrayList<Integer> answer = new ArrayList<Integer>();
        if (head.next == null)
            answer.add(0);
        while(curr_ptr.next != null || next_ptr != null) {
            if (curr_ptr.val >= next_ptr.val) {
                next_ptr = next_ptr.next;
            }
            else {
                answer.add(next_ptr.val);
                curr_ptr = curr_ptr.next;
                next_ptr = curr_ptr.next;
            }
            if (next_ptr == null && curr_ptr.next != null) {
                answer.add(0);
                curr_ptr = curr_ptr.next;
                next_ptr = curr_ptr.next;
            }
            if (curr_ptr.next == null) {
                answer.add(0);
            }
        }
        int[] arr = answer.stream().mapToInt(i -> i).toArray();
        return arr;
    }
	
//	public int[] nextLargerNodes(ListNode head) {
//        ArrayList<Integer> al = new ArrayList<Integer>();
//        ListNode ptr = head;
//        while (ptr != null) {
//            al.add(ptr.val);
//            ptr = ptr.next;
//        }
//        int[] arr = new int[al.size()];
//        Stack<Integer> st = new Stack<Integer>();
//        for(int i = 0; i < al.size(); i++) {
//            while (!st.isEmpty() && al.get(st.peek()) < al.get(i)) {
//                arr[st.pop()] = al.get(i);
//            }
//            st.push(i);
//        }
//        return arr;
//    }
}
