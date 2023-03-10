class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++) {
            int operand2 = target - nums[i];
            if(map.containsKey(operand2) && map.get(operand2) != i)
                return new int[]{i, map.get(operand2)};
        }
        return null;
    }
}