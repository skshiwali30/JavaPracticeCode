/*Input: s = "leEeetcode"
Output: "leetcode"
Explanation: In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".*/

package com.sk.easy;

import java.util.Stack;

public class MakingStringGreat {
	public String makeGood(String s) {
        Stack<Character> st = new Stack();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!st.isEmpty() && Math.abs(st.peek() - ch) == 32)
                st.pop();
            else
                st.push(ch);
        }
        
        while(st.size() > 0) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
