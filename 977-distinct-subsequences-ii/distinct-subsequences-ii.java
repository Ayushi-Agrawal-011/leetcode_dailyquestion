
class Solution {
    public int distinctSubseqII(String s) {

        int[] dp = new int[s.length() ];
       

        Arrays.fill(dp, -1);

        return Print(s, dp, 0 ) ;
    }

    public static int Print(String ques, int[] dp, int i) {

        if (i == ques.length())
            return 0;

        if (dp[i] != -1)
            return dp[i];

    
        int ans=0;
Set<Character> set=new HashSet<>();
for(int j=i;j<ques.length();j++){
    if(!set.contains(ques.charAt(j))){
        set.add(ques.charAt(j));
ans=(ans+1+Print(ques,dp,j+1))%1000000007;
    }
}

       

        return dp[i]=ans;
    }
}