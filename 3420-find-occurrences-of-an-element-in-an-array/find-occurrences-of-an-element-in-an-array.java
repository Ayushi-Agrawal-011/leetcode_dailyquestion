class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
     int[]ans=new int[queries.length];
     List<Integer> ll=new ArrayList<>();
     for(int i=0;i<nums.length;i++){
        if(nums[i]==x){
            ll.add(i);
        }
     }
     int j=0;
     int k=0;
     for(int i=0;i<queries.length;i++){
        if(queries[i]>ll.size()){
            ans[j]=-1;
        }
        else{
ans[j]=ll.get(queries[i]-1);

        }
        j++;
     }
     return ans;

    }
}