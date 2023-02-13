class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int max = nums[1] - nums[0];
        for(int i = 2; i < nums.length; i++) {
            int diff = nums[i] -nums[i - 1];
            if(max < diff) {
                max = diff;
            }
        }
        return max;
    }
}