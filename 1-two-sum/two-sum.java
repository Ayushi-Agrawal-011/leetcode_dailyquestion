class Solution {
    public int[] twoSum(int[] nums, int target) {
      int[] arr=new int[2];

  int c=0,d=0;
for(int i=0;i<nums.length;i++){
    int a=nums[i];
    int b=target-a;
int r=s(nums,b,0,i);
//System.out.println(r);
    if(r!=-1){
c=i;
d=r;
arr[0]=c;
arr[1]=d;
return arr;
    }}

    return arr;

}
   public int s(int[] nums,int item,int i,int p){
    if(i>=nums.length)
    return -1;
    if(nums[i]==item && i!=p)
    return i;
return s(nums,item,i+1,p);
   }

       
}