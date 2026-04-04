class Solution {
    public long sumAndMultiply(int n) {
        if(n==0)
        return 0;
       long sum=0;
       String s=Long.toString(n) ;
       String t="";
       for(char ch:s.toCharArray()){
if(ch>=48 && ch<=57 && ch!='0'){
    t+=ch;
    sum+=ch-'0';
}
       }
    return Long.parseLong(t)*sum;
    }
}