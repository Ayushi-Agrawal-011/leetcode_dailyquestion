class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) { List<String> ll=new ArrayList<>();
    for(int i=0;i<words.length;i++){
        if(wordPattern(pattern,words[i]))
        ll.add(words[i]);
    }
        
     return ll;   
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