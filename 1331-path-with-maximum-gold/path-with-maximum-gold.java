class Solution {
    public int getMaximumGold(int[][] grid) {
        int ans=0;
     for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]!=0){
                ans=Math.max(ans,MaxGold(grid,i,j));
            }
        }
     }   
     return ans;
    }
  	public static int MaxGold(int[][]board,int cr,int cc) {
	
		if (cr < 0 || cc < 0 || cr >= board.length || cc >= board[0].length ||board[cr][cc]==0) {
			return 0;
		}
        int b=0;
        int a=board[cr][cc];
		board[cr][cc]=0;
int[] r = { 1, -1, 0, 0 };
		int[] c = { 0, 0, -1, 1 };
		for (int i = 0; i < c.length; i++) {// 4
			 b=Math.max(b,MaxGold(board, cr + r[i], cc + c[i]));
			
			
		}
		board[cr][cc]=a;
		return b+a;
	}
}