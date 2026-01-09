class Solution {
    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
        int n=words.length;
        int[]dp=new int[n];
        int[]prev=new int[n];
        Arrays.fill(dp,1);
        Arrays.fill(prev,-1);
        int maxlen=1,maxend=0;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(groups[i]!=groups[j] && hdis(words[i],words[j])){
                    if(dp[j]+1>dp[i]){
                        dp[i]=dp[j]+1;
                        prev[i]=j;
                    }
                }
            }
           if(dp[i]>maxlen){
            maxlen=dp[i];
            maxend=i;
           } 
        }
        List<String> ans=new ArrayList<>();
        for(int cur=maxend;cur!=-1 ; cur=prev[cur]){
            ans.add(words[cur]);
        }
        Collections.reverse(ans);
        return ans;
    }
    public boolean hdis(String a,String b){
         if (a.length() != b.length()) return false;
        int c=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                c++;
                if(c>1)
                return false;
            }
        }
        return c==1;
    }
}