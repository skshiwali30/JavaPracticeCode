/*A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.  
For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses string.
Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.
Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.*/

package com.sk.easy;

public class RemoveOuterMostPar {
	public String removeOuterParentheses(String S) {
        int open = 0, close = 0, start = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '(')
                open++;
            else if(S.charAt(i) == ')')
                close++;
            if(open == close) {
                sb.append(S.substring(start+1, i));
                start = i + 1;
            }
        }
        return sb.toString();
    }
}
