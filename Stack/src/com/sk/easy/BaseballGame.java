/*Input: ops = ["5","-2","4","C","D","9","+","+"]
Output: 27
Explanation:
"5" - Add 5 to the record, record is now [5].
"-2" - Add -2 to the record, record is now [5, -2].
"4" - Add 4 to the record, record is now [5, -2, 4].
"C" - Invalidate and remove the previous score, record is now [5, -2].
"D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
"9" - Add 9 to the record, record is now [5, -2, -4, 9].
"+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
"+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.*/

package com.sk.easy;

import java.util.Stack;

public class BaseballGame {
	public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0; i < ops.length; i++) {
            if(ops[i].equals("D"))
                st.push(2 * st.peek());                
            else if(ops[i].equals("C"))
                st.pop();
            else if(ops[i].equals("+")) {
                int temp = st.pop();
                int res = temp + st.peek();
                st.push(temp);
                st.push(res);
            }
            else
                st.push(Integer.valueOf(ops[i]));
        }
        int res = 0;
        for(int sum : st) {
            res = res + sum;
        }
        return res;
    }
}
