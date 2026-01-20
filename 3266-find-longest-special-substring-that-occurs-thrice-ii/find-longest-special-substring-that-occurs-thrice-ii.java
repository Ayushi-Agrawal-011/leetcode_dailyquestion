class Solution {
    public int maximumLength(String s) {
    HashMap<String,Integer>map=new HashMap<>();
    for(int i=0;i<s.length();){
StringBuilder sb=new StringBuilder();
int j=i;
while(j<s.length() && s.charAt(j)==s.charAt(i)){
    sb.append(s.charAt(i));

    j++;
}  
map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
i=j;
  }
  int ans=-1;
  for(String k:map.keySet()){
    int len=k.length();
    int v=map.get(k);
    if(len==1 && v>=3)
    ans=Math.max(ans,1);
    else if(len>=2){
        String p=k.substring(0,len-1);
        if(v>=3){
           ans = Math.max(ans, len); 
        }
        else if (v == 2) {
                    ans = Math.max(ans, len - 1);
                } else if (v == 1 && map.containsKey(p)) {
                    ans = Math.max(ans, len - 1);
                } else if (len >= 3) {
                    ans = Math.max(ans, len - 2);
                }
    }}
    return ans;
  }
}