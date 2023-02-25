class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1)
            return 0;
        
        int minPrice = Integer.MAX_VALUE;
        int diff = 0;
        for(int i = 0; i < prices.length; i++) {
            diff = Math.max(diff, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return diff;
    }
}