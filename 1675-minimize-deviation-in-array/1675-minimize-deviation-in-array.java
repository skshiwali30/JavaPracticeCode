class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> tSet = new TreeSet<>();
        for(int n : nums) {
            if(n % 2 == 1)
                tSet.add(2 * n);
            else
                tSet.add(n);
        }
        int deviation = Integer.MAX_VALUE;
        while(true) {
            int max_val = tSet.last();
            deviation = Math.min(deviation, max_val - tSet.first());
            if(max_val % 2 == 1)
                break;
            else {
                tSet.remove(max_val);
                tSet.add(max_val / 2);
            }
        }
        return deviation;
    }
}