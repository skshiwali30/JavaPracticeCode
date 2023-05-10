class Solution {
    public int strStr(String haystack, String needle) {
        int hLength = haystack.length(), nLength = needle.length();
        for(int start = 0; start <= (hLength - nLength); start++) {
            for(int i = 0; i < nLength; i++) {
                if(needle.charAt(i) != haystack.charAt(start + i))
                    break;
                if(i == nLength - 1)
                    return start;
            }
        }
        return -1;
    }
}