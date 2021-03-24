package com.sk.medium;

import java.util.HashSet;
import java.util.Set;

import com.sk.ListNode;

public class LLComponents {

	public int numComponents(ListNode head, int[] G) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i : G)
            set.add(i);
        
        ListNode ptr = head;
        int comp = 0;
        
        while (ptr != null) {
            if(set.contains(ptr.val)) {
                comp++;
                while (ptr != null && set.contains(ptr.val)) {
                    set.remove(ptr.val);
                    ptr = ptr.next;
                }
            }
            else                  
                ptr = ptr.next;               
        }
        return comp;
    }
	
//	public int numComponents(ListNode head, int[] G) {
//        Set<Integer> set = new HashSet<Integer>();
//        for(int i : G)
//            set.add(i);
//        
//        ListNode ptr = head;
//        int comp = 0;
//        
//        while (ptr != null) {            
//            if (set.contains(ptr.val) && (ptr.next == null || !set.contains(ptr.next.val))) {
//                comp++;
//            }                    
//            ptr = ptr.next;               
//        }
//        return comp;
//    }
}
