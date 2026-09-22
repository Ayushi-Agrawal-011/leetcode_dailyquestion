class Solution {
    public int maxVowels(String s, int k) {
        List<Character> map=new ArrayList<>();
        int ei=0,si=0;
        int ans=0;

         int count = 0;
        while(ei<s.length()){
            //if(isvowel(ch))
            map.add(s.charAt(ei));
              if(isVowel(s.charAt(ei)))
                count++;
            while(map.size()>k && si<=ei){
                 if(isVowel(s.charAt(si)))
                    count--;

                map.remove(Character.valueOf(s.charAt(si))); 
                si++; 
            }
            
          
            ans=Math.max(ans,count);
ei++;
        }
return ans;

    }
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u';
    }
}