class Solution {
    public long maximumImportance(int n, int[][] roads) {
     long[]degree=new long[n];
     for(int i=0;i<roads.length;i++){
        degree[roads[i][0]]++;
      degree[roads[i][1]]++;
     }   
     long ans=0,j=1;
    
     Arrays.sort(degree);

     for(int i=0;i<n;i++){
        
        ans+=(j*degree[i]);
        j++;
     }
     return ans;
    }
}