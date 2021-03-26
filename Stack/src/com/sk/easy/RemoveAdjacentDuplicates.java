/*Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.
We repeatedly make duplicate removals on S until we no longer can.
Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.*/

package com.sk.easy;

import java.util.Stack;

public class RemoveAdjacentDuplicates {
	public String removeDuplicates(String S) {
        Stack<Character> s = new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        for(int i = S.length() - 1; i >= 0; i--) {
            
            if(!s.isEmpty() && s.peek() == S.charAt(i))
                s.pop();
            else
                s.push(S.charAt(i));
        }
        for(Character item : s)
            sb.append(item);
        return sb.reverse().toString();
    }
}
