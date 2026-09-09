class Solution {
    public int numMatchingSubseq(String s, String[] words) {
       int ans = 0; 
        HashMap<String, Boolean> map = new HashMap<>();
        for(String sk:words){
            if(map.containsKey(sk)){
                if(map.get(sk))
                ans++;
            }
            else{
                boolean t= issubsequence(s,sk);
                map.put(sk,t);
                if(t)
                ans++;
            }
        }
     
   
     return ans; 
    }
    public boolean issubsequence(String s,String t){
    int i=0,j=0;
    while(i<s.length() && j<t.length()){
        if(s.charAt(i)==t.charAt(j)){
            j++;
        }
        i++;
    }
    return j==t.length();
    }
    
}