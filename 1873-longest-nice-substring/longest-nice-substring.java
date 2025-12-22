class Solution {
    public String longestNiceSubstring(String s) {
        StringBuilder sb=new StringBuilder();
        int c=0;
        int d=0;
        List<String> ll=new ArrayList<>();
       List<String> res=new ArrayList<>();
        for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				if(fn(s.substring(i,j+1))){
                    ll.add(s.substring(i,j+1));
                      res.add(s.substring(i,j+1));
                }
			}
		}
          if(ll.size()==0)
        return "";
            if(ll.size()==1)
        return ll.get(0);
       
         int len = 0;
        for (String x : ll) {
            len = Math.max(len, x.length());
        }

for(String k:res){
if(k.length()==len)
return k;
}
      
        return "";

    }
    public  static boolean fn(String s){
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>=97 && ch<=122){
           
               char ch1 = (char)(ch - 32);
               if(s.indexOf(ch1)==-1)
               return false;
            }
            else  if(ch>=65 && ch<=90){
            char ch1 = (char)(ch + 32);
               if(s.indexOf(ch1)==-1)
               return false;
            }
        }
        return true;
    }
    
}