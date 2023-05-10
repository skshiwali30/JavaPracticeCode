class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(i == 0 || nums[i] != nums[i - 1]) {
                int low = i + 1;
                int high = nums.length - 1;
                while(low < high) {
                    int sum = nums[i] + nums[low] + nums[high];
                    if(Math.abs(target - sum) < Math.abs(closest))
                        closest = target - sum;
                    if(sum < target)
                        low++;
                    else
                        high--;
                }
            }
        }
        return target - closest;
    }
}