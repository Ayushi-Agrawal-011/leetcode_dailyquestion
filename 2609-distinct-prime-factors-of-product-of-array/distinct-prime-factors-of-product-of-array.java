class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            for(int i=2;i*i<=x;i++){
                while(x%i==0){
                    set.add(i);
                    x=x/i;
                }
            }
            if(x!=1)
            set.add(x);
        }
        return set.size();
    }
}