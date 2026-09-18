class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
         List<Integer> ans=new ArrayList<>();
         int i=0;
         for(String s:words){
            int idx=s.indexOf(x);
            if(idx!=-1)
            ans.add(i);
            i++;
         }
         return ans;
    }
}