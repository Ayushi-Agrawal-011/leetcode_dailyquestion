class Solution {
    public List<String> addOperators(String num, int target) {
   
      List<String> ans=new ArrayList<>();
 StringBuilder sb = new StringBuilder();
fn(num,ans,sb,target,0,0);
return ans;
        
    }
    public void fn(String s,List<String> ans,StringBuilder sb,int target,long curr,long prev){
        if(0==s.length()){
            if(curr==target)
            ans.add(sb.toString());
            return ;
        }

        for(int j=1; j<=s.length();j++){
      String p=s.substring(0,j);
      if(p.length()>1 && p.charAt(0)=='0')
      break;
      int k=p.length();
      long r=Long.parseLong(p);
           if(sb.length()==0){
            fn(s.substring(j),ans,sb.append(r),target,r,r);
             sb.delete(sb.length()-k,sb.length()) ;
           }
         
               else{
            fn(s.substring(j),ans,sb.append("+"+r),target,curr+r,r);    

            sb.delete(sb.length()-k-1,sb.length()) ;
              fn(s.substring(j),ans,sb.append("-"+r),target,curr-r,-r);    

            sb.delete(sb.length()-k-1,sb.length()) ;
             fn(s.substring(j),ans,sb.append("*"+r),target,curr-prev+prev*r,prev*r);    

            sb.delete(sb.length()-k-1,sb.length()) ;
               }
       


        }
    }

}