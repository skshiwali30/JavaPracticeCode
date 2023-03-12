class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;
        for(int i = 0; i< s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if(entry.getValue() == 1) {
                int index = s.indexOf(entry.getKey());
                minIndex = Math.min(minIndex, index);
            }
        }
        return minIndex == Integer.MAX_VALUE ? -1 : minIndex;
    }
}