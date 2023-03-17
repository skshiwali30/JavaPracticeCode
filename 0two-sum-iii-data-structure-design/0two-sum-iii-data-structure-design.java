class TwoSum {

    private List<Integer> res;
    private boolean isSorted;
    public TwoSum() {
        this.res = new ArrayList<Integer>();
        this.isSorted = false;
    }
    
    public void add(int number) {
        res.add(number);
        isSorted = false;
    }
    
    public boolean find(int value) {
        if(!isSorted) {
            Collections.sort(res);
            isSorted = true;
        }
        int low = 0;
        int high = res.size() - 1;
        while(low < high) {
            int sum = res.get(low) + res.get(high);
            if(sum == value)
                return true;
            else if(sum < value)
                low++;
            else
                high--;
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */