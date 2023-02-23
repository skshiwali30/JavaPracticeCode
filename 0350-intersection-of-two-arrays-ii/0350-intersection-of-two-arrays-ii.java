class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> mNums = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums1.length; i++) {
            mNums.put(nums1[i], mNums.getOrDefault(nums1[i], 0) + 1);
        }
        int count = 0;
        for(int n : nums2) {
            int k = mNums.getOrDefault(n, 0);
            if(k > 0) {
                nums1[count++] = n;
                mNums.put(n, k - 1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, count);
    }
}