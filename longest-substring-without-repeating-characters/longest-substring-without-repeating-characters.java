class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        int max = 0;
        while(j < s.length()) {
            char r = s.charAt(j);
            map.put(r, map.getOrDefault(r, 0) + 1);

            while(map.get(r) > 1) {
                char left = s.charAt(i);
                map.put(left, map.get(left) - 1);
                i++;
            }
            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
    }
}