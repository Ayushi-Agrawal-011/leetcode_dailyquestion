class Solution {
    public long gcdSum(int[] nums) {
    int[]left=new int[nums.length];
       int[]pre=new int[nums.length];
    left[0]=nums[0];
    for(int i=1;i<nums.length;i++){
        left[i]=Math.max(left[i-1],nums[i]);
    }    
   for(int i=0;i<nums.length;i++){
pre[i]=gcd(nums[i],left[i]);
   } 
   Arrays.sort(pre);
   int i=0;
   int j=nums.length-1;
   long ans=0;
   while(i<j){
 ans+=gcd(pre[i],pre[j]);
 i++;
 j--;

   }
   return ans;
    }
    public int gcd(int a,int b){
        if(b%a==0)
        return a;
        return gcd(b%a,a);
    }
}