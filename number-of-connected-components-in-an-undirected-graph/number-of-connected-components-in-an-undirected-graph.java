class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        
        for(int i = 0; i < n; i++) 
            adjList.add(new ArrayList<Integer>());
        
        for(int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        
        int[] visited = new int[n + 1];
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(visited[i] == 0) {
                count++;
                dfs(adjList, visited, i);
            }
        }
        return count;
    }
    
    public void dfs(List<List<Integer>> adjList, int[] vis, int node) {
        vis[node] = 1;
        for(Integer ele : adjList.get(node)) {
            if(vis[ele] == 0)
                dfs(adjList, vis, ele);
        }
    }
}