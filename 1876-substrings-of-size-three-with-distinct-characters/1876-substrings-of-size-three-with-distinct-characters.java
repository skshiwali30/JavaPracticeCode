class Solution {
    public int countGoodSubstrings(String s) {
        int start = 0;
        int end = 0;
        int count = 0;
        char[] ch = s.toCharArray();
        while(end < s.length()) {
            int windowSize = end - start + 1;
            if(windowSize < 3)
                end++;
            else if(windowSize == 3) {
                if(checkForDistinct(ch, start, end))
                    count++;
                start++;
                end++;
            }
        }
        return count;
    }
    public boolean checkForDistinct(char[] ch, int start, int end) {
        Set<Character> s = new HashSet<>();
        for(int i = start; i <= end; i++) {
            s.add(ch[i]);
        }
        if(s.size() == 3)
            return true;
        return false;
    }
}