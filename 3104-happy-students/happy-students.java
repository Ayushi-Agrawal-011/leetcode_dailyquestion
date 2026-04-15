class Solution {
    public int countWays(List<Integer> nums) {
      Collections.sort(nums);
      int c=1;
      int n=nums.size();
        for(int i=0;i<nums.size();i++){
             int x=nums.get(i);
             int a=i;
             int b=nums.size()-i;
             if ((i == 0 || nums.get(i - 1) < i) &&
                (i == n || nums.get(i) > i)) {
                c++;
            }
        }
        return c;
    }
}