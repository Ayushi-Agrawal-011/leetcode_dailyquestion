class Solution {
    public int primeSubarray(int[] nums, int k) {

     int n=nums.length;
     boolean[]p=new boolean[n];
     for(int i=0;i<n;i++){
        p[i]=isPrime(nums[i]);
     }
     int lastPrime = -1, secondLastPrime = -1;
     TreeMap<Integer,Integer> map=new TreeMap<>();
     int si=0,ei=0;
     int c=0;
     long ans=0;
     while(ei<n){
        if(p[ei]){
             map.put(nums[ei], map.getOrDefault(nums[ei], 0) + 1);
             c++;
               secondLastPrime = lastPrime;
                lastPrime = ei;
        }
        while(!map.isEmpty() && map.lastKey() - map.firstKey() > k){
            if(p[si]){
                c--;
                  map.put(nums[si], map.getOrDefault(nums[si], 0) - 1);
                    if (map.get(nums[si]) == 0) map.remove(nums[si]);

            }
            si++;
        }
        if(c>=2){
            ans+=(secondLastPrime - si + 1);
        }
     ei++;
     }
     
    
       return (int)ans;}

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0)
                return false;

        return true;
    }
}
