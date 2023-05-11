class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        if(strs.length == 0)
            return new ArrayList<>();
        for(String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String chKey = String.valueOf(ch);
            map.putIfAbsent(chKey, new ArrayList<>());
            map.get(chKey).add(s);
        }
        return new ArrayList<>(map.values());
    }
}