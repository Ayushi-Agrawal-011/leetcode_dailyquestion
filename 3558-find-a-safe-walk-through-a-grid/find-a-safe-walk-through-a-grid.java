class Solution {
       int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public boolean findSafeWalk(List<List<Integer>> grid2, int health) {
        int m = grid2.size();
int n = grid2.get(0).size();
int[][] grid = new int[m][n];

for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
        grid[i][j] = grid2.get(i).get(j);
    }
}
     
        Queue<Pair> q=new LinkedList<>();
         int[][] bestHealth = new int[m][n];
        for (int[] row : bestHealth)
            Arrays.fill(row, -1);

        int startHealth = health - grid[0][0];
        if (startHealth <= 0) return false;

    
        bestHealth[0][0] = startHealth;
        q.add(new Pair(0,0,health-grid[0][0]));
      
        while(!q.isEmpty()){
            Pair rp=q.poll();
         
            if(rp.row==m-1 && rp.col==n-1)
            return true;
         
           for(int[]d:dir){
            int nr=rp.row+d[0];
            int nc=rp.col+d[1];
            
                if (nr < 0 || nc < 0 || nr >= m || nc >= n)
                    continue;
         int nh=rp.health-grid[nr][nc];
         if(nh<=0)
         continue;
         if (nh > bestHealth[nr][nc]) {
                    bestHealth[nr][nc] = nh;
                    q.add(new Pair(nr, nc, nh));
                }
             

           }

        }
return false;
    }
    class Pair{
        int row;
        int col;
        int health;
        public Pair(int row,int col,int health){
            this.row=row;
            this.col=col;
            this.health=health;
        }
    }
}