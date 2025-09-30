class Solution {
   
    public static int lengthOfLongestSubstring(String s) {
       
    HashMap<Character,Integer> mp=new HashMap<>();
        int si=0,ei=0;
        int ans=0;
        while(ei<s.length()){
            char ch=s.charAt(ei);
           
            mp.put(ch,mp.getOrDefault(ch,0)+1);
         
            while(mp.get(ch)>1){
                char a=s.charAt(si);
                mp.put(a,mp.getOrDefault(a,0)-1);
                
                 
                 si++;
            }
         
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
}}