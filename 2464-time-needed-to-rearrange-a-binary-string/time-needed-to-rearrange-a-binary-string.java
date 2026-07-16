class Solution {
    public int secondsToRemoveOccurrences(String s) {
   int c=0,ans=0;
   for(char ch:s.toCharArray()){
   c+= ch=='0'?1:0;
   if(ch=='1' && c>0){
    ans=Math.max(ans+1,c);
   }
   }
   return ans;
    }
}