class Solution {
    public int minimumCost(int[] nums, int k) {
      long available=k;
    long cost=1;
   long sum=0;
    for(int i=0;i<nums.length;i++){
        if(available>=nums[i]){
            available-=nums[i];
        }
        else{
         long need=nums[i]-available;
         long refill=(need+k-1)/k;
          long a = refill;
                long b = (2 * cost + refill - 1);

                // divide by 2 before multiplication to avoid overflow
                if (a % 2 == 0)
                    a /= 2;
                else
                    b /= 2;

                sum = (sum + ((a % 1000000007) * (b % 1000000007)) % 1000000007) % 1000000007;
       
         available+=refill*k;
         cost+=refill;

            available-=nums[i];
        }

    }
    return (int)(sum % 1000000007);

    }
}