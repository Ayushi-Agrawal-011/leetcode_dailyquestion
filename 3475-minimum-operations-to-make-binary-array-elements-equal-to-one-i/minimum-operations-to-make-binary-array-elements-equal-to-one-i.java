class Solution {
    public int minOperations(int[] nums) {
     int n=nums.length;
     int i=0,j=2,c=0;
     while(j<n){
        if(nums[i]==0){
            c++;
            for(int k=i;k<i+3;k++){
                nums[k]=(nums[k]==0)?1:0;
            }}
            i++;
            j++;
        
     }
    for(int l=0;l<n;l++){
        if(nums[l]==0)
        return -1;
    }
    return c;

    }
}