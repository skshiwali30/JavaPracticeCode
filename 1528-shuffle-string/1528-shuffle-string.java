class Solution {
    public String restoreString(String s, int[] indices) {
        Character[] shuffled = new Character[indices.length];
        for (int i=0; i < indices.length; i++) {
            shuffled[indices[i]] = s.charAt(i); 
        }
        String finalWord = "";
        for (int i = 0; i < shuffled.length; i++) {
            finalWord = finalWord + shuffled[i];
        }
        return finalWord;
    }
}