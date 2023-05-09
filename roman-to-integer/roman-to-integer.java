class Solution {
    
    static Map<String, Integer> values = new HashMap<>();
    static {
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("X", 10);
        values.put("V", 5);
        values.put("I", 1);
    }
    
    public int romanToInt(String s) {
        int res = 0, i = 0;
        while(i < s.length()) {
            String currSym = s.substring(i, i + 1);
            int currValue = values.get(currSym);
            int nextValue = 0;
            if(i + 1 < s.length()) {
                String nextSym = s.substring(i + 1, i + 2);
                nextValue = values.get(nextSym);
            }
            
            if(currValue >= nextValue) {
                res += currValue;
                i += 1;
            } else {
                res += (nextValue - currValue);
                i += 2;
            }
        }
        return res;
    }
}