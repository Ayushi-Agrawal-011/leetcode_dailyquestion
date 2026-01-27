class Solution {
    public int maxHeight(int[][] cuboids) {
          for (int[] c : cuboids) {
            Arrays.sort(c);
        }

        // sort all cuboids
        Arrays.sort(cuboids, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            if (a[1] != b[1]) return a[1] - b[1];
            return a[2] - b[2];
        });

       int n = cuboids.length;
     int[]   dp = new int[n];
        Arrays.fill(dp, -1);
        int ans=0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,fn(cuboids,i,dp));
        }
        return ans;
    }
    public int fn(int[][]cuboids,int i,int[]dp){
if(dp[i]!=-1)
return dp[i];
int ans=0;
for(int j=0;j<i;j++){
      if (cuboids[j][0] <= cuboids[i][0] &&
                cuboids[j][1] <= cuboids[i][1] &&
                cuboids[j][2] <= cuboids[i][2]) {

                ans = Math.max(ans, fn(cuboids,j,dp));
            }
}
return dp[i]=ans+cuboids[i][2];

    }
}