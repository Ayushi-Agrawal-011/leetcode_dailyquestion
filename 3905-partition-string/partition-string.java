class Solution {
    public List<String> partitionString(String s) {
        List<String> ans=new ArrayList<>();
        List<String> ll = new ArrayList<>(); 
        Set<String> set = new HashSet<>(); 
        String curr = ""; 
        for (int i = 0; i < s.length(); i++) 
        { curr += s.charAt(i);
         if (!set.contains(curr)) 
         { ll.add(curr);
          set.add(curr); 
          curr = ""; } 
          } 
          return ll;
    }
}