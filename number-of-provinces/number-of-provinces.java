class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int len = isConnected.length;
        
        for(int i = 0; i < len; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        
        // change the adjacency matrix to list
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(isConnected[i][j] == 1 && i != j) {
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }
        
        int[] visited = new int[len + 1];
        int count = 0;
        
        for(int i = 0; i < len; i++) {
            if(visited[i] == 0) {
                count++;
                dfs(i, adjList, visited);
            }
        }
        return count;
    }
    
    public void dfs(int node, ArrayList<ArrayList<Integer>> adjList, int[] vis) {
        vis[node] = 1;
        for(Integer ls : adjList.get(node)) {
            if(vis[ls] == 0)
                dfs(ls, adjList, vis);
        }
    }
}