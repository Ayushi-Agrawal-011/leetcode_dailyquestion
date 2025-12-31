class Solution {
    public List<String> restoreIpAddresses(String s) {
       List<String> ans=new ArrayList<>();

fn(s,0,ans,"");
return ans;
        
    }
    public void fn(String s,int i,List<String> ans,String sb){
        if(i==s.length()){
            sb=sb.substring(0,sb.length()-1);
            if(sb.length()==s.length()+3)
            ans.add(sb);
            return;
        }

        for(int j=i+1;j<=i+3 && j<=s.length();j++){
            String sub=s.substring(i,j);
            if(sub.length()>1 && sub.charAt(0)=='0')
            continue;
            int n=Integer.parseInt(sub);
            if(n>=0 && n<=255){
                fn(s,j,ans,sb+sub+".");
            }


        }
    }
  
}