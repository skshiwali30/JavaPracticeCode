class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<Integer>();
        // base case
        if(arr.length == k) {
            for(int i = 0; i < k; i++) {
                res.add(arr[i]);
            }
            return res;
        }
         
        // binary search to find closest element
        int start = 0;
        int end = arr.length;
        while(start < end) {
            int mid = (start + end) / 2;
            if(arr[mid] < x)
                start = mid + 1;
            else
                end = mid;    
        }
        
        // Sliding window bounds- 
        start = start - 1;
        end = start + 1;
        while(end - start - 1 < k) {
            if(start == -1) {
                end++;
                continue;
            }
            if(end == arr.length || (Math.abs(arr[start] - x) <= Math.abs(arr[end] - x)))
                start--;
            else
                end++;
        }
        
        for(int i = start + 1; i < end; i++) {
            res.add(arr[i]);
        }
        return res;
    }
}