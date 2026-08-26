class Solution {
    public long weightedSum(int[] parent, int[] nums) {
    int n=parent.length;
      long[]depth=new long[nums.length];
long ht=1, sum=0;
depth[0]=1;
     for(int i=0;i<depth.length;i++){
        if(depth[i] == 0)
                fn(i, parent, depth);
        ht=Math.max(ht,depth[i]);
     }
      for(int i = 0; i < n; i++){
            sum += (1L * nums[i]) *
                   (ht - depth[i] + 1);
        }

        return sum;

    }
   
   public long fn(int i,int[]parent,long[]depth){
    if(parent[i]==-1)
    return 1;
    if(depth[i]!=0)
    return depth[i];
    return depth[i]=fn(parent[i],parent,depth)+1;
   }
}