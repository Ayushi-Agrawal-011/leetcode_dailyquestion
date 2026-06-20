class Solution {
    public List<String> letterCasePermutation(String s) {
     List<String> ans=new ArrayList<>();
     fn(s,ans,"",0);
return ans;
    }
    public void fn(String s,List<String> ll,String ans,int i){
        if(s.length()==i){
            ll.add(ans);
            return;
        }
        
            char ch=s.charAt(i);
            if(ch>=65 && ch<=90){
            fn(s,ll,ans+ch,i+1);
             fn(s,ll,ans+(char)(ch+32),i+1);
            }
            else   if(ch>=97 && ch<=122){
            fn(s,ll,ans+ch,i+1);
             fn(s,ll,ans+(char)(ch-32),i+1);
            }
            else
            fn(s,ll,ans+ch,i+1);
        
    }

}