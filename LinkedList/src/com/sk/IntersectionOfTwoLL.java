/*Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. 
If the two linked lists have no intersection at all, return null.*/

package com.sk;

public class IntersectionOfTwoLL {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptrA = headA;
        ListNode ptrB = headB;
        if (headA == null || headB == null)
            return null;
        while (ptrA != null && ptrB != null && ptrA != ptrB) {
            ptrA = ptrA.next;
            ptrB = ptrB.next;
            if (ptrA == ptrB)
                return ptrA;
            if (ptrA == null)
                ptrA = headB;
            if (ptrB == null)
                ptrB = headA;
        }
        return ptrA;
    }
}
