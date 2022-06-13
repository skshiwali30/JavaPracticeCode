class Solution {
    public boolean rotateString(String s, String goal) {
        String result = goal + goal;
        if(result.contains(s) && (goal.length() == s.length()))
            return true;
        else
            return false;
    }
}