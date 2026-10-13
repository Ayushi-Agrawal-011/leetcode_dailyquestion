class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
int si=0,count=t.length(),ans=Integer.MAX_VALUE;
 int start = 0;
for(int ei=0;ei<s.length();ei++){
    char ch=s.charAt(ei);
       if (map.containsKey(ch)) {
      if (map.get(ch) > 0) {
                    count--;
                }
                map.put(ch, map.get(ch) - 1);
            }
    while(count==0){
        if(ei-si+1<ans){
            ans=ei-si+1;
     start=si;
        }
              char c=s.charAt(si);
         if (map.containsKey(c)) {
  
        map.put(c,map.getOrDefault(c,0)+1);
        if(map.get(c)>0){
count++;
        }}
        si++;
    }

  
}
return ans == Integer.MAX_VALUE  ? "" : s.substring(start, start + ans);
    }
}