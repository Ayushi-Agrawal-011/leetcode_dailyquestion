class Solution {
    public int countBeautifulPairs(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
          for(int j=i+1;j<nums.length;j++){
            String s1=Integer.toString(nums[i]);
         
            int p=Integer.parseInt(String.valueOf(s1.charAt(0)+""));
   if(gcd(p,nums[j]%10)==1)
   c++;
          }  
        }
        return c;
    }
     int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}