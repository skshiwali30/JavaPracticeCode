class Solution {
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        
        for(int i = 0; i < n; i++)
            adjList.add(new ArrayList<>());
        
        for(int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        
        Set<Integer> seen = new HashSet<>();
        
        return dfs(0, -1, adjList, seen) && seen.size() == n;
    }
    
    public boolean dfs(int node, int parent, List<List<Integer>> adjList, Set<Integer> seen) {
        if(seen.contains(node))
            return false;
        seen.add(node);
        for(int n : adjList.get(node)) {
            if(parent != n) {
                boolean result = dfs(n, node, adjList, seen);
                if(!result)
                    return false;
            }
        }
        return true;
    }
}