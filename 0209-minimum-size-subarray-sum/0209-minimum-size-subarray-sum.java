class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0, min = Integer.MAX_VALUE, sum = 0;
        int ws = 0;
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