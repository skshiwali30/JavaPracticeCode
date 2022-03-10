class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0, i = 0;
        if(ruleKey.equals("type"))
            i = 0;
        if(ruleKey.equals("color"))
            i = 1;
        if(ruleKey.equals("name"))
            i = 2;
        for(List<String> item : items) {
            if(item.get(i).equals(ruleValue))
               count++;
        }
        return count;
    }
}