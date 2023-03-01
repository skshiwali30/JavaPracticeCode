class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if(hm.containsKey(curr) && i - hm.get(curr) <= k)
                return true;
            else
                hm.put(curr, i);
        }
        
        return false;
    }
}