class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(i == 0 || nums[i] != nums[i - 1]) {
                int num1 = nums[i];
                int low = i + 1;
                int high = nums.length - 1;
                while(low < high) {
                    int sum = num1 + nums[low] + nums[high];
                    if(sum == 0) {
                        res.add(Arrays.asList(num1, nums[low++], nums[high--]));
                        while(low < high && nums[low] == nums[low - 1]) {
                            low++;
                        }
                    } else if(sum < 0)
                        low++;
                    else
                        high--;
                }
            }
        }
        return res;
    }
}