class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start = 0, end = 0, count = 0, sum = 0;
        while(end < arr.length) {
            int windowSize = end - start + 1;
            sum += arr[end]; 
            if(windowSize < k)
                end++;
            else if(windowSize == k) {
                if(sum/k >= threshold)
                    count++;
                end++;
                sum = sum - arr[start];
                start++;
            }
        }
        return count;
    }
}