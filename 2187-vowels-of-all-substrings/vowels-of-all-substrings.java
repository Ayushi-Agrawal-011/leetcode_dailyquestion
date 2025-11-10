class Solution {
    public long countVowels(String s) {
  Set<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
long ans=0;
        long[] dp=new long[s.length()+1];
        for(int i=1;i<s.length()+1;i++){
            if(vowels.contains(s.charAt(i-1)))
            dp[i]=i+dp[i-1];
            else
            dp[i]=dp[i-1];
        
            ans+=dp[i];
        }
        return ans;
    }
  
}