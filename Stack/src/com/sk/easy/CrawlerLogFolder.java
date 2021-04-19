/*The operations are described below:

"../" : Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).
"./" : Remain in the same folder.
"x/" : Move to the child folder named x (This folder is guaranteed to always exist).*/

package com.sk.easy;

import java.util.Stack;

public class CrawlerLogFolder {
	public int minOperations(String[] logs) {
        Stack<String> st = new Stack<String>();
        for(String log : logs) {
            if(log.equals("../") && !st.isEmpty())
                st.pop();
            else if(log.equals("./") || (log.equals("../") && st.isEmpty()))
                continue;
            else
                st.push(log);
        }
        return st.size();
    }
}
