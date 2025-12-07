class Solution {
   
    public static int lengthOfLongestSubstring(String s) {
       
   HashMap<Character,Integer> map=new HashMap<>();
   int ei=0,si=0,ans=0;
   while(ei<s.length()){
    char ch=s.charAt(ei);
    map.put(ch,map.getOrDefault(ch,0)+1);
    while(map.get(ch)>1){
char a=s.charAt(si);
  map.put(a,map.getOrDefault(a,0)-1);
  si++;
    }
    ans=Math.max(ans,ei-si+1);
    ei++;
   }
   return ans;
}}