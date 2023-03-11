class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || s.length() <= 1)
            return true;
        HashMap<Character, Character> hm = new HashMap<Character, Character>();
        for(int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(hm.containsKey(ch1)) {
                if(!hm.get(ch1).equals(ch2))
                    return false;
            } else {
                if(!hm.containsValue(ch2))
                    hm.put(ch1, ch2);
                else
                    return false;
            }
        }
        return true;
    }
}