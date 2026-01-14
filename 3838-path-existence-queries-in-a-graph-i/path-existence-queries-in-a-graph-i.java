class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        boolean[]ans=new boolean[queries.length];
        int idx=0;
        int[]c=new int[n];
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]<=maxDiff){
                c[i]=idx;
            }
            else{
                idx++;
                 c[i]=idx;
            }
        }
        for(int i=0;i<queries.length;i++){
            int u=queries[i][0];
            int v=queries[i][1];
            if(c[u]==c[v])
            ans[i]=true;
            else
            ans[i]=false;
        }
        return ans;
    }
}