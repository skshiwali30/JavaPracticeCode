class Solution {
    public int maxArea(int[] height) {
        int start = 0, end = height.length - 1, maxCap = 0;
        while(start < end) {
            int vLine = Math.min(height[start], height[end]);
            int distance = end - start;
            int cap = vLine * distance;
            maxCap = Math.max(maxCap, cap);
            if(height[start] <= height[end])
                start++;
            else
                end--;
        }
        return maxCap;
    }
}