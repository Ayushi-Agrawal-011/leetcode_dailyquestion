class Solution {
    public boolean checkPowersOfThree(int n) {
        for(int i=1;i<(1<<16);i++){
            int a=nthNumber(i);
          
            if(a==n)
            return true;
        }
      return false;
    }
    public static int nthNumber(int n) {
		int mul = 1;
		int ans = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				ans += mul;
			}
			
			mul = mul * 3;
			n >>= 1;
		}
		return ans;
	}
}