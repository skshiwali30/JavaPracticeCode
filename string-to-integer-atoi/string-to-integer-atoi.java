class Solution {
    public int myAtoi(String s) {
        int res = 0;
        int sign = 1;
        int len = s.length();
        int index = 0;
        while(index < len && s.charAt(index) == ' ')
            index++;
        if(index < len && s.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if(index < len && s.charAt(index) == '+') {
            sign = 1;
            index++;
        }
            
        
        while(index < len && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
            int digit = s.charAt(index) - '0';
            if((res > Integer.MAX_VALUE / 10) || (res == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10))
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            
            res = res * 10 + digit;  
            index++;
        }
        return res * sign;
    }
}