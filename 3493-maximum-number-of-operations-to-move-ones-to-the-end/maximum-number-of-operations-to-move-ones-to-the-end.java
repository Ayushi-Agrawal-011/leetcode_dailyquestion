class Solution {
    public int maxOperations(String s) {
       int ans=0,c=0,d=0;
       for(char ch:s.toCharArray()){
        if(ch=='1'){
            c++;
        d++;
         
        }
        else{
      if(d>0){
        ans+=c;
        d=0;
      }

        

        }
       }
       return ans;
    }
}