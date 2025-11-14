class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int []left=new int[nums.length];
     for(int i=0;i<nums.length;i++){
        int d=Integer.MAX_VALUE;
        for(int j=i+1;j<nums.length;j++){
          if(j!=i && nums[j]>nums[i])  
            {d=Math.min(d,nums[j]);
            //System.out.println(nums[j]);
            break;}
        }
      if(d==Integer.MAX_VALUE)  
        for(int j=0;j<i;j++){
          if(j!=i && nums[j]>nums[i])  
            {d=Math.min(d,nums[j]);
            //System.out.println(nums[j]);
            break;}
        }
        if(d!=Integer.MAX_VALUE)
        left[i]=d;
        else 
        left[i]=-1;

     } 
     return left;  
    }
}