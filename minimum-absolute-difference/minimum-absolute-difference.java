class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> numSet1 = new ArrayList<>();
        int min = Math.abs(arr[1] - arr[0]);
        numSet1.add(arr[0]);
        numSet1.add(arr[1]);
        res.add(numSet1);
        if(arr.length == 2) {
            return res;
        }
        
        for(int i = 1; i < arr.length - 1; i++) {
            List<Integer> numSet = new ArrayList<>();
            int diff = Math.abs(arr[i + 1] - arr[i]);
            if(min == diff) {
                numSet.add(arr[i]);
                numSet.add(arr[i + 1]);
                res.add(numSet);
            } else if(min > diff){
                res.removeAll(res);
                numSet.add(arr[i]);
                numSet.add(arr[i + 1]);
                res.add(numSet);
                min = diff;
            }
        }
        return res;
    }
}