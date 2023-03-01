class Solution {
    public int divisorSubstrings(int num, int k) {
        int count = 0;
        int div = (int)Math.pow(10, k);
        for (int n = num; n > 0; n = n/10) {
            int subNum = n % div;
            if(subNum != 0 && num % subNum == 0)
                count++;
            if (n / div == 0)
                break;
        }
        return count;
    }
}