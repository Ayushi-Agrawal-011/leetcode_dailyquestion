class Solution {
    public int[] searchRange(int[] nums, int target) {
       int i=0,j=nums.length/2+1;
        int []arr=new int[2];
        Arrays.fill(arr,-1);
        if(nums.length==0)
        return arr;
        int c=0 ,d=0;
        while(i<j){
if(nums[i]==target && c==0){
    arr[0]=i;
    c=1;
    int k=i;
    while(k<nums.length && nums[k]==target){
        arr[1]=k;
        k++;
        d=1;
    }

    

}
i++;}
if(c==1 ){
    return arr;

}
else{
    i=nums.length/2+1;
    j=nums.length;
     while(i<j){
if(nums[i]==target && c==0){
    arr[0]=i;
    c=1;
    int k=i;
    while(k<j && nums[k]==target){
        arr[1]=k;
        k++;
        d=1;
    }
    
    

}
i++;

}

        
}
      return arr;  
    }
}