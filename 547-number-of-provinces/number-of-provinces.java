class Solution {
    public int findCircleNum(int[][] isConnected) {
        int c=0;
        int n=isConnected.length;
        boolean[]visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,isConnected,visited);
                c++;
            }
        }
        return c;
    }
     private void dfs(int i, int[][] isconnected, boolean[] visited) {
        visited[i]=true;
        for(int j=0;j<isconnected.length;j++){
            if(isconnected[i][j]==1 && !visited[j])
            dfs(j,isconnected,visited);
        }
     }
}