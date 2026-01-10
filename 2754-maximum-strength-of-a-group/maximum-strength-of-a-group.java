class Solution {
    public long maxStrength(int[] nums) {
        return fn(nums,0,false,1);
    }
    public long fn(int[]nums,int i,boolean notaken,long p){
        if(i>=nums.length){
            return notaken?p:Integer.MIN_VALUE;
        }
        long a=fn(nums,i+1,true,p*nums[i]);
        long b=fn(nums,i+1,notaken,p);
        return Math.max(a,b);
    }

}