class Solution {
    public boolean wordPattern(String pattern, String s) {
           HashMap <String,Character> map=new HashMap<>();
      HashMap <Character,String> mp=new HashMap<>();
    
      String [] arr=s.split("\\s+");
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
    if(!map.get(arr[i]).equals(ch))
    return false;
}
     
      }
     return true;
    }
}