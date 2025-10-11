class Solution {
    public boolean canPlaceFlowers(int[]nums, int r) { int c=0;
    for(int i=0;i<nums.length && c<r;i++){
        if(nums[i]==0){
            int p=0,q=0;
           if(i-1>=0 && nums[i-1]==0){
            p=1;
           } 
           else if(i==0)
           p=1;
            if(i+1<nums.length && nums[i+1]==0){
            q=1;
           } 
           else if(i==nums.length-1)
           q=1;
           if(p==1 && q==1){
            c++;

            nums[i]=1;
           }
        }
    }
    return c==r;
       
    }
}