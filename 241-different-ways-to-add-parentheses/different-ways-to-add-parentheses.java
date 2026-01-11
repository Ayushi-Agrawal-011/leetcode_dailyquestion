class Solution {
HashMap<String,List<Integer>> mp=new HashMap<>();
    public List<Integer> diffWaysToCompute(String s) {
        return p(s);
    }
    public List<Integer> p(String s){
        if(mp.containsKey(s))
        return mp.get(s);
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*'){
            List<Integer> left=p(s.substring(0,i));
            List<Integer> right=p(s.substring(i+1));
for(int x:left){
    for(int y:right){
        if(ch=='+')
        ans.add(x+y);
      else    if(ch=='-')
        ans.add(x-y);
        else
         ans.add(x*y);
    }
}

            }
        }
        if(ans.isEmpty())
        ans.add(Integer.parseInt(s));
      //  mp.put(s,ans);
        return  ans;
     

    }
}