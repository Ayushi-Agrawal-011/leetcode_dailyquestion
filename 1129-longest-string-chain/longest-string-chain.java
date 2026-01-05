class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
    HashMap<String,Integer> map=new HashMap<>();
    int ans=1;
    for(String word:words){
        int c=1;
        for(int j=0;j<word.length();j++){
            String changed=word.substring(0,j)+word.substring(j+1,word.length());
            if(map.containsKey(changed)){
                c=Math.max(c,map.get(changed)+1);
            }
        }
        map.put(word,c);
        ans=Math.max(ans,c);
    }    
    return ans;
    }
}