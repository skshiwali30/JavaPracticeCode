class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> output = new ArrayList<String>();
        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < words.length; j++) {
                if(words[j].contains(words[i]) && i != j) {
                    output.add(words[i]);
                    break;
                }
            }
        }
        return output;
    }
}