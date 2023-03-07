import java.util.regex.*;
class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())
            return true;
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0, j = s.length() - 1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j))
                return false;
            else {
                i++;
                j--;
            }
        }
         return true;  
    }
}