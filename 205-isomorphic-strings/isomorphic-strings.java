class Solution {
    public boolean isIsomorphic(String s, String t) {
      return   wordPattern(s,t);
    }
      public boolean wordPattern(String pattern, String s) {
           HashMap <Character,Character> map=new HashMap<>();
      HashMap <Character,Character> mp=new HashMap<>();
    char[] arr = s.toCharArray(); 
   
        if (pattern.length() != arr.length) return false;
      for(int i=0;i<arr.length;i++){
        char ch=pattern.charAt(i);
if(!mp.containsKey(ch)) {
mp.put(ch,arr[i]);
}
else {
    if(!mp.get(ch).equals(arr[i]))
    return false;
}
if(!map.containsKey(arr[i])) {
map.put(arr[i],ch);
}
else {
    if(!(map.get(arr[i])==ch))
    return false;
}
     
      }
     return true;
    }
}