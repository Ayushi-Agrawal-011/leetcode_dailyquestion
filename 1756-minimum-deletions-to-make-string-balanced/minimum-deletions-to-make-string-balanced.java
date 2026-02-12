class Solution {
    public int minimumDeletions(String s) {
       int  ta=0;
       for(char ch:s.toCharArray()){
       if(ch=='a')
       ta++;
       }
       if(ta==0 || ta==s.length())
       return 0;
       int ans=Math.min(ta,s.length()-ta);
       int a_right=ta,b_left=0;
        for(char ch:s.toCharArray()){
       if(ch=='a')
       a_right--;
       
       else
       b_left++;
       ans=Math.min(ans,b_left+a_right);
}
return ans;
    }
}