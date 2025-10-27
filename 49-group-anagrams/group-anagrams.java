class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        HashMap<String,List<String>> map=new HashMap<>();
   List<List<String>> res=new ArrayList<>();
   for(int i=0;i<arr.length;i++){
    String key=GetKey(arr[i]);
    if(!map.containsKey(key))
    map.put(key,new ArrayList<>());
    map.get(key).add(arr[i]);

   }
   for(String k:map.keySet()){
  res.add(map.get(k));
   }
   return res;

}


       
       public String GetKey (String s){
        int [] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            sb.append(freq[i]+" ");
        }
        return sb.toString();
       }
    
    
}