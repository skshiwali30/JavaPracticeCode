//A function to delete a node in a singly-linked list. You will not be given access to the head of the list, 
//instead you will be given access to the node to be deleted directly.

package com.sk;

public class DeleteNodeList {
	public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;   
    }
}
