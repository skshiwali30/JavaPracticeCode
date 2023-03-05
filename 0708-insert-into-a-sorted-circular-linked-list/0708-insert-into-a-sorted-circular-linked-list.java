/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {
        Node newPtr = new Node(insertVal, null);
        if(head == null) {
            newPtr.next = newPtr;
            return newPtr; 
        }
        
        Node prePtr = head;
        Node ptr = head.next;
        boolean insert = false;
        do {
            if(prePtr.val <= insertVal && insertVal <= ptr.val)
                insert = true;
            else if(prePtr.val > ptr.val) {
                if(insertVal >= prePtr.val || insertVal <= ptr.val)
                    insert = true;
            }
            if(insert) {
                prePtr.next = new Node(insertVal, ptr);
                return head;
            }
            prePtr = ptr;
            ptr = ptr.next;
        } while(prePtr != head);
        
        prePtr.next = new Node(insertVal, ptr);
        return head;
    }
}