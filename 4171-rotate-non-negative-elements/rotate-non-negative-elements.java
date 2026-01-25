class Solution {
    public int[] rotateElements(int[] nums, int k) {
    List<Integer> ll=new ArrayList<>();
    for(int x:nums){
        if(x>=0)
        ll.add(x);
    }
    int n=ll.size();
    if(n==0)
    return nums;
     k=k%n;
    if(k==0)
    return nums;
   List<Integer> rotated = new ArrayList<>();
        rotated.addAll(ll.subList(k, n)); // last k elements
        rotated.addAll(ll.subList(0, k)); // first n-k element

      
        int idx = 0;
        for (int i = 0; i < nums.length; i++){
     
         if (nums[i] >= 0) {
                nums[i] = rotated.get(idx++);
            }
            }
        

        return nums;
    }
}