class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0, sum = 0, ws = 0;
        int min = Integer.MAX_VALUE;
        while(end < nums.length) {
            sum = sum + nums[end];
            while(sum >= target) {
                ws = end - start + 1;
                min = Math.min(min, ws);
                sum = sum - nums[start++];
            }
            end++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}