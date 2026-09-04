class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[]ans=new int[nums.length];
        int n=nums.length;
        List<Integer> even=new ArrayList<>();
         List<Integer> odd=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i%2==0)
            even.add(nums[i]);
            else
            odd.add(nums[i]);
        }
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        int x=0,y=0;
        for(int i=0;i<n;i++ ){
if(i%2==0){
    nums[i]=even.get(x);
x++;
}
else{
    nums[i]=odd.get(y);
    y++;
}
        }
        return nums;
    }
}