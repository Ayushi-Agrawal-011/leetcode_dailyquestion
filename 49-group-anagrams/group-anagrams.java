class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
    List<List<String>>  res=new ArrayList<>();

HashMap<String,List<String>> map=new HashMap<>();
for(int i=0;i<arr.length;i++){
    String key=GetKey(arr[i]);
    map.putIfAbsent(key,new ArrayList<>());
    map.get(key).add(arr[i]);
}
for(String x:map.keySet()){
    List<String> curr=new ArrayList<>();
    for(String y:map.get(x)){
        curr.add(y);
    }
    res.add(curr);
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