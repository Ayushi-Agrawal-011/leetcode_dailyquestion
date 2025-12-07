class Solution {
    public int characterReplacement(String s, int k) {
int res=0;
for(char ch='A';ch <='Z';ch++){
res=Math.max(res,flip(s,ch,k));
}
  return res;  
}
public static  int flip(String s,char ch,int k){
    int flips=0;
    int ei=0,si=0,ans=0;
    while(ei<s.length()){
        if(s.charAt(ei)!=ch){
            flips++;
        }
        while(flips>k && si<=ei){
            if(s.charAt(si)!=ch){
            flips--;
        }
        si++;
        }
        ans=Math.max(ans,ei-si+1);
        ei++;
    }
    return ans;
}

    
}
