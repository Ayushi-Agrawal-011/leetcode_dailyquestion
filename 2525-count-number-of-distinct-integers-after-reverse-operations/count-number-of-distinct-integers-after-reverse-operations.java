class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
            StringBuilder s=new StringBuilder(Integer.toString(x));
s.reverse();
            int y=Integer.parseInt(s.toString());
set.add(y);
        }
        return set.size();
        
    }
}