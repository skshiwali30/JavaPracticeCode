class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int start = 0, end = 0, res = 0;
        while(end < s.length()) {
            char ch = s.charAt(end);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while(map.get(ch) > 1) {
                char l = s.charAt(start);
                map.put(l, map.get(l) - 1);
                start++;
            }
            int ws = end - start + 1;
            res = Math.max(res, ws);
            end++;
        }
        return res;
    }
}