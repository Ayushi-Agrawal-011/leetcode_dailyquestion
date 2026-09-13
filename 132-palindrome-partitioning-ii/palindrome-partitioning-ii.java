class Solution {
    public int minCut(String s) {
          int n = s.length();

        int[] dp = new int[n + 1];


        return fn(s, dp,0)-1;
    }
     int fn(String s,int[]dp,int i){
        if(i>=s.length())
        return 0;
        if(dp[i]!=0)
        return dp[i];
        int ans=(int)1e9;
        for(int j=i;j<s.length();j++){
            if(isPalindrome(i,j,s)){
        ans=Math.min(ans,1+fn(s,dp,j+1));
            }
        }
        return dp[i]=ans;
    }

     public boolean isPalindrome(int i, int j, String str) {
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

}