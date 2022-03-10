class Solution {
    public List<String> cellsInRange(String s) {
        char col1 = s.charAt(0); // K
        char row1 = s.charAt(1); // 1
        char col2 = s.charAt(3); // L
        char row2 = s.charAt(4); // 2
        List<String> output = new ArrayList<String>();
        
        for(char i = col1; i <= col2; i++){
            for(char j = row1; j <= row2; j++){
                output.add("" + i + j);
            }
        }
        return output;
    }
}