class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        if(profits == null || profits.length == 0)
            return w;
        int n = profits.length;
        PriorityQueue<Integer> minCapital = new PriorityQueue<Integer>(new Comparator<Integer>() {
            public int compare(Integer A, Integer B) {
                return capital[A] - capital[B];
            }
        });
        
        PriorityQueue<Integer> maxProfit = new PriorityQueue<Integer>((A, B) -> profits[B] - profits[A]);
        
        for(int i = 0; i < n; i++)
            minCapital.add(i);
        
        for(int j = 0; j < k; j++) {
           while(!minCapital.isEmpty() && w >= capital[minCapital.peek()]) {
               maxProfit.add(minCapital.poll());
           }
            if(maxProfit.isEmpty())
                break;
            w = w + profits[maxProfit.poll()];
        }
        return w;
    }
}