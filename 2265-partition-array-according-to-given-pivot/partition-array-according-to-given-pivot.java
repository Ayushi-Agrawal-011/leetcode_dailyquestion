class Solution {
    public int[] pivotArray(int[] nums, int x) {
    int[]ans=new  int[nums.length];
    List<Integer> a=new ArrayList<>();
    List<Integer> b=new ArrayList<>();
    int c=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]<x){
            a.add(nums[i]);
        }
        else if(nums[i]>x){
            b.add(nums[i]);
        }
        else{
            c++;
        }
    }
    for(int i=0;i<a.size();i++){
        ans[i]=a.get(i);
    }
    int idx=a.size();
    while(c-->0){
        ans[idx]=x;
     
        idx++;
    }
    for(int i=0;i<b.size();i++){
         ans[idx]=b.get(i);
         idx++;
    }
    return ans;
    }
}